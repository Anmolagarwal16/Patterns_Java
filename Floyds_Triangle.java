public class Floyds_Triangle {
    public static void main(String[] args) {
        int number = 1;
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
