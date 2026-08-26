package day13;

import java.util.Scanner;

public class VowelCheck {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Char : ");

        char ch = sc.next().charAt(0);

        char letter = Character.toLowerCase(ch);

        if(Character.isLetter(ch)) {


            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Is vowel");
            } else {
                System.out.println("Not vowel");
            }
        }else{
            System.out.println("Not a valid letter");
        }
        sc.close();
    }
}
