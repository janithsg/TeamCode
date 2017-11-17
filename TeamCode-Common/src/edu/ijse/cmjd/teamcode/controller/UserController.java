/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.controller;

import edu.ijse.cmjd.teamcode.dto.LogInDTO;
import edu.ijse.cmjd.teamcode.dto.UserDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author janith
 */
public interface UserController extends Remote{
    public UserDTO loginUser(LogInDTO loginData) throws RemoteException,ClassNotFoundException;
    public boolean registerUser(LogInDTO loginData,UserDTO userData) throws RemoteException,ClassNotFoundException;
    public boolean deleteUser(LogInDTO loginData) throws RemoteException,ClassNotFoundException;
    public boolean foundUname(String uname) throws RemoteException,ClassNotFoundException;
}
