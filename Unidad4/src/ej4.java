import java.util.Scanner;
public class ej4 {
    public static int combinatorio(int n1, int n2) {

        int fact1 = 1, fact2 = 1, fact3 = 1, resta, resul, n11, n22;

        n11 = n1;
        n22 = n2;
        do {
            fact1 = fact1 * n1;
            n1--;
        } while (n1 > 0);

        do {
            fact2 = fact2 * n2;
            n2--;
        } while (n2 > 0);

        resta = n11 - n22;

        do {
            fact3 = fact3 * resta;
            resta--;
        } while (resta > 0);

        resul = fact1 / (fact2 * fact3);

        return resul;
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int n1, n2, resul = 0;

        System.out.println("Dime un número");
        n1 = eb.nextInt();
        System.out.println("Dime otro número");
        n2 = eb.nextInt();

        resul = combinatorio(n1, n2);

        System.out.println(resul);
    }
}
