package day38;


public class DigitsAndAlphabets {
    public static void main(String[] args) {

        System.out.print("Digits: ");

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Alphabets: ");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
