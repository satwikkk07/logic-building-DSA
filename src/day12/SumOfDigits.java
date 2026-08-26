package day12;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // num = 123

        int sum = 0;

        while (number != 0) {
            int digit = number % 10;   //gets last no. i.e 3
            sum = sum + digit;         //0+3 = 3
            number = number / 10;    // removes three remainig no 12 again loop
        }

        System.out.println("Sum of digits = " + sum);
    }
}