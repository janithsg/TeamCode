/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.controller.Impl;

import edu.ijse.cmjd.teamcode.controller.UserController;
import edu.ijse.cmjd.teamcode.dto.LogInDTO;
import edu.ijse.cmjd.teamcode.dto.UserDTO;
import edu.ijse.cmjd.teamcode.dao.UsersDataAccess;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janith
 */
public class UserControllerImpl extends UnicastRemoteObject implements UserController{
    
    private final UsersDataAccess userDataAccess;
    
    public UserControllerImpl() throws RemoteException{
        userDataAccess=new UsersDataAccess();
    }
    
    @Override
    public UserDTO loginUser(LogInDTO loginData) throws RemoteException, ClassNotFoundException {
        UserDTO userData=null;
        try {
            userData = userDataAccess.verifyUser(loginData);
            if(userData!=null){
                return userData;
            }
        } catch (IOException ex) {
            Logger.getLogger(UserControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean registerUser(LogInDTO loginData,UserDTO userData) throws RemoteException, ClassNotFoundException {
        String picName=loginData.getUsername()+"_"+userData.getProfPicName();
        String data="\n"+loginData.getUsername()+","+loginData.getPasswrd()+","+userData.getFirstName()+","+userData.getLastName()+","+picName+","+Integer.toString(userData.getNoOfworkedProjects())+","+userData.getUtype();
        
        return userDataAccess.addUser(data,userData.getPicData(),picName);
    }

    @Override
    public boolean deleteUser(LogInDTO loginData) throws RemoteException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean foundUname(String uname) throws RemoteException, ClassNotFoundException {
        try {
            return userDataAccess.foundUname(uname); 
        } catch (IOException ex) {
            return false;
        }
    }
    
}
