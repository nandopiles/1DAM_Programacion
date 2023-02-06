
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

public class m6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, produc = 1, cont = 0;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 0) {
            while (!(cont == num)) {
                cont++;
                produc = produc * cont;

            }
            System.out.println("El factorial de " + num + " es " + produc);
            
        } else {
            System.out.println("Es un número negativo");
        }
    }
}
