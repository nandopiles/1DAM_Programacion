import java.util.*;

public class mB5 {
    
    public static void main(String[] args) {
        int [][] matriz1 = new int [5][4];
        int [][] matriz2 = new int [5][4];
        int [][] suma = new int [5][4];
        
        rellenar(matriz1);
        System.out.println("Matriz 1");
        visualizar(matriz1);
        rellenar(matriz2);
        System.out.println("Matriz 2");
        visualizar(matriz2);
        sumaMatriz(matriz1, matriz2,suma);
        System.out.println("Suma de Matrices");
        visualizar(suma);
    }
    
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
        System.out.println("");
    }
    
    public static void sumaMatriz(int[][] x, int[][] y, int[][] suma) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                suma[fila][col] = x[fila][col] + y[fila][col];
            }
        }
        System.out.println("");
    }
}
