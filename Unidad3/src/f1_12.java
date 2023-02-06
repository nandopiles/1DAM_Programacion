/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 4 Do While
import java.util.Scanner;

public class f1_12 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 0) {
            for (cont = 0; cont < num; cont++) {
                System.out.println("*");
            }

        } else {
            System.out.println("*");
        }
    }
}
/*Veo lo mismo, mejor legibilidad y sencillez pero sigues haciendo los mismos pasos
como más cómodo lo hagas lo haría yo*/
