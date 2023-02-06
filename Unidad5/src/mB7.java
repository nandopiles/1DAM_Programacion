import java.util.*;

public class mB7 {
    
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
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                if (fila == col) {
                    array[fila][col] = 1;
                }else{
                    array[fila][col] = random();
                }
            }
        }
    }
    
    public static void simetrico(int[][] x) {
        //no entiendo cómo hacerlo
        for (int fila = 1; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                if (x[fila][col] == x[col][fila]) {
                    
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        
        rellenar(matriz);
        visualizar(matriz);
        simetrico(matriz);
    }
}
