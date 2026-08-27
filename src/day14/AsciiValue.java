package day14;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character: ");

        char myChar = sc.next().charAt(0);


        System.out.println(" ASCII value of "+ myChar+ " is : " + (int) myChar);
    }
}
