
//import java.util.*;

public class mB1 {

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
    }

    public static void fila5(int[][] array) {
        System.out.println("Visualización de la fila 5:");
        for (int fila = 4; fila <= 4; fila++) {
            for (int col = 0; col < array[fila].length; col++) {
                System.out.printf("%2d    ", array[fila][col]);
            }
        }
        System.out.println("");
    }

    public static void change(int[][] x) {
        System.out.println("fila 4 columna 3 x fila 5 x columna 3");
        int[][] secun = new int[1][1];

        secun[0][0] = x[3][2];
        x[3][2] = x[4][2];
        x[4][2] = secun[0][0];

        visualizar(x);
    }

    public static void changeLine(int[][] x) {
        int[][] secun = new int[5][1];
        
        System.out.println("Intercambiar los datos de la 1ª columna y la 4ª");
        //metemos los datos de la 1ª columna en nuestra array secundaria
        for (int col = 0; col < 1; col++) {
            for (int fila = 0; fila < x.length; fila++) {
                secun[fila][col] = x[fila][col];
            }
        }
        //visualizar(secun);
        //cambiamos la información de la 1ª columna x la de la 4ª
        for (int col = 0; col < 1; col++) {
            for (int fila = 0; fila < x.length; fila++) {
                x[fila][col] = x[fila][3];
            }
        }
        //cambiamos la información de la 4ª columna x la array secundaria
        for (int col = 0; col < 1; col++) {
            for (int fila = 0; fila < x.length; fila++) {
                x[fila][3] = secun[fila][col];
            }
        }
        visualizar(x);
    }

    public static void main(String[] args) {
        int[][] array = new int[5][7];

        rellenar(array);
        System.out.println("");
        visualizar(array);
        System.out.println("");
        fila5(array);
        System.out.println("");
        change(array);
        System.out.println("");
        changeLine(array);
    }
}
