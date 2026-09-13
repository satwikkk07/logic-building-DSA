package day28;

import java.util.Scanner;

public class DigitToAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numStr = scanner.nextLine();

        // Array mapping numeric indices to their word equivalents
        String[] wordMap = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : numStr.toCharArray()) {
            if (ch == '-') {
                result.append("Minus ");
            } else if (Character.isDigit(ch)) {
                // Subtracting the char '0' converts the character to its integer value (e.g., '3' - '0' = 3)
                int digit = ch - '0';
                result.append(wordMap[digit]).append(" ");
            }
        }

        // Print the final result, trimming the trailing space
        System.out.println(result.toString().trim());

        scanner.close();
    }
}
