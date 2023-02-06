
import java.util.Scanner;

public class ej3 {

    public static int factorial(int n) {
        int fact = 1;

        do {
            fact = fact * n;
            n--;
        } while (n > 0);

        return (fact);
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int n, result;

        do {
            System.out.println("Introduce un número positivo:");
            n = eb.nextInt();
        } while (n < 0);

        result = factorial(n);
        System.out.println(result);
    }
}
