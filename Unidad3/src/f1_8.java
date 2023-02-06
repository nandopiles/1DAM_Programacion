/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 11
import java.util.Scanner;

public class f1_8 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, produc, cont = 0, mult, suma = 0;

        System.out.println("Introduce un número");
        num = tcl.nextInt();
        System.out.println("¿por cuánto lo quieres multiplicar?");
        produc = tcl.nextInt();

        for (mult = num; cont != produc; cont++) {
            suma = suma + num;
        }
        System.out.println("La multiplicación da: " + suma);
    }
}

/*Veo que ha sido bastante parecido así que daría un poco más igual con que bucle lo queramos hacer
yo lo haría con el que más cómodo me sintiera*/
