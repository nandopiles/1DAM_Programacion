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

public class r1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if ((num <= 5 && num >= 1)) {
            do {
                System.out.println("La entrada es correcta");
                num = tcl.nextInt();
            } while (num <= 5 && num >= 1);
        }
        System.out.println("La entrada es incorrecta");

    }
}
