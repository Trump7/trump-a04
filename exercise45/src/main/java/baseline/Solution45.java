/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matthew Trump
 */
package baseline;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        //Create an array list to be used later
        List<String> list;

        //Ask the user what the output file should be
        System.out.print("What is the output file? ");
        //take user info of output file
        String outFile = scan.nextLine();

        ReadWords read = new ReadWords();
        //call the readline function in the readwords class
        read.readLine();

        //set the previously initialized arraylist equal
        // to readData function from the readwords class
        list = read.readData();

        //call the writefile function from the readwords class
        WriteWords write = new WriteWords(outFile, list);

        write.writeFile();
    }
}
