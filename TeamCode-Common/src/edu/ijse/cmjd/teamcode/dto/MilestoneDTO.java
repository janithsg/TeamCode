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
public class MilestoneDTO implements Serializable {
    private String projectId;
    private boolean isDone;
    private String description;

    public MilestoneDTO(String projectId, boolean isDone, String description) {
        this.projectId = projectId;
        this.isDone = isDone;
        this.description = description;
    }

    /**
     * @return the projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @return the isDone
     */
    public boolean isIsDone() {
        return isDone;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
    
}
