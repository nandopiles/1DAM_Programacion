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

public class er3_1 {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int n, cant_Divisores = 0, cont=2;

        System.out.println("Introduce un número:");
        n = eb.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser mayor que cero");
        } else {
            while (cont < n) {
                if (n % cont == 0) {
                    cant_Divisores++;
                }
                cont++;
            }
            if (cant_Divisores == 0 && n>1) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
        }
    }
}
