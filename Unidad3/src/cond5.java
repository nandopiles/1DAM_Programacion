
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

public class cond5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Escribe un número real:");
        double num1 = tcl.nextDouble();
        System.out.println("Escribe otro número real:");
        double num2 = tcl.nextDouble();

        if (num1 <= num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }
}
