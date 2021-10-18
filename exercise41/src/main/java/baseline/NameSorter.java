/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
    //Create an arraylist that all methods in this class can access
    List<String> names = new ArrayList<>();

    public void readNames(String input) throws FileNotFoundException {
        File readFile = new File(input);
        //create an inputFile scanner using the file location
        //given in the argument
        Scanner inputFile = new Scanner(readFile);

        //Create a loop to scan each line in the input file
        while(inputFile.hasNextLine()){
            //if there is another line, add it to the names ArrayList
            names.add(inputFile.nextLine());
        }
        //Once the loop finishes we will have an array full of each persons'
        //first and last name

        //close input file
        inputFile.close();
    }

    public void sortNames(){
        //use the collections.sort method to sort all names
        //in alphabetical order
        names.sort(String::compareToIgnoreCase);
    }

    public void exportNames(String output) {
            //create an outputFile writer using the file location
            //given in the argument
            try (FileWriter outputFile = new FileWriter(output)) {

                //Create the formatting for the header of the file using names.size
                //for the number of names and a string of hyphens to separate the header
                //and contents of the file
                outputFile.write("Total of " + names.size() + " names\n");
                outputFile.write("-----------------\n");

                //create a loop to go through all the names
                for (String i : names) {
                    //adding each first and last name line by line
                    outputFile.write(i + "\n");
                }

                //close the output file
            } catch (IOException e) {
                System.out.println("An error occurred creating the file.");
                e.printStackTrace();
            }
    }
    //These two methods are for testing purposes
    public void nameList(List<String> name){
        this.names = name;
    }
    public List<String> getList(){
        return names;
    }
}