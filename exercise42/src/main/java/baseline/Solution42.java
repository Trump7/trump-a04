package baseline;

import java.io.FileNotFoundException;

public class Solution42 {
    public static void main(String[] args) throws FileNotFoundException {
        ParseCSV parser = new ParseCSV();
        //Call the readCSV function with the file location as the arguments
        parser.readCSV("data/exercise42_input.txt");
        //Call the organizeData function to organize all data collected by readCSV function
        parser.organizeData();
        //Call the exportData function with the file location as the arguments
        parser.exportData("data/exercise42_output.txt");
    }
}
