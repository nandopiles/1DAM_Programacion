package circuloGaraje.practica2;

//@author 6jmati
import java.util.*;

public class Practica2 {

    static Scanner eb = new Scanner(System.in);
    static Scanner fr = new Scanner(System.in);

    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche coche1, coche2;
        int opc, entradasAlGaraje = 0;
        String salir = "";

        bienvenida();
        coche1 = crearCoche();
        coche2 = crearCoche();
        do {
            opc = menu();
            accion(opc, coche1, garaje);
            if (opc != 3) {
                salir = opcSalir();
            }
            System.out.println(coche1);
            System.out.println(coche2);
        } while (salir.equalsIgnoreCase("s") || opc != 3);
    }

    public static Coche crearCoche() {
        Coche coche;
        String marca, modelo;
        int caballos;

        System.out.println("\nCreación del Coche...");
        System.out.println("Introduce los datos:\n");
        System.out.print("Marca: ");
        marca = eb.nextLine();
        System.out.print("Modelo: ");
        modelo = eb.nextLine();
        System.out.print("Caballos de potencia: ");
        caballos = fr.nextInt();

        coche = new Coche(marca, modelo, caballos);
        return coche;
    }

    public static void bienvenida() {
        System.out.println("Bienvenido al Garaje de reparaciones...");
    }

    public static int menu() {
        int opc;

        System.out.println("1. EntrarCoche\n2. SacarCoche\n3. Salir");
        opc = eb.nextInt();
        while (opc < 1 || opc > 3) {
            System.out.println("opc no válida...repita:");
            opc = eb.nextInt();
        }
        return opc;
    }

    public static void accion(int opc, Coche coche, Garaje garaje) {
        String averia;

        switch (opc) {
            case 1:
                eb.nextLine();
                System.out.println("¿Cuál es su avería?");
                averia = eb.nextLine();
                garaje.aceptarCoche(coche, averia);
                coche.acumularAveria(random());
                System.out.println("La(s) reparaciones costarán --> " + coche.precioAcumulado + "€");
                break;

            case 2:
                eb.nextLine();
                garaje.devolverCoche();
                break;

            case 3:
                System.out.println("Hasta la próxima");
                break;
        }
    }

    public static int random() {
        int r = (int) (Math.random() * 1000 + 1);
        return r;
    }

    public static String opcSalir() {
        String opc = "";
        System.out.println("¿Quieres seguir entrando o saliendo del garaje?(s/n)");
        opc = eb.nextLine();

        return opc;
    }
}
