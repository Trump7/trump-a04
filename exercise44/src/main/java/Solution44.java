/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) throws FileNotFoundException {
        //create a variable isPresent to determine when to break out of the loop
        boolean isPresent = false;
        //create a variable input to hold the users inputted string
        String input;

        //Create a while loop that continues to loop until an item in the json file is found
        JsonSearcher search = new JsonSearcher();
        while(!isPresent){
            Scanner in = new Scanner(System.in);
            System.out.print("What is the product name? ");
            input = in.nextLine();

            //set isPresent equal to isNamePresent's returned value
            isPresent = search.isNamePresent(input);
        }
        //when the while loop breaks the data is printed automatically
    }
}
