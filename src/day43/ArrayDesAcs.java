package day43;

import java.util.Scanner;

public class ArrayDesAcs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort in ascending order
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Ascending: [");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Descending order
        System.out.print("Descending: [");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}
