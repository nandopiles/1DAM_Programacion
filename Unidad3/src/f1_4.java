/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 4 While
import java.util.Scanner;

public class f1_4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, num2;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();
        System.out.println("Introduce otro número:");
        num2 = tcl.nextInt();

        if (num < num2) {
            for (int cont = num2; cont >= num; cont--) {
                System.out.println(cont);
            }
        } else {
            for (int cont = num; cont >= num2; cont--) {
                System.out.println(cont);
            }
        }
    }
}
/*Digo lo mismo que el ejercicio anterior, me parece que se ve de manera mucho más fácil con este método que con el While
Lo veo todo mucho más resumido y más sencillo*/
