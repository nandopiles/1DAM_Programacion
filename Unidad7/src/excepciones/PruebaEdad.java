package excepciones;

//@author Nando
import java.util.*;

public class PruebaEdad {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Persona persona;
        String nombre;
        int edad;
        boolean continuar = false;

        System.out.print("Nombre: ");
        nombre = eb.nextLine();
        persona = new Persona(nombre);
        System.out.print("Edad de " + nombre + ": ");
        //System.out.println(persona.getNombre());

        do {
            try {
                edad = eb.nextInt();
                persona.ponerEdad(edad);
                continuar = false;
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
                continuar = true;
            }
        } while (continuar);

        System.out.println(persona);
    }
}
