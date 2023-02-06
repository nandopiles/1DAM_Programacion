package excepciones;

//@author Nando
import java.util.*;
public class Ej2 {

    public static void main(String[] args) {
        float valor = 0;
        boolean continuar = true;
        do {
            try {
                System.out.print("Valor Real con .: ");
                valor = leerReal();
                continuar = false;

            } catch (Exception e2) {
                System.out.println("Introduce un valor correcto");
            }
        } while (continuar);
        System.out.println("valor Real: " + valor);
    }

    public static float leerReal() {
        Scanner eb = new Scanner(System.in);
        String num = "";
        float numConv = 0;
        
        num = eb.nextLine();
        numConv = Float.parseFloat(num);
        
        return numConv;
    }
}
