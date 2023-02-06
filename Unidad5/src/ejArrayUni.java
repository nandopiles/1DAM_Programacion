
import java.util.*;

public class ejArrayUni {

    public static void leerArray(int[] array) {
        Scanner eb = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = eb.nextInt();
        }
    }

    public static void ejercicio1() {
        Scanner eb = new Scanner(System.in);
        int[] array;
        int l = 10, opc, suma = 0;
        array = new int[l];

        System.out.println("Introduce los datos en el array");
        leerArray(array);

        System.out.println("¿Hasta que posición quieres sumar?");
        opc = eb.nextInt();
        while (opc <= 0 && opc > l) {
            System.out.println("Opc no Válida, vuelva a repetir:");
            opc = eb.nextInt();
        }

        for (int i = 0; i < opc; i++) {
            suma = suma + array[i];
        }
        System.out.println("El contenido de la Array es --> " + Arrays.toString(array));
        System.out.printf("Y la suma hasta la posición nº %d es igual a --> %d%n", opc, suma);
    }

    public static void escribirEj2(int[] destino, int c) {
        for (int i = 0; i < c; i++) {
            System.out.print(destino[i] + " ");
        }
    }

    public static void ejercicio2() {
        int[] destino;
        int l = 12, c = 0;
        int[] a1 = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        destino = new int[l];

        System.out.println("Posición de los número pares:");
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] % 2 == 0) {
                System.out.print(i + " ");
            }

            if (a1[i] % 2 == 0 && a1[i] > 25) {
                destino[c] = a1[i];
                c++;
            }
        }
        System.out.println("");
        System.out.println("El primer array --> " + Arrays.toString(a1));
        System.out.print("El segundo array --> ");
        escribirEj2(destino, c);
    }

    public static void ejercicio3() {
        int l = 10;
        int[] numeros;
        numeros = new int[l];

        System.out.println("Introduce números a la array:");
        leerArray(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void ejercicio4() {
        int[] array;
        array = new int[10];
        int mayor = 0, posicion = 0;
        leerArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
                posicion = i + 1;
            }
        }
        System.out.printf("El número mayor es %d que está en la posición %d%n", mayor, posicion);
    }

    public static void ejercicio5() {
        Scanner eb = new Scanner(System.in);
        int x = 5;
        int[] n;
        n = new int[x];

        System.out.println("Introduce 5 nums para formar uno y ver si escapicua:");
        System.out.println("(No puede pasar cada número del 9)");
        for (int j = 0; j < n.length; j++) {
            n[j] = eb.nextInt();
            while (n[j] < 0 || n[j] > 9) {
                System.out.println("Número incorrecto, vuelve a repetir:");
                n[j] = eb.nextInt();
            }
        }
        if (n[0] == n[n.length - 1]) {
            if (n[1] == n[n.length - 2]) {
                System.out.println("Es capicua");
            }
        } else {
            System.out.println("No es capicua");
        }
    }

    public static int random() {
        return (int) (Math.random() * 101);
    }

    public static void ejercicio6() {
        Scanner eb = new Scanner(System.in);
        int[] c, equipos;
        int n = 20, posicion;
        c = new int[n];
        equipos = new int[10];

        for (int i = 0, corredor = 1; i < c.length; i++, corredor++) {
            c[i] = random();
            System.out.print("Marca corredor nº" + corredor + " --> " + c[i]);
            System.out.println("");
        }

        for (int i = 0; i < c.length; i++) {
            posicion = i % 10;
            equipos[posicion] = equipos[posicion] + c[i];
        }

        System.out.println(Arrays.toString(equipos));
    }

    public static void leerArrayRandom(int[] array) {
        Scanner eb = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = random();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void repaso1() {
        int x = 20, posicion, j = 0;
        int[] n, ceros;
        n = new int[x];
        ceros = new int[x];

        leerArrayRandom(n);
        for (int i = 0;i < n.length; i++) {
            if (n[i] == 0) {
                ceros[j] = i;
                j++;
            }
        }
        posicion = ceros[0];
        if (j != 0) {
            System.out.println("El 1er 0 está en la posición "+(posicion+1));
        }else{
            System.out.println("No hay ningún 0 en la cadena");
            System.out.println(Arrays.toString(ceros));
        }       
    }

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        repaso1();
    }
}
