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

public class f3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int sum = 0, num, cont, contsum;

        System.out.println("¿Cuántos números quieres sumar?");
        contsum = tcl.nextInt();

        for (cont = 0; cont < contsum; cont++) {
            System.out.println("(" + (cont + 1) + ")" + " Introduce un número:");
            num = tcl.nextInt();
            sum = sum + num;
        }
        System.out.println("La suma de estos " + cont + " números da como resultado --> " + sum);
    }
}
