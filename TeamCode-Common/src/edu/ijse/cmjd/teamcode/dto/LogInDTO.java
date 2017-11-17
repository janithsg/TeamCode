/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.dto;

import java.io.Serializable;

/**
 *
 * @author janith
 */
public class LogInDTO implements Serializable{
    private String username;
    private String passwrd;

    public LogInDTO(String username, String passwrd) {
        this.username = username;
        this.passwrd = passwrd;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the passwrd
     */
    public String getPasswrd() {
        return passwrd;
    }

    
}
