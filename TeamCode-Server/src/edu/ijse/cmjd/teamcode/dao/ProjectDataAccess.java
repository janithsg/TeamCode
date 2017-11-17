/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.dao;

import edu.ijse.cmjd.teamcode.dto.MilestoneDTO;
import edu.ijse.cmjd.teamcode.dto.ProjectDTO;
import edu.ijse.cmjd.teamcode.dto.UserDTO;
import edu.ijse.cmjd.teamcode.factory.FileCreator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janith
 */
public class ProjectDataAccess {
    
    private File projDataFile=null;
    private static ReentrantReadWriteLock lock;

    public ProjectDataAccess() {
        try {
            projDataFile=FileCreator.getDataFile("Project");
            lock = new ReentrantReadWriteLock();
        } catch (IOException ex) {
            Logger.getLogger(ProjectDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean createProject(ProjectDTO pdata){
        try {
            new File("./Data/Projects/"+pdata.getProjName()+"/src").mkdirs();
            new File("./Data/Projects/"+pdata.getProjName()+"/versions").mkdirs();
            new File("./Data/Projects/"+pdata.getProjName()+"/src/files.txt").createNewFile();
            new File("./Data/Projects/"+pdata.getProjName()+"/log.txt").createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(ProjectDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            lock.writeLock().lock();
            FileWriter fileWriter = null;
            PrintWriter printWriter = null;
            
            try { 
                // Project Data
                
                fileWriter = new FileWriter(projDataFile, true);
                printWriter = new PrintWriter(fileWriter);
                
                String data="\n"+pdata.getProjectID()+","+pdata.getProjName()+","+pdata.getDate()+","+pdata.getDeveloper()+","+pdata.getDescription();

                printWriter.write(data);
                
                fileWriter.close();
                printWriter.close();
                
                // Milestone Data
                
                File miles=FileCreator.getDataFile("Milestones");
                
                fileWriter = new FileWriter(miles, true);
                printWriter = new PrintWriter(fileWriter);
                
                for(MilestoneDTO mile:pdata.getMilestones()){
                    String mileData="\n"+pdata.getProjectID()+","+mile.getDescription();
                    printWriter.write(mileData);
                }

                fileWriter.close();
                printWriter.close();
                
                // Files Data
                File fList=new File("./Data/Projects/"+pdata.getProjName()+"/src/files.txt");

                for(String filename:pdata.getFileList()){
                    new File("./Data/Projects/"+pdata.getProjName()+"/src/"+filename).createNewFile();
                    
                    fileWriter = new FileWriter(fList, true);
                    printWriter = new PrintWriter(fileWriter);
                    
                    printWriter.write("\n"+filename);
                    
                    fileWriter.close();
                    printWriter.close();
                }
                
                // Done.
                
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
    
    public String getNewID(){
        BufferedReader bufReader=null;
        FileReader fileReader=null;
        
        try {
            lock.readLock().lock();
            fileReader=new FileReader(projDataFile);
            bufReader=new BufferedReader(fileReader);
            String line=null;
            
            String last="pro0000";
            
            while((line=bufReader.readLine())!=null){
                String data[]=line.split(",");
                    last=data[0];
            }
            
            String id="pro"+ Integer.toString(Integer.parseInt(last.substring(3))+1);
            bufReader.close();
            fileReader.close();
            
            return id;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProjectDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            lock.readLock().unlock();
            
        }
        
        return null;
    }
    
    public boolean checkData(ProjectDTO pdata){
        for(MilestoneDTO mile:pdata.getMilestones()){
            System.out.println(mile.getProjectId()+" - "+mile.getDescription()+" - "+mile.isIsDone());
        }
        for(String d:pdata.getFileList()){
            System.out.println(d);
        }
        
        return true;
    }
}
