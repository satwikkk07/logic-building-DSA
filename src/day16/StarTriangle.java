package day16;

public class StarTriangle {
    public static void main(String[] args) {

        // The Outer Loop: Still controls the 5 ROWS
        for (int i = 1; i <= 5; i++) {

            // The Inner Loop: Notice it now says "j <= i" instead of "j <= 5"
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Hit "Enter" to go to the next line
            System.out.println();
        }

    }
}