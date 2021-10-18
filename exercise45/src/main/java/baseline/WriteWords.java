/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matthew Trump
 */
package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteWords {
    FileWriter write;
    List<String> list;

    public WriteWords(String fileName, List<String> list) throws IOException {
        //initialize the file writer and the location of the file given by String name
        write = new FileWriter("data/" + fileName);
        //initialize the list so that its equal to the private list
        this.list = list;
    }

    public void writeFile() throws IOException {
        //create the String to hold the word utilize
        String word = "utilize";
        //make a loop to go through all parts of the list
        for (String temp : list) {
            //       ^ make a temporary string to hold the current word of the list
            // replace all the "utilize" with "use"
            temp = temp.replace(word, "use");
            // write the temp string to the file
            write.write(temp + "\n");
        }
        //close the file writer after the for loop
        write.close();
    }
}
