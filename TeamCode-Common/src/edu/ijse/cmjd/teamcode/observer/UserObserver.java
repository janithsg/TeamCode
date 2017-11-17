/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.observer;

import java.rmi.Remote;

/**
 *
 * @author janith
 */
public interface UserObserver extends Remote {
    public void updateOnlineList();
}
