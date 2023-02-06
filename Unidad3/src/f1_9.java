/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 12
import java.util.Scanner;

public class f1_9 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, coc, resto, div, resta;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();
        System.out.println("¿Por cuánto quieres dividirlo?");
        div = tcl.nextInt();

        for (coc = 0; num > 0; coc++) {
            num = num - div;
        }
        System.out.println("Cociente " + coc);
        System.out.println("Resto " + (-num));
    }
}
/*Veo que es lo mismo pero el for facilita la lectura y se hace más corto aunque sea la misma información
pero escrito de otra manera*/
