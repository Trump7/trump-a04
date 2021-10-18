/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Matt Trump
 */
import baseline.WebsiteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution43Test {
    WebsiteBuilder builder = new WebsiteBuilder();

    @Test
    void buildTest(){
        //figure out if the website directory was created properly
        String correct = "Created data/website/Trump";

        assertEquals(correct, builder.buildWebsite("Trump"));
    }
}
