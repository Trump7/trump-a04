/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonSearcher {
    public boolean isNamePresent(String search) throws FileNotFoundException {
        //create nessacary parsers from the Google gson library
        Object temp = JsonParser.parseReader(new FileReader("data/exercise44_input.json"));

        JsonObject obj = (JsonObject) temp;
        JsonArray products = (JsonArray)obj.get("products");
        //if the argument search is equal to one of the names in the json file

        for (com.google.gson.JsonElement product : products) {
            JsonObject json = (JsonObject) product;
            //This is setting the name equal to each name of the products json
            //each time the loop goes through.
            String name = json.get("name").getAsString();
            if (search.equalsIgnoreCase(name.toLowerCase())) {
                //return true
                System.out.println("Name: " + name);
                System.out.println("Price: " + json.get("price"));
                System.out.println("Quantity: " + json.get("quantity"));
                return true;
            }
        }
        //else return false
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
}
