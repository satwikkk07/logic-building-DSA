package day17;

public class HollowSquare {
    public static void main(String[] args) {

        // The Outer Loop: Controls the 5 rows
        for (int i = 1; i <= 5; i++) {

            // The Inner Loop: Controls the 5 columns
            for (int j = 1; j <= 5; j++) {

                // If it is the first row, last row, first column, or last column...
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    // Otherwise, we are inside the square, so print spaces instead!
                    System.out.print("  ");
                }
            }

            // Hit "Enter" to go to the next line
            System.out.println();
        }

    }
}
