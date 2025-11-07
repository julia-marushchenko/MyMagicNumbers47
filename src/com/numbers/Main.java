/**
 * Java program to find numbers dividable by 3.
 */

package com.numbers;

import java.util.Random;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating an array with 300 numbers
        int arr [] = new int[300];

        // Adding elements to arr
        for (int index = 0; index < 300; index++) {

            // Adding elements from 0 to 150
            arr[index] = new Random().nextInt(150);

        }

        // Checking if numbers are dividable by 3 and printing result to console
        for (int index = 0; index < arr.length; index++) {

            // Condition
            if (arr[index] % 3 == 0) {

                // Printing the result
                System.out.println(arr[index] + " is dividable by 3.");

            } else {

                // Printing the result
                System.out.println(arr[index] + " is not dividable by 3.");
            }
        }
    }
}