package semaforo.aplicacion2;

//@author Nando
import java.util.*;

public class MainSemaforo2 {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Semaforo semaforo;
        String color;
        boolean parpadeando, seguir = true;

        do {
            try {
                opcColores();
                System.out.println("¿De qué color está el semáforo? ");
                color = eb.nextLine().toUpperCase();
                if (color.equals("AMARILLO")) {
                    System.out.println("¿Está parpadeando? (true/false) ");
                    parpadeando = eb.nextBoolean();
                    semaforo = new Semaforo(ColorSemaforo.valueOf(color), parpadeando);
                    System.out.println("\n" + semaforo);
                    seguir = false;
                } else {
                    semaforo = new Semaforo(ColorSemaforo.valueOf(color), false);
                    System.out.println("\n" + semaforo);
                    seguir = false;
                }
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        } while (seguir);
    }

    public static void opcColores() {
        System.out.println("\n1. ROJO\n2. AMARILLO\n3. VERDE");
    }
}
