/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.dao;

import edu.ijse.cmjd.teamcode.dto.LogInDTO;
import edu.ijse.cmjd.teamcode.dto.UserDTO;
import edu.ijse.cmjd.teamcode.factory.FileCreator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janith
 */
public class UsersDataAccess {
    
    private File userData=null;
    private static ReentrantReadWriteLock lock;

    public UsersDataAccess() {
        try {
            userData=FileCreator.getDataFile("User");
            lock = new ReentrantReadWriteLock();
        } catch (IOException ex) {
            Logger.getLogger(UsersDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public UserDTO verifyUser(LogInDTO loginData) throws FileNotFoundException, IOException{
        BufferedReader bufReader=null;
        FileReader fileReader=null;
        
        try {
            lock.readLock().lock();
            fileReader=new FileReader(userData);
            bufReader=new BufferedReader(fileReader);
            String line=null;
            
            while((line=bufReader.readLine())!=null){
                String data[]=line.split(",");
                       
                if(loginData.getUsername().equals(data[0]) && loginData.getPasswrd().equals(data[1])){
                    byte[] imgData=getImg(data[0]);

                    return new UserDTO(data[0],data[2],data[3],data[4],Integer.parseInt(data[5]),data[6],imgData);  
                }
            }
        } finally {
            lock.readLock().unlock();
            if (bufReader != null) {
                bufReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
        
        return null;
    }
    
    public boolean addUser(String data,byte[] imgData,String picName){
        try {
            lock.writeLock().lock();
            FileWriter fileWriter = null;
            PrintWriter printWriter = null;

            try {

                if (!userData.exists()) {
                    userData.createNewFile();
                }
                
                fileWriter = new FileWriter(userData, true);
                printWriter = new PrintWriter(fileWriter);

                printWriter.write(data);
                writeImg(imgData, picName);
                
                fileWriter.close();
                printWriter.close();
                
                return true;
            } catch (IOException ex) {
                Logger.getLogger(UsersDataAccess.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                if(fileWriter != null && printWriter != null){
                    fileWriter = null;
                    printWriter = null;
                }
            }

            return false;

        } finally {
            lock.writeLock().unlock();
        }
    }
    
    public boolean foundUname(String username) throws FileNotFoundException, IOException{
        BufferedReader bufReader=null;
        FileReader fileReader=null;
        
        try {
            lock.readLock().lock();
            fileReader=new FileReader(userData);
            bufReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufReader.readLine())!=null){
                String data[]=line.split(",");
                if(data[0].equals(username)){
                    return true;
                }else{
                    return false;
                }
            }
        } finally {
            lock.readLock().unlock();
            if (bufReader != null) {
                bufReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return true;
    }
    
    private void writeImg(byte[] imgData,String fname){
        try {
            FileOutputStream fos = null;
            
            fos = new FileOutputStream("./Data/ProfPics/"+fname);
            fos.write(imgData);
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsersDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsersDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    private byte[] getImg(String uname) throws FileNotFoundException, IOException{
        BufferedReader bufReader=null;
        FileReader fileReader=null;

        try {
            fileReader=new FileReader(userData);
            bufReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufReader.readLine())!=null){
                String data[]=line.split(",");

                if(!data[4].equals("none")){
                    if(data[0].equals(uname)){
                        String filename=data[4];
                        Path path = Paths.get("./Data/ProfPics/"+filename);
                        byte[] imgData = Files.readAllBytes(path);

                        return imgData;
                    }
                }
            }
        } finally {
            if (bufReader != null) {
                bufReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return null;
    }
}
