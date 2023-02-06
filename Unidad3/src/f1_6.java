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

public class f1_6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 0) {
            for (cont = 0; num != 0; cont++) {
                num = num / 10;
            }
            System.out.println("El número introducido tiene: " + cont + " dígitos");
        } else {
            System.out.println("Es un número negativo");
        }
    }
}
/*Me parece casi igual hacerlo con el While que hacerlo con el for, solo que la comodidad del for esque puedes poner el incremento, condición y asignación
mientras lo estás configurando*/
