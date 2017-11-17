/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author janith
 */
public class ProjectDTO implements Serializable{
    private String projectID;
    private String projName;
    private String developer;
    private String date;
    private String description;
    private ArrayList<MilestoneDTO> milestones;
    private ArrayList<UserDTO> contributers;
    private ArrayList<String> fileList;

    public ProjectDTO(String projectID, String projName, String developer, String date, String description, ArrayList<MilestoneDTO> milestones, ArrayList<UserDTO> contributers, ArrayList<String> fileList) {
        this.projectID = projectID;
        this.projName = projName;
        this.developer = developer;
        this.date = date;
        this.description = description;
        this.milestones = milestones;
        this.contributers = contributers;
        this.fileList = fileList;
    }

    /**
     * @return the projectID
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * @return the projName
     */
    public String getProjName() {
        return projName;
    }

    /**
     * @return the developer
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the milestones
     */
    public ArrayList<MilestoneDTO> getMilestones() {
        return milestones;
    }

    /**
     * @return the contributers
     */
    public ArrayList<UserDTO> getContributers() {
        return contributers;
    }

    /**
     * @return the files
     */
    public ArrayList<String> getFileList() {
        return fileList;
    }

}
