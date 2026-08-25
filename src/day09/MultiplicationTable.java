package day09;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            System.out.println("\n--- Multiplication Table for " + number + " ---");

            // A for-loop that starts at 1 and stops when it reaches 10
            for (int i = 1; i <= 10; i++) {

                int result = number * i;

                // Using printf to format the output exactly like: 5 x 1 = 5
                // %d acts as a placeholder for integers
                System.out.printf("%d x %d = %d\n" , number, i, result);
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid whole number.");
        }
    }
}