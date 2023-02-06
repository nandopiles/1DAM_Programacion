
import java.util.*;

public class reStrings1 {

    public static int cantPal(String texto) {
        int palabras = 1;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' ') { //si el carácter en la posición i es un espacio y el siguiente NO es un espacio +1 al cont de palabras
                palabras++;
            }
        }
        return palabras;
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String f;
        int n;

        System.out.print("Introduce un texto ---> ");
        f = eb.nextLine();
        n = cantPal(f);
        System.out.print("Número de palabras que tiene el texto ---> " + n);
    }
}
