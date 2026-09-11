package day25;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + a + ".");

        sc.close();
    }
}
