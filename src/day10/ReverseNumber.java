package day10;


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = 0;

        // Loop until the number is reduced to 0
        while (num != 0) {
            // 1. Extract the last digit
            int digit = num % 10;

            // 2. Shift existing digits left by multiplying by 10, then add the new digit
            reversed = reversed * 10 + digit;

            // 3. Remove the last digit from the original number
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

        scanner.close();
    }
}
