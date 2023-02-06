

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
import java.util.Scanner;

public class cond8 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce 3 números:");
        int num1 = tcl.nextInt();
        int num2 = tcl.nextInt();
        int num3 = tcl.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " es el mayor");
        } else {
            if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " es el mayor");
            } else {
                System.out.println(num3 + " es el mayor");
            }
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("y " + num1 + " el menor");
        } else {
            if (num2 <= num1 && num2 <= num3) {
                System.out.println("y " + num2 + " el menor");
            } else {
                System.out.println("y " + num3 + " el menor");
            }
        }
    }
}
