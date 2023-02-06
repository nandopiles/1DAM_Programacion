
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

public class cond14 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Introduce 3 números reales:");
        num1 = tcl.nextDouble();
        num2 = tcl.nextDouble();
        num3 = tcl.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else {
            if (num1 < num3 && num3 < num2) {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
            if (num2 < num1 && num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
            if (num2 < num3 && num3 < num1) {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
            if (num3 < num1 && num1 < num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
            if (num3 < num2 && num2 < num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            }

        }

    }
}
