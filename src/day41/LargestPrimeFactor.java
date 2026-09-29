package day41;

import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int num = sc.nextInt();

        int LargestFactor =1;

        for(int i = 2;i<=num; i++) {

            if (num % i == 0) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;

                    }
                }
                if (isPrime) {
                    LargestFactor = i;

                }

            }
        }


        System.out.println("Largest Factor is : " + LargestFactor);

        sc.close();



    }
}
