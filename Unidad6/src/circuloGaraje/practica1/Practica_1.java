package circuloGaraje.practica1;

//@author nando
import java.util.*;

public class Practica_1 {

    static Scanner eb = new Scanner(System.in);

    public static void main(String[] args) {
        Punto punto1, punto2;
        Circulo circulo;
        int opc, opcPunto;
        double x, y, distancia;

        bienvenida();
        opc = menu();
        punto1 = inicializacionPunto(opc);
        opc = menu();
        punto2 = inicializacionPunto(opc);
        distancia = punto1.calcularDistanciaDesde(punto2);
        System.out.println("Distancia desde Punto1 hasta Punto2 --> " + distancia);
        explicacion();
        opc = menu();
        circulo = inicializacionCirculo(opc);
        System.out.println("Área del Círculo --> "+circulo.calcularArea());
        System.out.println("Perímetro del Círculo --> "+circulo.calcularPerimetro());
        explicacionDistancia();
        opcPunto = elegirPunto();
        switch (opcPunto) {
            case 1:
                System.out.println("La distancia del centro hasta el Punto1 es --> "+circulo.calcularDistanciaDesde(punto1));
                break;
            case 2:
                System.out.println("La distancia del centro hasta el Punto2 es --> "+circulo.calcularDistanciaDesde(punto2));
                break;
        }
    }

    public static void bienvenida() {
        System.out.println("Buenos días...\nBienvenido al programa de cálculo de distancia entre 2 puntos");
    }

    public static int menu() {
        int opc;

        System.out.println("__________________________________");
        System.out.println("1. Introducir las coordenadas\n2. Introducir las coordenadas que se quiera");

        opc = eb.nextInt();
        while (opc != 1 && opc != 2) {
            System.out.println("opc no válida...repita:");
            System.out.println("1. Introducir las coordenadas\n2. Introducir las coordenadas que se quiera");
            opc = eb.nextInt();
        }

        return opc;
    }

    public static Punto inicializacionPunto(int opc) {
        Punto punto = new Punto();
        double x, y;

        switch (opc) {
            case 1:
                System.out.print("Introduce X --> ");
                x = eb.nextDouble();
                System.out.print("Introduce Y --> ");
                y = eb.nextDouble();

                punto = new Punto(x, y);
                System.out.println("Punto:");
                imprimirPunto(punto);
                System.out.println("");
                break;

            case 2:
                System.out.println("Entonces se rellenará automáticamente...");

                punto = new Punto();
                System.out.println("Punto:");
                imprimirPunto(punto);
                System.out.println("");
                break;
        }
        return punto;
    }

    public static void imprimirPunto(Punto punto) {
        System.out.println("x: " + punto.getX() + "\ny: " + punto.getY());
    }
    
    public static void explicacion() {
        System.out.println("\n\n");
        System.out.println("Vamos a crear un Círculo, elige una opción:");
    }
    
    public static void explicacionDistancia() {
        System.out.println("");
        System.out.println("Elige un punto para calcular la posición de él hasta el centro del Círculo...");
    }
    
    public static int elegirPunto() {
        int opcPunto = 0;
              
        System.out.println("1. Punto1\n2. Punto 2");
        opcPunto = eb.nextInt();
        while (opcPunto != 1 && opcPunto != 2) {
            System.out.println("opc no válida...repita:");
            System.out.println("1. Punto1\n2. Punto2");
            opcPunto = eb.nextInt();
        }
        
        return opcPunto;
    }
    
    public static Circulo inicializacionCirculo(int opc) {
        Punto centro = new Punto();
        Circulo circulo = new Circulo();
        double x, y, radio;

        switch (opc) {
            case 1:
                System.out.println("Introduce las coordenadas del centro del Círculo:");
                System.out.print("Introduce X --> ");
                x = eb.nextDouble();
                System.out.print("Introduce Y --> ");
                y = eb.nextDouble();
                centro = new Punto(x, y);
                
                System.out.print("Ahora introduce el radio del Círculo --> ");
                radio = eb.nextDouble();
                
                circulo = new Circulo(centro, radio);
                
                System.out.println("Centro del Círculo:");
                imprimirPunto(centro);
                System.out.println("Radio:\n"+radio);
                
                System.out.println("");
                break;

            case 2:
                System.out.println("Entonces se rellenará automáticamente...");
                circulo = new Circulo();
                
                System.out.println("Punto:");
                imprimirPunto(centro);
                System.out.println("Radio:\n"+circulo.getRadio());
                System.out.println("");
                break;
        }
        return circulo;
    }

}
