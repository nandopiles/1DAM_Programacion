
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner eb = new Scanner (System.in);
        int k = 0, rama;
        rama = eb.nextInt();
        //introduces altura y te saca triángulo
        rama = rama * 2 - 1;
        for (int i = 1; i <= rama; i += 2) {
            for (int j = 1; j <= rama - i; j += 2) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
