/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteBuilder {

    String mainPath = "data/website/";
    String created = "Created ";

    public String buildWebsite(String name){
        String path = mainPath + name;
        //create the new directory based on the site name given in baseline.Solution43
        File newPath = new File(path);
        boolean isCreated = newPath.mkdirs();
        //return the directory
        if(isCreated){
            return created + path;
        }
        return "Website folder was not created";
    }

    public String createHTML(String name, String author){
        String path = mainPath + name + "/index.html";
        //Create a new html file based on the information in baseline.Solution43
        String indexContents = "<title>" + name + "</title>\n<meta>" + author + "</meta>";
        //Make a FileWriter, so it can fill the blank html file
        //with the title and meta tag along with the given information
        try(FileWriter html = new FileWriter(path)){
            html.write(indexContents);
            return created + path;
        } catch (IOException e) {
            System.out.println("An error occurred when creating the HTML file.");
            e.printStackTrace();
        }
        return "Index.html was not created.";
    }

    public String createCSS(String name){
        String path = mainPath + name + "/css";
        //create a new CSS folder based on the info in baseline.Solution43
        File newPath = new File(path);
        boolean isCreated = newPath.mkdirs();
        //return the folders directory
        if(isCreated){
            return created + path;
        }
        return "Css folder was not created";
    }

    public String createJS(String name){
        String path = mainPath + name + "/js";
        //create a new JS folder based on the info in baseline.Solution43
        File newPath = new File(path);
        boolean isCreated = newPath.mkdirs();
        //return the folders directory
        if(isCreated){
            return created + path;
        }
        return "Js folder was not created";
    }
}
