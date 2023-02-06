
import java.util.*;

public class mB8 {

    public static void hora(double[][] x) {
        Scanner eb = new Scanner(System.in);
        double hora;
        String ant = "";

        System.out.print("Introduce una hora(h,m): ");
        hora = eb.nextDouble();

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                if (hora > x[fila][col]) {
                    ant = ant + " " + fila + col;
                }
            }
        }
        System.out.println("Han entrado antes --> " + ant);
        System.out.println("");
    }

    public static void intervalo(double[][] x) {
        Scanner eb = new Scanner(System.in);
        int cont = 0;
        double hora1, hora2;

        System.out.print("Intervalo entre las: ");
        hora1 = eb.nextDouble();
        System.out.print("Y las: ");
        hora2 = eb.nextDouble();

        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                if (x[fila][col] > hora1 && x[fila][col] < hora2) {
                    cont++;
                }
            }
        }
        System.out.println("Empleados trabajando --> " + cont);
        System.out.println("");
    }

    public static void horaDepart(double[][] x) {
        Scanner eb = new Scanner(System.in);
        String[] depart = {"Panadería", "Carnicería", "Perfumería", "Verdulería", "Charcutería", "Almacén", "Ventas"};
        double hora;
        int cont = 0;

        System.out.print("Introduce una hora(h,m): ");
        hora = eb.nextDouble();
        for (int fila = 0; fila < x.length; fila++) {
            for (int col = 0; col < x[fila].length; col++) {
                if (x[fila][col] <= hora) {
                    cont++;
                }
            }
            System.out.println(depart[fila] + ": " + cont);
            cont = 0;
        }
        System.out.println("");
    }

    public static void menu(double[][] x) {
        Scanner eb = new Scanner(System.in);
        int opc;

        do{
            System.out.printf("1. Empleados que llegaron antes de una hora (ID depart)%n"
                    + "2. Empleados trabajando en un intervalo de tiempo%n"
                    + "3. Empleados de cada departamento que trabajan desde antes de una hora%n"
                    + "4. Salir%n%n");
            
            opc = eb.nextInt();
            switch (opc) {
                case 1:
                    hora(x);
                    break;
                case 2:
                    intervalo(x);
                    break;
                case 3:
                    horaDepart(x);
                    break;
                case 4:
                    System.out.println("Hasta Luego");
                    break;
            }
        }while (opc != 4);   
    }

    public static void main(String[] args) {
        //filas departamento, columnas empleado
        boolean sig = true;
        double[][] control = {{7.30, 7.35, 9.30, 9.30, 9.30, 13.00},
        {7.30, 12.30, 13.06, 17.17, 19.00, 9.32},
        {7.30, 12.00, 13.27, 15.40, 17.07, 18.00},
        {9.00, 13.06, 7.30, 7.30, 9.30, 17.07},
        {9.14, 9.30, 17.07, 13.06, 15.40, 15.40},
        {12.30, 17.07, 7.30, 9.30, 15.40, 13.06},
        {9.00, 9.30, 13.06, 17.07, 7.30, 9.30}};

        menu(control);
    }
}
