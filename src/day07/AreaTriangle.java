package day07;

import java.util.Scanner;

public class AreaTriangle {

    // 1. Separate calculation methods make code reusable and easy to test
    public static double getTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double getCircleArea(double radius) {
        // radius * radius is computationally slightly faster than Math.pow(radius, 2)
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // 2. Try-with-resources ensures the Scanner is automatically closed, preventing memory leaks
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Triangle Calculator ---");
            System.out.print("Enter Base: ");
            double base = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            // 3. printf lets you format the output beautifully (%.2f limits it to 2 decimal places)
            System.out.printf("Area of Triangle is: %.2f\n\n", getTriangleArea(base, height));

            System.out.println("--- Circle Calculator ---");
            System.out.print("Enter Radius: ");
            double radius = sc.nextDouble();

            System.out.printf("Area of Circle is: %.2f\n", getCircleArea(radius));

        } catch (Exception e) {
            // 4. Basic error handling in case the user types a letter instead of a number
            System.out.println("Invalid input! Please run the program again and enter valid numbers.");
        }
    }
}