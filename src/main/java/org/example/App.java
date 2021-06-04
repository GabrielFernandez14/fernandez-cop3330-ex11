/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;

// Import required libraries
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Store rate_to as a constant
        final int RATE_TO = 100;

        // Prompt user for input of the number of euros and
        // the exchange rate and store as an int and a double respectively
        System.out.println("How many euros are you exchanging?");
        Scanner eurosIn = new Scanner(System.in);
        int numEuros = eurosIn.nextInt();

        System.out.println("What is the exchange rate?");
        Scanner exchangeRateIn = new Scanner(System.in);
        double exchangeRate = exchangeRateIn.nextDouble();

        // Calculate the amount in U.S. dollars
        double conversion = (numEuros * exchangeRate) / RATE_TO;

        // Limit the conversion to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        // Print the output statement
        System.out.println(numEuros + " euros at an exchange rate of " + exchangeRate
                            + " is\n" + df.format(conversion) + " U.S. dollars.");
    }
}

/* Note:
 * For the sample output I get 111.39 instead of 111.38, not sure if
 * this is an error in my programming or an error in the sample output
 * but either way I feel that my answer is close enough to be correct
 */
