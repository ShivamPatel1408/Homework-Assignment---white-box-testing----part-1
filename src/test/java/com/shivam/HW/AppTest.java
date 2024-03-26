package com.shivam.HW;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.shivam.HW.App;

public class AppTest {

    @Test
    public void testNodeCoverage() {
        try {
            App.countOccurrences(null, 'a');
        } catch (IllegalArgumentException e) {
            assertEquals("Array must not be null or empty", e.getMessage());
        }
    }

    @Test
    public void testEdgeCoverage() {
        char[] array = {'a', 'b', 'a', 'c', 'a'};
        char target = 'a';
        int expected = 3;
        int result = App.countOccurrences(array, target);
        assertEquals(expected, result);
    }

    @Test
    public void testEdgePairCoverage() {
        char[] array = {'a', 'b', 'a', 'c', 'a'};
        char target = 'b';
        int expected = 1;
        int result = App.countOccurrences(array, target);
        assertEquals(expected, result);
    }

    @Test
    public void testPrimePathCoverage() {
        try {
            App.countOccurrences(null, 'a');
        } catch (IllegalArgumentException e) {
            assertEquals("Array must not be null or empty", e.getMessage());
        }
    }
    
    @Test
    public void testNoOccurrences() {
        char[] array = {'x', 'y', 'z'};
        char target = 'a';
        int expected = 0;
        int result = App.countOccurrences(array, target);
        assertEquals(expected, result);
    }

    @Test
    public void testAllOccurrences() {
        char[] array = {'a', 'a', 'a', 'a'};
        char target = 'a';
        int expected = 4;
        int result = App.countOccurrences(array, target);
        assertEquals(expected, result);
    }
}
