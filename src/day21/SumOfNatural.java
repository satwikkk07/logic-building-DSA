package day21;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // Check if it's a natural number
            if (n < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                // Calculate the sum using the formula
                int sum = (n * (n + 1)) / 2;

                // Display the result
                System.out.println("The sum of the first " + n + " natural numbers is " + sum + ".");
            }
        } else {
            System.out.println("Invalid input! Please enter a whole number.");
        }

        // Close the scanner
        scanner.close();
    }
}