/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.serverconnector;

import edu.ijse.cmjd.teamcode.controller.ProjectController;
import edu.ijse.cmjd.teamcode.controller.UserController;
import edu.ijse.cmjd.teamcode.remotefactory.RemoteFactory;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author janith
 */
public class ServerConnector {
    private static ServerConnector serverConnector;
    private UserController userController;
    private ProjectController projectController;
    private final RemoteFactory remoteFactory;

    public ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        remoteFactory=(RemoteFactory)Naming.lookup("rmi://localhost:5050/TeamCode");
    }

    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if(serverConnector==null){
            serverConnector=new ServerConnector();
        }
        return serverConnector;
    }
    
    public UserController getUserController() throws RemoteException{
        if(userController==null){
            userController=remoteFactory.getUserController();
        }
        return userController;
    }
    
    public ProjectController getProjectController() throws RemoteException{
        if(projectController==null){
            projectController=remoteFactory.getProjectController();
        }
        return projectController;
    }
}
