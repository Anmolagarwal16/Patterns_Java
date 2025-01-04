public class Butterfly_pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the butterfly pattern

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print the first half of stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            int spaces = 2 * (n - i); // Number of spaces decreases as rows progress
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print the second half of stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print the first half of stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            int spaces = 2 * (n - i); // Number of spaces increases as rows progress
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print the second half of stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }
    }
}
