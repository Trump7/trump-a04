/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matthew Trump
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWords {
    Scanner scan;
    ArrayList<String> list;

    public ReadWords() throws FileNotFoundException {
        //initialize an arraylist to hold data
        list = new ArrayList<String>();
        //initialize the file and the scanner used to read the file
        File input = new File("data/exercise45_input.txt");
        scan = new Scanner(input);
    }

    public void readLine(){
        String temp = "";

        //create a loop to read line by line of the file until there are no more lines to read
        while(scan.hasNext()){
            //  in the loop add the string collected from the file to the arraylist
            temp = scan.nextLine();
            list.add(temp);
        }
        scan.close();
    }

    public List<String> readData(){
        //return the list created by readLine
        return list;
    }
}
