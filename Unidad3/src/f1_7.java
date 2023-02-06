/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 9 While
import java.util.Scanner;

public class f1_7 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, exp, cont, produc = 1;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();
        System.out.println("¿A qué lo quieres elevar?");
        exp = tcl.nextInt();

        for (cont = 0; cont < exp; cont++) {
            produc = produc * num;
        }
        System.out.println("Eso da como resultado: " + produc);
    }
}

/*Veo que da igual con cual hacerlo, las ventajas del for son las mismas que en los ejemplos anteriores que
puedes definirlo todo el la configuración del for*/
