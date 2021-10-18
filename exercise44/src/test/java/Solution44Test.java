/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matt Trump
 */

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {
    JsonSearcher json = new JsonSearcher();

    @Test
    void isProductTest1() throws FileNotFoundException {
        assertFalse(json.isNamePresent("iPad"));
    }

    @Test
    void isProductTest2() throws FileNotFoundException {
        assertTrue(json.isNamePresent("Thing"));
    }
}
