 //@author Nando

public class temp {

    public static void main(String[] args) {
        int[][] temperaturas = new int[12][];
        int mes;

        for (mes = 0; mes < 12; mes++) {
            switch (mes) {
                case 0,2,4,6,7,9,11:
                    temperaturas[mes] = new int[31];
                    break;
                case 1:
                    temperaturas[mes] = new int[28];
                    break;
                case 3,5,8,10:
                    temperaturas[mes] = new int[30];
                    break;
            }
        }
        rellenar(temperaturas);
        visualizar(temperaturas);
        minAnual(temperaturas);
        mediaMes(temperaturas);
        dias(temperaturas);
    }

    public static int random() {
        return (int) (Math.random() * 35);
    }

    public static void rellenar(int[][] x) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                x[fila][col] = random();
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
        System.out.println("");
    }

    public static void minAnual(int[][] x) {
        int min = x[0][0];

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                if (x[fila][col] < min) {
                    min = x[fila][col];
                }
            }
        }
        System.out.printf("La menor temperatura del año son: %2d grados", min);
        System.out.println("");
        System.out.println("");
    }

    public static void mediaMes(int[][] x) {
        int suma = 0, media = 0, fila, col;

        for (fila = 0; fila < x.length; fila++) {
            for (col = 0; col < x[fila].length; col++) {
                suma += x[fila][col];
            }
            media = suma / col;
            System.out.printf("La media del mes %2d --> %2d grados", fila, media);
            System.out.println("");
            suma = 0;
            media = 0;
        }
        System.out.println("");
    }

    public static void dias(int[][] temp) {
        int media;
        for (int dia = 0; dia < 20; dia++) {
            media = 0;
            for (int mes = 0; mes < temp.length; mes++) {
                media += temp[mes][dia];
            }
            System.out.println("La media del día " + dia + " es " + media / 12 +"º");
        }
    }
}
