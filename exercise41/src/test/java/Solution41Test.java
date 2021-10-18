/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.NameSorter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution41Test {
    NameSorter test = new NameSorter();

    @Test
    void sortTest() {
        //Create an unsorted list to be sorted by sortNames()
        List<String> unsorted = new ArrayList<>();
        unsorted.add("Victoria Trump");
        unsorted.add("Matthew Trump");
        unsorted.add("Billybob Jenkins");
        test.nameList(unsorted);
        //run the sortNames method
        test.sortNames();
        //create a sorted list of names
        List<String> sorted = new ArrayList<>();
        sorted.add("Billybob Jenkins");
        sorted.add("Matthew Trump");
        sorted.add("Victoria Trump");
        //compare the output with a presorted list
        assertEquals(sorted , test.getList());
    }
}
