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

public class f2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont, produc = 1;

        for (cont = 0; cont < 5; cont++) {
            System.out.println("Introduce un número");
            num = tcl.nextInt();
            produc = produc * num;
        }
        System.out.println("El producto entre esos 5 números da: " + produc);
    }
}
