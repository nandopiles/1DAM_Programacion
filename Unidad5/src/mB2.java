//import java.util.*;

public class mB2 {
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
                if (fila % 2 != 0 || fila == 0) {
                    array[fila][col] = 0; 
                }else{
                    array[fila][col] = 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int [][] TB = new int [10][10];
        
        rellenar(TB);
        System.out.println("");
        visualizar(TB);
    }
}
