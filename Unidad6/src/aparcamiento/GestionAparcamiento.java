package aparcamiento;

//@author 6jmati
import java.util.*;

public class GestionAparcamiento {

    static Scanner eb = new Scanner(System.in);

    public static void main(String[] args) {
        Aparcamiento a1 = new Aparcamiento(5);
        Puerta p1 = new Puerta(a1);
        Puerta p2 = new Puerta(a1);
        Puerta p; //Puerta comodín, para asignarle la puerta seleccionada
        int puerta;
        do {
            System.out.println("Parking:" + p1);
            puerta = elegirPuerta();
            if (puerta != 0) {
                if (puerta == 1) { //asigno a la puerta p, la puerta elegida
                    p = p1;
                } else {
                    p = p2;
                }
                if (entrarSalir() == 'E') {
                    //Dependiendo de si entra o sale, lo hago con la puerta elegida: p
                    p.entrarCoche();
                } else {
                    p.salirCoche();
                }
            }
        } while (puerta != 0);
    }

    public static int elegirPuerta() {
        /*MUESTRA LAS 2 PUERTAS Y DEVULEVE UNA CORRECTA */
        int opc;
        System.out.print("1. Puerta 1\n2. Puerta 2\n");
        opc = eb.nextInt();
        while (opc != 1 && opc != 2) {
            System.out.println("Opc no válida...Repita:");
            opc = eb.nextInt();
        }
        return opc;
    }

    public static char entrarSalir() {
        /*DEVUELVE SI QUIERE ENTRAR (E) O SALIR (S)*/
        char opc;
        System.out.println("Quieres Entrar(E) o Salir(S):");
        opc = eb.next().toUpperCase().charAt(0);
        while (opc != 'E' && opc != 'S') {
            System.out.println("Opc no válida...Repita:");
            opc = eb.next().toUpperCase().charAt(0);
        }
        return opc;
    }
}
