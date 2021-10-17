import baseline.ParseCSV;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution42Test {
    ParseCSV parser = new ParseCSV();

    @Test
    void organizeTest(){
        //create an arraylist with a csv type data
        List<String> unOrganized = new ArrayList<>();
        unOrganized.add("Trump, Matt, 100000");
        //set the new arraylist equal to the arraylist in the parseCSV class
        parser.dataList(unOrganized);
        //run the organizeData function
        parser.organizeData();

        List<String> organized = new ArrayList<>();
        organized.add("Trump");
        organized.add(" Matt");
        organized.add(" 100000");
        //compare the returned organized data with a string of the organized data
        assertEquals(organized, parser.returnList());
    }
}
