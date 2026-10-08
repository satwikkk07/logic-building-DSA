package day47;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of elements in array
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);

        sc.close();
    }
}
