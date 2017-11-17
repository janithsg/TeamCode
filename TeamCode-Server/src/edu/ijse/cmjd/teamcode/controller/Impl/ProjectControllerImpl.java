/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.controller.Impl;

import edu.ijse.cmjd.teamcode.controller.ProjectController;
import edu.ijse.cmjd.teamcode.dao.ProjectDataAccess;
import edu.ijse.cmjd.teamcode.dto.ProjectDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author janith
 */
public class ProjectControllerImpl extends UnicastRemoteObject implements ProjectController{
    
    private ProjectDataAccess projData;
    
    public ProjectControllerImpl() throws RemoteException{
        projData=new ProjectDataAccess();
    }
    
    @Override
    public boolean newProject(ProjectDTO data) throws RemoteException, ClassNotFoundException {
        return projData.createProject(data);
    }

    @Override
    public String getNewID() throws RemoteException, ClassNotFoundException {
        return projData.getNewID();
    }

}
