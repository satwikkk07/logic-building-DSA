package day07;

import java.util.Scanner;

public class CubeOfNo {
    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no :");
        int num = sc.nextInt();

        int cube;

        cube = num*num*num;

        System.out.println("Cube is "  +cube );
    }
}
