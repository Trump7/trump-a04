package baseline;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class PrintHistogram {
    //create a variable to hold the map made from the readFile class
    Map<String, Integer> map;
    public PrintHistogram(Map<String, Integer> map){
        //set the imputted map equal to the local map
        this.map = map;
    }

    public void printChart(){
        int i = 0;
        //create two arrays to store the keys and the values for each key respectivly
        String[] keys = new String[map.size()];
        Integer[] values = new Integer[map.size()];
        //create a loop to go through the map and assign the values and keys to the arrays
        //just created

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            keys[i] = entry.getKey();
            values[i++] = entry.getValue();
        }

        int[] valuesPlaceholder = new int[map.size()];
        //make a copy of values to put in values placeholder

        for(int j = 0; j < values.length; j++){
            valuesPlaceholder[j] = values[j];
        }

        //figure out a way to sort the keys so they are in most often to least often order
        Arrays.sort(values, Collections.reverseOrder());

        String[] keyPlaceholder = new String[map.size()];



        //print histogram using two for loops to print both the key then
        //print stars corressponding with that keys value
        for(int a = 0; a < map.size(); a++){
            int val = map.get(keyPlaceholder[a]);
            System.out.print(keyPlaceholder[a] + " :  ");

            for(int b = 0; b < val; b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
