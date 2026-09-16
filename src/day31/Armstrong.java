package day31;

import java.util.Scanner;

public class Armstrong {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int original = num;
            int temp  = num;

            // Count number of digits
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            // Calculate Armstrong sum
            int sum = 0;
            temp = num;

            while (temp > 0) {
                int digit = temp % 10;

                int power = 1;

                for (int i = 1; i <= digits; i++) {
                    power = power * digit;
                }

                sum = sum + power;

                temp = temp / 10;
            }

            // Check Armstrong
            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is not an Armstrong number.");
            }

            sc.close();
        }
}