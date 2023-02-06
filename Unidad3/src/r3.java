

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nando
 */
import java.util.Scanner;

public class r3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont = 0,
                a = 0, e = 0, i = 0, o = 0, u = 0;
        String palabra;
        char next;

        System.out.println("Introduce una palabra:");
        palabra = tcl.nextLine();
        num = palabra.length();

        do {
            next = palabra.charAt(cont);
            switch (next) {
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
            cont++;
        } while (cont != num);
        System.out.println("La palabra " + palabra + " tiene " + num + " caracteres\nY tiene:\n" + a + " A\n" + e + " E\n" + i + " I\n" + o + " O\n" + u + " U");
    }
}
