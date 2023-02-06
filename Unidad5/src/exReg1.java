
import java.util.*;

public class exReg1 {

    public static String cambA(String texto) {
        String mod, vocMin;
        vocMin = "[[a-z]&&[aeiou]]"; //expresión regular para filtrar si es una Vocal Minúscula
        
        mod = texto.replaceAll(vocMin, "a");
        
        return mod;
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String f1, newF1;

        System.out.print("Introduce una frase ---> ");
        f1 = eb.nextLine();
        newF1 = cambA(f1);
        System.out.println("Las vocales min. se cambian por la \"a\":");
        System.out.println(newF1);
    }
}
