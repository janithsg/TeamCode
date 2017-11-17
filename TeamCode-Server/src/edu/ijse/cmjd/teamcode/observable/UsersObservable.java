/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.observable;

import edu.ijse.cmjd.teamcode.observer.UserObserver;
import java.util.ArrayList;

/**
 *
 * @author janith
 */
public class UsersObservable {
    private static ArrayList<UserObserver> usersList=new ArrayList<>();
    private static int NoOfOnline=0;
    
    public void addObserver(UserObserver user){
        usersList.add(user);
        NoOfOnline++;
    }
}
