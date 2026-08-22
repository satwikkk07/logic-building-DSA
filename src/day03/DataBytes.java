package day03;

public class DataBytes {
    public static void main(String[] args) {
        // Divide by 8 to convert bits to bytes
        System.out.println("Size of int: " + (Integer.SIZE / 8) + " bytes"); // 32 bits/8 = 4bytes Soo
        System.out.println("Size of float: " + (Float.SIZE / 8) + " bytes");
        System.out.println("Size of double: " + (Double.SIZE ) + " bits"); //8 bytes
        System.out.println("Size of char: " + (Character.SIZE ) + " bits Donee"); // 2 bytes not converting
    }
}

