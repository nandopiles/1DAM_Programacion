
import java.util.*;

public class pVectores {

    public static int random() {
        return (int) (Math.random() * 3);
    }

    public static void rellenar(int[][] x) {
        Scanner eb = new Scanner(System.in);

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                System.out.print("Introduce la columna " + col + " de la fila " + fila + ": ");
                x[fila][col] = eb.nextInt();
            }
        }
        System.out.println("");
    }

    public static void rellenarRandom(int[][] x) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                System.out.print("Introduce la columna " + col + " de la fila " + fila + ": ");
                x[fila][col] = random();
                System.out.println(x[fila][col]);
            }
        }
        System.out.println("");
    }

    public static void visualizar(int[][] x) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                System.out.printf("%2d    ", x[fila][col]);
            }
            System.out.println("");
        }
        System.out.println("_________________");
        System.out.println("");
    }

    public static void producMatrices(int[][] x, int[][] y) {
        int[][] result = new int[3][3];
        int suma = 0;

        for (int fila = 0; fila < x.length; fila++) {           
            for (int col = 0; col < x[fila].length; col++) {
                for (int i = 0; i < x[fila].length; i++) {
                    suma += x[fila][i] * y[i][col];
                    result[fila][col] = suma;
                }
                suma = 0;
            }
        }
        visualizar(result);
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int f, c;
        int [][] mR1 = new int [3][3];
        int [][] mR2 = new int [3][3];

        System.out.println("¿Cuántas filas quieres?");
        f = eb.nextInt();
        System.out.println("¿Y columnas?");
        c = eb.nextInt();
        int [][] matriz = new int [f][c];
        
        rellenar(matriz);
        visualizar(matriz);
        
        rellenarRandom(mR1);
        visualizar(mR1);
        rellenarRandom(mR2);
        visualizar(mR2);
        System.out.println("Producto entre 2 matrices 3x3");
        producMatrices(mR1, mR2);
    }
}
