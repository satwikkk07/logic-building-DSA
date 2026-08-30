package day18;

public class InvertedRight {
        public static void main(String[] args) {

            // The Outer Loop: Start at 5, and count down (i--) until we hit 1
            for (int i = 5; i >= 1; i--) {

                // The Inner Loop: Keep printing stars as long as j is less than or equal to i
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // Hit "Enter" to go to the next line
                System.out.println();
            }

        }

}
