package transporte;

//@author 6jmati
import java.util.*;

public class mainTransporte {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Madera madera;
        String tipoMadera;
        boolean continuar = true;

        System.out.print("Tipo de madera: ");
        do {
            try {
                tipoMadera = eb.nextLine().toUpperCase();
                madera = Madera.valueOf(tipoMadera);
                System.out.println("Madera Elegida: " + tipoMadera + "\nColor: " + madera.getColor() + "\nPeso específico: " + madera.getPeso() + " kg");
                continuar = false;
                separador();
                for (Madera tmp : madera.values()) {
                    System.out.println(tmp.toString() + " (color " + tmp.getColor() + ") el palé pesa " + tmp.getPesoFinal() + " kg");
                }     
            } catch (IllegalArgumentException e1) {
                System.out.println("Tipo de Madera incorrecta...");
            } catch (Exception e2) {
                System.out.println("Error general...");
            }
        } while (continuar);
    }

    public static void separador() {
        System.out.println("______________________________________");
    }
}
