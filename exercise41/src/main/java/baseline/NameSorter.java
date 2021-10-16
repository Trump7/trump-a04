package baseline;

import java.util.ArrayList;

public class NameSorter {
    //Create an arraylist that all methods in this class can access
    ArrayList<String> names = new ArrayList<>();

    private void readNames(String input){
        //create an inputFile scanner using the file location
        //given in the argument

        //Create a loop to scan each line in the input file
        //if there is another line, add it to the names ArrayList
        //Once the loop finishes we will have an array full of each persons'
        //first and last name
        //close input file
    }

    private void sortNames(){
        //use the collections.sort method to sort all names
        //in alphabetical order
    }

    private void exportNames(String output){
        //create an outputFile writer using the file location
        //given in the argument

        //Create the formatting for the header of the file using names.size
        //for the number of names and a string of hyphens to separate the header
        //and contents of the file

        //create a loop to go through all the names
        //adding each first and last name line by line

        //close the output file
    }
}
