/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 2 While
import java.util.Scanner;

public class f1_2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, suma = 0;
        final int UNO = 1;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 1) {
            for (int cont = 0; cont <= num; cont++) {
                suma = suma + cont;
            }
            System.out.println("La suma de eso da: " + suma);
        } else {
            System.out.println("La suma es = 0");
        }
    }
}
/*La única diferencia que he podido ver esque en el for se necesita poner el <= en la condición, mientras que, en el While
solo hace falta poner el <
Y como siempre, que el for nos permite, mientras lo estamos configurando, asignar variables, decir el incremento de cuánto va a ser y las condiciones*/
