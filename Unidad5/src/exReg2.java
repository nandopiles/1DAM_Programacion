
import java.util.*;

public class exReg2 {

    public static String cambNums(String texto) {
        String num, mod;
        num = "\\d+";
        
        mod = texto.replaceAll(num , "*");
        return mod;
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner (System.in);
        String f, newF;
        
        System.out.print("Introduce una frase ---> ");
        f = eb.nextLine();
        newF = cambNums(f);
        System.out.println("Es lo transformamos a ---> "+newF);
    }
}
