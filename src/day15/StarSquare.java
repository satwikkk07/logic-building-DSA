package day15;

public class StarSquare {
    public static void main (String[] args){

                // The Outer Loop: Controls the ROWS (top to bottom)
                for (int i = 1; i <= 5; i++) {

                    // The Inner Loop: Controls the COLUMNS (left to right)
                    for (int j = 1; j <= 5; j++) {
                        // Print a star and a space, staying on the same line
                        System.out.print("* ");
                    }

                    // After printing 5 stars in a row, hit "Enter" to start a new line
                    System.out.println();
                }


    }
}


