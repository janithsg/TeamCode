/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.controller;

import edu.ijse.cmjd.teamcode.dto.ProjectDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author janith
 */
public interface ProjectController extends Remote{
    public boolean newProject(ProjectDTO data) throws RemoteException,ClassNotFoundException;
    public String getNewID() throws RemoteException,ClassNotFoundException;
}
