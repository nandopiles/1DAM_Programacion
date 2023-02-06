
import java.util.Scanner;

public class ej2 {

    public static int esDig(char next) {
        Scanner eb = new Scanner(System.in);
        int ult;

        if (next == '0' || next == '1' || next == '2' || next == '3' || next == '4' || next == '5' || next == '6' || next == '7' || next == '8' || next == '9') {
            ult = 1;
        } else {
            ult = 0;
        }
        return ult;
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String texto;
        char next;
        int n, cont, result;

        System.out.println("Introduce una frase:");
        texto = eb.nextLine();
        n = texto.length();
        System.out.printf("Esta frase tiene %d dígitos: ", n);

        for (cont = 0; cont < n; cont++) {
            next = texto.charAt(cont);
            result = esDig(next);
            System.out.printf("%d ", result);
        }
    }
}
