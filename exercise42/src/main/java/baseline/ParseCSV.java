package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseCSV {

    List<String> data = new ArrayList<>();

    public void readCSV(String input) throws FileNotFoundException {
        //create a new file with the input being the file location
        File in = new File(input);
        //create a new scanner to look through the file
        Scanner scan = new Scanner(in);
        //scan through each line of the csv file and save to an arraylist
        while(scan.hasNext()){
            data.add(scan.nextLine());
        }
        //close the file
        scan.close();
    }

    public void organizeData(){
        List<String> temp = new ArrayList<>();
        //This loop takes one line of the csv file at a time to parse
        for (String s : data) {
            //This takes one line and splits it into three strings
            String[] holder = s.split(",");
            //then each string is added to a temporary arraylist
            temp.add(holder[0]);
            temp.add(holder[1]);
            temp.add(holder[2]);
        }
        //once all strings are separated and added to the temp array list
        //we set the original list equal to the organized one
        data = temp;
    }

    public void exportData(String output){
        //create a new file with the output being the file location
        try(FileWriter out = new FileWriter(output)){
            //write the header to the file
            out.write(String.format("%-16s%-16s%-16s", "Last", "First", "Salary"));
            //write the hyphens to separate the header and data
            out.write("\n---------------------------------------\n");
            //create a loop that adds each line of evenly spaced data
            for(int i = 0; i < data.size(); i+=3){
                out.write(String.format("%-16s%-16s%-16s%n", data.get(i), data.get(i + 1), data.get(i + 2)));
            }

        } catch (IOException e) {
            System.out.println("An error occurred creating the file");
            e.printStackTrace();
        }

    }

    public void dataList(List<String> newList){
        this.data = newList;
    }

    public List<String> returnList(){
        return this.data;
    }
}
