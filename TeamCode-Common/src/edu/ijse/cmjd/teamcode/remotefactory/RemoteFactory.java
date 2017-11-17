/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.remotefactory;

import edu.ijse.cmjd.teamcode.controller.ProjectController;
import edu.ijse.cmjd.teamcode.controller.UserController;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author janith
 */
public interface RemoteFactory extends Remote{
    public UserController getUserController() throws RemoteException;
    public ProjectController getProjectController() throws RemoteException;
}
