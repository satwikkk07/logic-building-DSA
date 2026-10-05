package day45;


import java.util.Scanner;

public class NoOfBinary {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter binary array elements (0 or 1):");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int currentCount = 0;
            int maxCount = 0;

            for (int i = 0; i < n; i++) {

                if (arr[i] == 1) {
                    currentCount++;

                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }

                } else {
                    currentCount = 0;
                }
            }

            System.out.println("Longest sequence of consecutive 1s: " + maxCount);

            sc.close();
        }
    }