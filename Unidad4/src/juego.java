
import java.util.Scanner;

public class juego {

    public static String nombre(String nom) { //método para asignar un nombre
        Scanner eb = new Scanner(System.in);
        nom = eb.nextLine();
        return nom;
    }

    public static int ConfMaxPts(int maxPts) { //método para poner el máximo de puntos como meta del juego
        Scanner eb = new Scanner(System.in);
        maxPts = eb.nextInt();
        return maxPts;
    }

    public static int tirarDado() { //método de tirar un dado (número aleatorio entre 1 y 6)
        return (int) (Math.random() * 6 + 1);
    }

    public static int factorial(int dado1) { //método para calcular el factorial
        int fact = 1;

        do {
            fact = fact * dado1;
            dado1--;
        } while (dado1 > 0);

        return (fact);
    }

    public static int sumatorio(int dado1) { //método para calcular el sumatorio
        int fact = 1;

        do {
            fact = fact + dado1;
            dado1--;
        } while (dado1 > 0);

        return (fact);
    }

    public static int cuadrado(int dado1) { //método para calcular el cuadrado
        int e;
        e = dado1 * dado1;
        return e;
    }

    public static int jugada(int j, String nom) { //método que te hace la introducción de la tirada de dados y luego dependiendo de los número que salgan llame al respectivo método
        Scanner eb = new Scanner(System.in);        //para calcular el valor con el que va a jugar cada jugador
        int dado1, dado2;
        System.out.println(nom + " es tu turno, tira el dado");
        eb.nextLine();
        dado1 = tirarDado();
        System.out.println("Ha salido el número " + dado1);
        System.out.println("");
        System.out.println(nom + " tira el dado otra vez");
        System.out.println("");
        eb.nextLine();
        dado2 = tirarDado();

        switch (dado2) { //dependiendo de lo que salga en el 2º dado va a llamar a un método u a otro
            case 1:
                System.out.println("Ha salido el número " + dado2 + " Vamos a hacer el factorial de " + dado1);
                j = factorial(dado1);
                System.out.println("Te da como resultado --> " + j);
                System.out.println("");
                break;

            case 2:
                System.out.println("Ha salido el número " + dado2 + " Vamos a hacer el sumatorio de " + dado1);
                j = sumatorio(dado1);
                System.out.println("Te da como resultado --> " + j);
                System.out.println("");
                break;

            case 3:
                System.out.println("Ha salido el número " + dado2 + " Vamos a hacer el cuadrado de " + dado1);
                j = cuadrado(dado1);
                System.out.println("Te da como resultado --> " + j);
                System.out.println("");
                break;

            case 4:
                System.out.print("Ha salido el número " + dado2 + " Mala suerte...\nTu número será --> 1\n");
                j = 1;
                System.out.println("");
                break;

            case 5:
                System.out.println("Ha salido el número " + dado2 + " Tu número será --> " + dado1);
                j = dado1;
                System.out.println("");
                break;

            case 6:
                System.out.print("Ha salido el número " + dado2 + " La peor suerte...\nTu número será 0\n");
                j = 0;
                break;
        }
        return j;
    }

    public static boolean opcFinal() {
        Scanner eb = new Scanner(System.in);
        String opcFin = eb.next();
        boolean jugar = true;

        switch (opcFin.toLowerCase()) {
            case "s":
                jugar = true;
                break;
            case "n":
                jugar = false;
                break;
        }
        return jugar;
    }

    //MAIN
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String opc, nom1 = "nombre1", nom2 = "nombre2", opcFin;
        int maxPts = 1000, pts1 = 0, pts2 = 0, j1 = 0, j2 = 0;
        boolean jugar = true;

        System.out.print("El máximo de puntos por defecto es: 1000\n¿Quieres cambiarlo?(s/n)");
        opc = eb.next();
        switch (opc.toLowerCase()) { //toLowerCase = si escribes la "s" en MAYÚSCULA da igual ya que va a transformar el String a minúscula
            case "s":
                System.out.println("Redirigiendo a conf de pts");
                System.out.print("¿A cuánto quieres poner el límite de pts?");
                maxPts = ConfMaxPts(maxPts);
                System.out.println("El nuevo límite son: " + maxPts + " pts");
                break;
            case "n":
                System.out.println("En ese caso, comencemos");
                break;
        }

        while (jugar == true) {
            pts1 = 0;
            pts2 = 0;
            System.out.println("Jugador 1, introduce nickname:");
            nom1 = nombre(nom1);
            System.out.println("Jugador 2, introduce nickname:");
            nom2 = nombre(nom2);
            System.out.println("");

            while (pts1 < maxPts && pts2 < maxPts) {
                j1 = jugada(j1, nom1);

                System.out.println("");

                j2 = jugada(j2, nom2);

                if (j2 < j1) {
                    System.out.printf("%s tenía %d pts%n", nom1, pts1);
                    pts1 = pts1 + j1 + j2;
                    System.out.printf("ahora ha ganado %d pts y suma un total de --> %d pts%n", j1 + j2, pts1);
                    pts2 = pts2 - j2;
                    System.out.printf("y %s tiene ahora un total de %d pts%n", nom2, pts2);
                } else if (j2 > j1) {
                    System.out.printf("%s tenía %d pts%n", nom2, pts2);
                    pts2 = pts2 + j2 + j1;
                    System.out.printf("ahora ha ganado %d pts y suma un total de --> %d pts%n", j2 + j1, pts2);
                    pts2 = pts2 - j2;
                    System.out.printf("y %s tiene ahora un total de %d pts%n", nom1, pts1);
                } else {
                    System.out.println("¡¡¡Empate!!!");
                }
            }
            if (pts1 > pts2) {
                System.out.printf("EL GANADOR DE ESTA PARTIDA ES...¡¡¡%s!!!%n", nom1);
                System.out.println("¿Quieres volver a jugar?");

                jugar = opcFinal();
            } else {
                System.out.printf("EL GANADOR DE ESTA PARTIDA ES...¡¡¡%s!!!%n", nom2);
                System.out.println("¿Quieres volver a jugar?(s/n)");

                jugar = opcFinal();
            }
        }
        System.out.println("¡Espero verte pronto!");
    }
}
