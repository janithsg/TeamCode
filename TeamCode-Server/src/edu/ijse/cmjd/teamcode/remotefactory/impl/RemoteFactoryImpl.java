/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.remotefactory.impl;

import edu.ijse.cmjd.teamcode.controller.Impl.ProjectControllerImpl;
import edu.ijse.cmjd.teamcode.controller.Impl.UserControllerImpl;
import edu.ijse.cmjd.teamcode.controller.ProjectController;
import edu.ijse.cmjd.teamcode.controller.UserController;
import edu.ijse.cmjd.teamcode.remotefactory.RemoteFactory;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author janith
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory{

    public RemoteFactoryImpl() throws RemoteException{
        
    }
    
    @Override
    public UserController getUserController() throws RemoteException{
        return new UserControllerImpl();
    }

    @Override
    public ProjectController getProjectController() throws RemoteException {
        return new ProjectControllerImpl();
    }
    
}
