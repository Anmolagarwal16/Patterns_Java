public class Invertedstarpattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int star = 1; star <=4- line+1; star++) {/*here suppose line is 1 so star 1 and
            it will print star upto
             in that line when 4-1+1 **** it like that 4 - 2+1***
              means the inside loop will run 4 times*/
                System.out.print("*");

            }
            System.out.println();
        }
    }
}