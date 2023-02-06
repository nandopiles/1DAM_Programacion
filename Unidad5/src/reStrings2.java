
import java.util.*;

public class reStrings2 {

    public static void siglas(String texto) {
        String nText;
        nText = texto.toUpperCase();

        System.out.print(nText.charAt(0));        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ' && texto.charAt(i +1) != ' ') {
                System.out.print(nText.charAt(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String f;

        System.out.print("Introduce una frase ---> ");
        f = eb.nextLine();
        System.out.print(f + " ---> ");
        siglas(f);
        System.out.println("");
    }
}
