/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 3 Do While
import java.util.Scanner;

public class f1_11 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont,
                a = 0, e = 0, i = 0, o = 0, u = 0;;
        String palabra;
        char next;

        System.out.println("Introduce una palabra:");
        palabra = tcl.nextLine();
        num = palabra.length();

        for (cont = 0; cont != num; cont++) {
            switch (next = palabra.charAt(cont)) {
                case 'a','A':
                    a++;
                    break;
                case 'e','E':
                    e++;
                    break;
                case 'i','I':
                    i++;
                    break;
                case 'o','O':
                    o++;
                    break;
                case 'u','U':
                    u++;
                    break;
            }
        }
        System.out.println("La palabra " + "\"" + palabra + "\"" + " tiene " + num
                + " caracteres\nY tiene:\n" + a + " --> A\n" + e + " --> E\n" + i + " --> I\n" + o + " --> O\n" + u + " --> U");
    }
}

/*es igual solo que he tenido que cambiar el primer parámetro del for y cambiarlo por el contador, sino no me funcionaba y no sé porque.*/
