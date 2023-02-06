
import java.util.*;

public class mB9 {

    public static int random() {
        return (int) (Math.random() * 15);
    }

    public static void visualizar(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                System.out.printf("%2d    ", array[fila][col]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void rellenar(int[][] array) {
        Scanner eb = new Scanner(System.in);

        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                System.out.print("Introduce la  " + col + " de la fila " + fila + ": ");
                array[fila][col] = random();
                System.out.println(array[fila][col]);
                //array[fila][col] = eb.nextInt();
            }
        }
        System.out.println("");
    }

    public static void coste(int[][] x) {
        Scanner eb = new Scanner(System.in);

        for (int fila = x.length - 1; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                System.out.print("Introduce el coste del producto " + col + ": ");
                x[fila][col] = eb.nextInt();
            }
        }
    }

    public static void totalGeneral(int[][] x, int piez) {
        int suma = 0, coste = 1, costeTotal = 0;

        for (int col = 0; col < piez; col++) {
            for (int fila = 0; fila < x.length; fila++) {
                suma = suma + x[fila][col];
            }
            coste = x[x.length - 1][col] * suma;
            costeTotal = costeTotal + coste;
            suma = 0;
        }
        System.out.println("El coste total --> " + costeTotal);
        System.out.println(" __________________");
    }

    public static void pieza1Alm(int[][] x, int piez) {
        int suma = 0, coste = 1;

        for (int col = 0; col < piez; col++) {
            for (int fila = 0; fila < x.length; fila++) {
                suma = suma + x[fila][col];
            }
            coste = x[x.length - 1][col] * suma;
            suma = 0;
            System.out.println("El coste total de la pieza " + col + " --> " + coste);
        }
        System.out.println(" __________________");
    }

    public static void tPiezAlm(int[][] x) {
        int suma = 0, coste = 0;

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                coste = x[x.length - 1][col] * x[fila][col];
                suma = suma + coste;
            }
            System.out.println("Almacen " + fila + " costes --> " + suma);
            suma = 0;
        }
        System.out.println(" __________________");
    }
    
    public static void uPiezAlm(int[][]x) {
        int coste;
        
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                coste = x[fila][col] * x[x.length-1][col];
                System.out.println("Almacen "+fila+" Producto "+col+" --> "+coste);
            }
        }
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int alm, piez;

        System.out.print("Introduce nº de almacenes: ");
        alm = eb.nextInt();
        System.out.print("Introduce nº de piezas distribuidas por los almacenes: ");
        piez = eb.nextInt();
        System.out.println("");

        int[][] matriz = new int[alm + 1][piez];
        rellenar(matriz);
        coste(matriz);
        visualizar(matriz);
        //_______________________
        totalGeneral(matriz, piez);
        pieza1Alm(matriz, piez);
        tPiezAlm(matriz);
        uPiezAlm(matriz);
    }
}
