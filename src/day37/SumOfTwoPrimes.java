package day37;

import java.util.Scanner;

public class SumOfTwoPrimes {

    // Method to check whether a number is prime
    static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 2; i <= num / 2; i++) {

            int j = num - i;

            if (isPrime(i) && isPrime(j)) {

                System.out.println(num + " = " + i + " + " + j);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The number cannot be expressed as the sum of two prime numbers.");
        }

        sc.close();
    }
}