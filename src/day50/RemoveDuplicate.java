package day50;

import java.util.Scanner;


public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.print("Unique elements: [");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i]);

            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}