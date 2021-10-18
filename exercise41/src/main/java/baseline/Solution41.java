/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.io.FileNotFoundException;

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        NameSorter name = new NameSorter();

        //Call the readNames method with the file location as the argument
        name.readNames("data/exercise41_input.txt");
        //Call sortNames to sort all names collected with readNames
        name.sortNames();
        //Call exportNames with the file location of the exported file
        name.exportNames("data/exercise41_output.txt");
    }
}
