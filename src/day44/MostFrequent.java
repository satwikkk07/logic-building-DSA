package day44;

import java.util.Scanner;

public class MostFrequent {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxCount = 0;

            // Find maximum frequency
            for (int i = 0; i < n; i++) {

                int count = 0;

                for (int j = 0; j < n; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }

            System.out.print("Most frequent element(s): ");

            // Print each element only once
            for (int i = 0; i < n; i++) {

                // Check if element appeared before
                boolean alreadyPrinted = false;

                for (int k = 0; k < i; k++) {

                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (alreadyPrinted) {
                    continue;
                }

                // Count frequency
                int count = 0;

                for (int j = 0; j < n; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count == maxCount) {
                    System.out.print(arr[i] + " ");
                }
            }

            sc.close();
        }
    }