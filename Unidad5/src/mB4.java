//import java.util.*;

public class mB4 {
    
    public static void main(String[] args) {
        int [][] x = new int [5][5];
        
        rellenar(x);
        visualizar(x);
    }
    
    public static void rellenar(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                if (fila == col || fila+col == array.length-1) {
                    array[fila][col] = 1;
                }else{
                    array[fila][col] = 0;
                }
            }
        }
    }
    
    public static void visualizar(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                System.out.printf("%2d    ", array[fila][col]);
            }
            System.out.println("");
        }
    }
}
