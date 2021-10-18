package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {
    File input;
    Scanner scan;
    HashMap<String, Integer> map;

    public ReadFile() throws FileNotFoundException {
        //initialize variables such as the file location
        input = new File("data/exercise46_input.txt");
        //set up our scanner to read from the file previously initialized
        scan = new Scanner(input);
        //create a new map to store our Strings and the amount of said strings
        map = new HashMap<>();
    }

    public void read(){
        //set up a while loop to go through each line of the text file
        while(scan.hasNextLine()){
            // Set a temporary string equal to the line in the text file
            String temp = scan.nextLine();
            // Convert the string to an array and seperate the strings based on a space
            // (reminds me of seperating the CSV exercise)
            String[] tempArray = temp.split(" ");

            // Create another loop to go through the line word by word
            for (String key : tempArray) {
                //       ^ Make another temp string equal to one word
                if(map.containsKey(key)){
                    //if that word is already in the map, add one to that spot in the map
                    int temp1 = map.get(key);
                    map.put(key, temp1 + 1);
                }
                else{
                    //if its not in the map, add it to the map
                    map.put(key, 1);
                }
            }
        }
        //close the scanner
        scan.close();
    }

    public Map<String, Integer> getMap(){
        return map;
    }
}
