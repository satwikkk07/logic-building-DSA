package day11;


import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Get the first number
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            // 2. Get the operator
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // 3. Get the second number
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            // 4. The Switch Case: Decide what math to do based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // We have to make sure we don't divide by zero!
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        validOperation = false;
                    }
                    break;
                default:
                    // If they typed something other than +, -, *, or /
                    System.out.println("Error: Invalid operator!");
                    validOperation = false;
            }

            // 5. Print the final answer (only if there were no errors)
            if (validOperation) {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }

            scanner.close();
        }
    }

