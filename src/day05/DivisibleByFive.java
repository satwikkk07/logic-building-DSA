package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisibleByFive {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check : ");

        try{
         int num = sc.nextInt();

         if(num % 5 == 0 && num % 3 ==0){
            System.out.println(num + " is divisible by 5 & 3");

         }else{
            System.out.println(num + " is not divisible by 5 & 3");
         }
        } catch (InputMismatchException e) {

        System.out.println("Invalid input! Please enter numbers only.");

        }
    }
}
