
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

public class r10 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont = 0;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 0) {
            do {
                num = num / 10;
                cont++;
            } while (num != 0);
            System.out.println("El número introducido tiene " + cont + " dígitos");

        } else {
            System.out.println("Es negativo o 0");
        }
    }
}
//La diferencia entre hacer el While o el Do While en este ejercicio es:
/*Nos da igual cómo hacerlo, eso sí tendremos que poner un If para que nos filtre si el número es negativo o 0, o positivo*/
