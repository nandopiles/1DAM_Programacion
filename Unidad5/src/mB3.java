
//import java.util.*;

public class mB3 {

    public static void visualizar(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                System.out.printf("%2d    ", array[fila][col]);
            }
            System.out.println("");
        }
    }

    public static void rellenar(int[][] array) {
        //Scanner eb = new Scanner(System.in);

        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                System.out.print("Introduce la columna " + col + " de la fila " + fila + ": ");
                array[fila][col] = random();
                System.out.println(array[fila][col]);
                //array[fila][col] = eb.nextInt();
            }
        }
    }

    public static int random() {
        return (int) (Math.random() * 15);
    }

    public static void copiar(int[][] x, int[][] y) {
        //copiar las 5 columnas de una a otra
        for (int col = 0; col < 5; col++) {
            for (int fila = 0; fila < x.length; fila++) {
                y[fila][col] = x[fila][col];
            }
        }
    }

    public static void suma(int[][] x, int[][] y) {
        int suma = 0;

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                suma = suma + x[fila][col];
            }
            y[fila][5] = suma;
            suma = 0;
        }
    }

    public static void media(int[][] y) {
        int media = 0;
        
        for (int col = 6; col < 7; col++) {
            for (int fila = 0; fila < y.length; fila++) {
                media = y[fila][5]/5;
                y[fila][col] = media;
            }
        }
    }

    public static void main(String[] args) {
        int[][] x = new int[7][5];
        int[][] y = new int[7][7];

        rellenar(x);
        System.out.println("");
        visualizar(x);
        System.out.println("");
        copiar(x, y);
        visualizar(y);
        System.out.println("");
        suma(x,y);
        visualizar(y);
        System.out.println("");
        media(y);
        visualizar(y);
    }
}
