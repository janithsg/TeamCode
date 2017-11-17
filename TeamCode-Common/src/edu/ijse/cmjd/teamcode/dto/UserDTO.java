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
public class UserDTO implements Serializable{
    private String username;
    private String firstName;
    private String lastName;
    private String profPicName;
    private int NoOfworkedProjects;
    private String utype;
    private byte[] picData;

    public UserDTO(String username, String firstName, String lastName, String profPicName, int NoOfworkedProjects, String utype, byte[] picData) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profPicName = profPicName;
        this.NoOfworkedProjects = NoOfworkedProjects;
        this.utype = utype;
        this.picData = picData;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the profPicName
     */
    public String getProfPicName() {
        return profPicName;
    }

    /**
     * @return the NoOfworkedProjects
     */
    public int getNoOfworkedProjects() {
        return NoOfworkedProjects;
    }

    /**
     * @return the utype
     */
    public String getUtype() {
        return utype;
    }

    /**
     * @return the picData
     */
    public byte[] getPicData() {
        return picData;
    }

}
