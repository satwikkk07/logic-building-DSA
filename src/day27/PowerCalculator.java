package day27;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from the user
        System.out.print("Base: ");
        int base = scanner.nextInt();

        System.out.print("Exponent: ");
        int exponent = scanner.nextInt();

        // 1. Manual Calculation
        long manualResult = 1;
        // Multiply the base by itself 'exponent' number of times
        for (int i = 1; i <= exponent; i++) {
            manualResult *= base;
        }

        // 2. Using Math.pow()
        // Math.pow() takes and returns doubles, so we cast to long for a clean integer output
        long powResult = (long) Math.pow(base, exponent);

        // Display results
        System.out.println("Result using manual calculation: " + manualResult);
        System.out.println("Result using pow(): " + powResult);

        scanner.close();
    }
}
