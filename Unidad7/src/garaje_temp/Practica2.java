package garaje_temp;

//@author Nando
import java.util.Scanner;

public class Practica2 {

    static Scanner eb = new Scanner(System.in);

    public static void main(String[] args) {
        Coche coche1, coche2;
        Garaje garaje = new Garaje();
        String marca, modelo;
        int opc, opcCoche;

//hacemos los coches rellenando toda su información
        coche1 = crearCoche();
        eb.nextLine();
        coche2 = crearCoche();

//hacemos que los coches entren y salgan del garaje
        entrar(coche1, garaje);
        entrar(coche2, garaje);
        sacar(coche2, garaje);
        sacar(coche1, garaje);
        entrar(coche2, garaje);
        sacar(coche2, garaje);
        
        System.out.println(coche1);
        System.out.println(coche2);
    }

    public static void entrar(Coche coche, Garaje garaje) {
        String averia;
        
        eb.nextLine();
        System.out.print("¿Cuál es la avería? ");
        averia = eb.nextLine();
        if (averia.equalsIgnoreCase("aceite")) {
            /*para navegar entre objetos que están dentro de otros...
            creamos una clase para devolver el objeto y después llamamos a un método del mismo*/
            coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite() + 10);
        }
        garaje.aceptarCoche(coche, averia);
        coche.acumularAveria(random());
    }
    
    public static void sacar(Coche coche, Garaje garaje) {
        garaje.devolverCoche();
    }

    public static Coche crearCoche() {
        Coche coche;
        String marca, modelo;
        int caballos;

        System.out.print("Marca del coche: ");
        marca = eb.nextLine();
        System.out.print("Modelo del coche: ");
        modelo = eb.nextLine();
        System.out.print("¿Cuántos caballos? ");
        caballos = eb.nextInt();

        coche = new Coche(marca, modelo, caballos);
        return coche;
    }

    public static int random() {
        return (int) (Math.random() * 1000 + 1);
    }
}
