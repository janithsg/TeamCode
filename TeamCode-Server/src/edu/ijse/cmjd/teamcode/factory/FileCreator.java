/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.cmjd.teamcode.factory;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author janith
 */
public class FileCreator {
    public static File getDataFile(String type) throws IOException{
        File file=null;
        
        switch(type){
            case "User":
                file=new File("./src/edu/ijse/cmjd/teamcode/datafiles/Users.txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                return file;
            case "Project":
                file=new File("./src/edu/ijse/cmjd/teamcode/datafiles/Projects.txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                return file;
            case "Milestones":
                file=new File("./src/edu/ijse/cmjd/teamcode/datafiles/Milestones.txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                return file;
        }
        
        return null;
    }
}
