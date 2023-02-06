//import java.util.*;

public class mB6 {

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

    public static void menorMayor(int[][] x) {
        int menor = x[0][0];
        int mayor = x[0][0];
        String mayorPosicion = "0,0";
        String menorPosicion = "0,0";

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                if (x[fila][col] > mayor) {
                    mayor = x[fila][col];
                    mayorPosicion = fila + "," + col;
                }
                if (x[fila][col] < menor) {
                    menor = x[fila][col];
                    menorPosicion = fila + "," + col;
                }
            }
        }
        System.out.println("El MENOR GENERAL --> " + menor);
        System.out.println("Posición del MENOR GENERAL --> " + menorPosicion);
        System.out.println("El MAYOR GENEARL --> " + mayor);
        System.out.println("Posición del MAYOR GENERAL --> " + mayorPosicion);
        System.out.println("");
    }

    public static void menorMayorFila(int[][] x) {
        int mayor, menor;
        String mayorPosicion = "0,0";
        String menorPosicion = "0,0";

        for (int fila = 0; fila < x.length; fila++) {
            mayor = x[fila][0];
            menor = x[fila][0];
            for (int col = 0; col < x[fila].length; col++) {
                if (x[fila][col] > mayor) {
                    mayor = x[fila][col];
                    mayorPosicion = fila + "," + col;
                }
                if (x[fila][col] < menor) {
                    menor = 0;
                    
                    menor = x[fila][col];
                    menorPosicion = fila + "," + col;
                }
            }
            System.out.println("El MENOR  de la FILA " + fila + " --> " + menor);
            System.out.println("Posición del MENOR de la FILA " + fila + " --> " + menorPosicion);
            System.out.println("El MAYOR de la FILA " + fila + " --> " + mayor);
            System.out.println("Posición del MAYOR de la FILA " + fila + " --> " + mayorPosicion);
            System.out.println("");
        }
    }
    
    public static void sumaMedia (int [][] x) {
        int media = 0, suma = 0, cont = 0;
        
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                suma = suma + x[fila][col];
                cont++;
            }
        }
        media = suma / cont;
        System.out.println("La media --> "+ media);
        System.out.println("");
        System.out.println("La suma --> "+ suma);
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][6];

        rellenar(matriz);
        visualizar(matriz);
        menorMayor(matriz);
        menorMayorFila(matriz);
        sumaMedia(matriz);
    }
}
