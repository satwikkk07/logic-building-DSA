package day39;



import java.util.Scanner;

public class DecimalToBinary {

    // Binary to Decimal
    static int binaryToDecimal(int binary) {

        int decimal = 0;
        int power = 1;

        while (binary > 0) {

            int digit = binary % 10;

            decimal = decimal + (digit * power);

            power = power * 2;

            binary = binary / 10;
        }

        return decimal;
    }

    // Decimal to Binary
    static int decimalToBinary(int decimal) {

        int binary = 0;
        int place = 1;

        while (decimal > 0) {

            int remainder = decimal % 2;

            binary = binary + (remainder * place);

            place = place * 10;

            decimal = decimal / 2;
        }

        return binary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = binaryToDecimal(binary);

        System.out.println("Decimal equivalent: " + decimal);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        int binaryResult = decimalToBinary(decimalNumber);

        System.out.println("Binary equivalent: " + binaryResult);

        sc.close();
    }
}