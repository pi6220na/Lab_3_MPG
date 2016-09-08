/*
    This program calculate the miles per gallon a method call to perform the calculation.
 */
package com.wolfe;

import java.util.Scanner;

public class Main {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        double mpg = calculateMPG();

        System.out.println("Miles per Gallon equals: " + mpg);

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }

    // This method gets user data and calculates the miles per gallon. mpg returned to caller.
    private static double calculateMPG() {

        double milesDriven = 0;
        double gallonsOfGas = 0;
        double mpg = 0;

        System.out.print("Enter the number of miles driven: ");
        milesDriven = numberScanner.nextDouble();

        System.out.print("Enter the number of gallons used: ");
        gallonsOfGas = numberScanner.nextDouble();

        mpg = milesDriven / gallonsOfGas;

        return mpg;
    }
}
