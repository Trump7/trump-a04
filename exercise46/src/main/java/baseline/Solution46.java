package baseline;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        //create a hashmap variable
        Map<String, Integer> map;

        //Firstly we would create an object of ReadFile
        ReadFile readF = new ReadFile();
        // then call readFile() from the ReadFile class
        readF.read();

        //After readFile is called we can get the map it created with
        //getMap() from the ReadFile class and set it equal to the premade map
        map = readF.getMap();

        //Next we create an object of PrintHistogram
        PrintHistogram prnt = new PrintHistogram(map);
        //Lastly we call the printChart method in the PrintHistogram class
        prnt.printChart();
    }
}
