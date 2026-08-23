package day08;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Dividend: ");
            int dividend = sc.nextInt();

            System.out.print("Enter Divisor: ");
            int divisor = sc.nextInt();

            // Safety check: Dividing by zero crashes Java programs
            if (divisor == 0) {
                System.out.println("Error: Cannot divide by zero!");
            } else {
                // The '/' operator gives the whole number quotient
                int quotient = dividend / divisor;

                // The '%' (modulo) operator gives the remainder
                int remainder = dividend % divisor;

                System.out.println("Quotient: " + quotient);
                System.out.println("Remainder: " + remainder);
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter whole numbers only.");
        }
    }
}