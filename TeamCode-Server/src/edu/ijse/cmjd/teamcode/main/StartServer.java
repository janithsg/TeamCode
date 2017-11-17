/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.main;

import edu.ijse.cmjd.teamcode.remotefactory.impl.RemoteFactoryImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janith
 */
public class StartServer {
    public static void main(String[] args) {
        try {
            Registry thogaKadeRegistry=LocateRegistry.createRegistry(5050);
            thogaKadeRegistry.rebind("TeamCode",new RemoteFactoryImpl());
            System.out.println("Server Started.");
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
