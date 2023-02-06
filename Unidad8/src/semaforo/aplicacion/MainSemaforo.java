package semaforo.aplicacion;

//@author Nando
import java.util.*;

public class MainSemaforo {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Semaforo semaforo1, semaforo2;
        String color;
        boolean parpadeando;

        System.out.println("¿De qué color está el semáforo? ");
        color = eb.nextLine().toUpperCase();
        if (color.equals("AMARILLO")) {
            System.out.println("¿Está parpadeando? (true/false) ");
            parpadeando = eb.nextBoolean();
            semaforo1 = new Semaforo(ColorSemaforo.AMARILLO, parpadeando);
            System.out.println("\nSemáforo1:\n" + semaforo1);
        } else {
            semaforo1 = new Semaforo(ColorSemaforo.valueOf(color), false);
            System.out.println("\nSemáforo1:\n" + semaforo1);
        }
        
        System.out.println("__________________________");
        semaforo2 = new Semaforo();
        System.out.println("Semáforo2:\n" + semaforo2);
    }
}
