/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        //create four string variables for CSS, JS, author, and website name
        String name;
        String author;
        String css;
        String js;

        //create a new scanner to take user input
        Scanner scan = new Scanner(System.in);

        //Prompt the user for the site name and author
        System.out.print("Site name: ");
        name = scan.nextLine();
        System.out.print("Author: ");
        author = scan.nextLine();
        //ask the user if they want a CSS folder
        System.out.print("Do you want a folder for CSS? ");
        css = scan.nextLine();
        //ask the user if they want a JS folder
        System.out.print("Do you want a folder for JavaScript? ");
        js = scan.nextLine();

        WebsiteBuilder build = new WebsiteBuilder();
        //call the buildWebsite function to build the site and tell the user if it was created
        System.out.println(build.buildWebsite(name));
        //call the createHTML function and tell the user if it was created
        System.out.println(build.createHTML(name, author));

        //make two if statements to deal with the creation of JS and CSS since they are optional
        if(css.equalsIgnoreCase("y") || css.equalsIgnoreCase("yes")){
            //if the input string was "y" or "yes", then call that function
            System.out.println(build.createCSS(name));
        }
        if(js.equalsIgnoreCase("y") || js.equalsIgnoreCase("yes")){
            //if the input string was "y" or "yes", then call that function
            System.out.println(build.createJS(name));
        }
    }
}
