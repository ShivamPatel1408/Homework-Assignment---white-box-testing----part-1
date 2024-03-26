package com.shivam.HW;

/**
 * Utility class for counting occurrences of a specific character in an array.
 */
public class App {

    /**
     * Counts the occurrences of a target character in the given array.
     *
     * @param array The array of characters in which occurrences are counted.
     * @param target The character to count occurrences of.
     * @return The count of occurrences of the target character.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int countOccurrences(char[] array, char target) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Initialize count of occurrences
        int count = 0;
        
        // Iterate through each character in the array
        for (char c : array) {
            // If the character matches the target, increment count
            if (c == target) {
                count++;
            }
        }
        // Return the total count of occurrences
        return count;
    }
}
