import java.util.Scanner;

public class Hallow_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Print the hollow rectangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print '*' for the border, space for inside
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
