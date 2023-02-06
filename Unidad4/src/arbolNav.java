
import java.util.Scanner;

public class arbolNav {

    public static String metTronco(String opc) {
        /*Método que dirá si quiere o no tronco y de qué tamaño será el tronco*/
        Scanner eb = new Scanner(System.in);
        String opcT = "0";

        while (!(opc.toLowerCase().equals("s")) && !(opc.toLowerCase().equals("n"))) {
            System.out.print("Opc No Válida\nVuelva a repetir\n");
            opc = eb.next();
        }
        switch (opc) {
            case "s":
                System.out.println("¡¡¡Perfecto!!! Con tronco");
                opcT = "s";
                break;
            case "n":
                System.out.println("Pues sin tronco...");
                opcT = "n";
                break;
        }
        return opcT;
    }

    public static void dibTronco(int h, String opc) {
        /*Método para dibujar el tronco*/
        h = h * 2 - 1;
        if (opc.toLowerCase().equals("s")) {
            int offset = (h - 3) / 2;

            for (int i = 1; i <= 2; i++) {

                for (int j = 0; j < offset; j++) {
                    System.out.print(" ");
                }

                System.out.println("***");
            }
        }
    }

    public static void dibRamas(int rama) {
        /*método para dibujar el árbol sin decoración*/
        int k = 0;

        rama = rama * 2 - 1;
        for (int i = 1; i <= rama; i += 2) {
            for (int j = 1; j <= rama - i; j += 2) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean metOpcDecoracion(String decora) {
        /*método que me diga si quiere que le ponga decoración al árbol o no*/
        Scanner eb = new Scanner(System.in);
        boolean d = false;

        while (!(decora.toLowerCase().equals("s")) && !(decora.toLowerCase().equals("n"))) {
            System.out.print("Opc No Válida\nVuelva a repetir\n");
            decora = eb.next();
        }
        switch (decora) {
            case "s":
                System.out.println("¡¡¡Perfecto!!! Con decoración");
                d = true;
                break;
            case "n":
                System.out.println("Pues soso...");
                d = false;
                break;
        }
        return d;
    }

    public static int random() { //método de tirar un dado (número aleatorio entre 1 y 6)
        return (int) (Math.random() * 3 + 1);
    }

    //colores letras
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void decoracion(boolean decora, int rama) {
        /*método que me va a hacer la decoración (si no me dice que quiere decoración imprimirá el árbol normal)*/
        if (decora == true) {
            int k = 0, r;

            rama = rama * 2 - 1;
            for (int i = 1; i <= rama; i += 2) {
                for (int j = 1; j <= rama - i; j += 2) {
                    System.out.print(" ");
                }
                for (k = 1; k <= i; k++) {
                    r = random(); //hacer lo del número rándom del 1 al 3 y que si es 3 ps que haga el 0 rojo
                    if (r == 3) {
                        System.out.print(ANSI_RED + "0");
                    } else {
                        System.out.print(ANSI_GREEN + "*");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int rama;
        String tronco, decoracion, opcTronco;
        boolean opcDecora = false;
        /*Introducción*/
        System.out.print("¡¡¡FELIZ NAVIDAD!!!\nVamos a hacer un árbol");

        /*Tronco*/
        System.out.println("¿Quieres que tenga tronco?(s/n)");
        tronco = eb.next();
        opcTronco = metTronco(tronco);

        /*Ramas*/
        System.out.println("Introduce la altura de \"*\" del árbol: ");
        rama = eb.nextInt();

        /*Decoración*/
        System.out.println("¿Quieres ponerle decoración al árbol?(s/n)");
        decoracion = eb.next();
        opcDecora = metOpcDecoracion(decoracion);


        /*Dibujo Final*/
        if (opcDecora == true) {
            comentario(rama);
            decoracion(opcDecora, rama);
        } else {
            comentario(rama);
            dibRamas(rama);
        }
        
        if (opcTronco.equals("s")) {
            dibTronco(rama, opcTronco);
        }
    }

    public static void comentario(int rama) {
        for (int i = 0; i < rama - 6; i++) {
            System.out.print(" ");
        }
        System.out.println(ANSI_RED + "FELIZ NAVIDAD");
    }
}
