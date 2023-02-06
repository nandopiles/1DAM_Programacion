
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

public class r6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;

        System.out.println("¿Qué edad tienes?");
        edad = tcl.nextInt();

        if (edad >= 5 && edad <= 25 && (!(edad % 2 == 0))) {
            do {
                System.out.println("La edad es VÁLIDA");
                System.out.println("Introduce otra edad:");
                edad = tcl.nextInt();
            } while (edad >= 5 && edad <= 25 && (!(edad % 2 == 0)));

            System.out.println("La edad no es válida");

        } else {
            System.out.println("La edad no es válida");
        }
    }
}
