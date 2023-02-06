

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
public class m8 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont = 0, contp = 0, contn = 0, nul = 0, sump=0,sumn=0;

        while (!(cont == 10)) {
            System.out.println("Introduce un número:");
            num = tcl.nextInt();
            cont++;
            if (num > 0) {
                contp++;
                sump=sump+num;
            } else if (num < 0) {
                contn++;
                sumn=sumn+num;
            } else {
                nul++;

            }

        }
        System.out.println("Hay " + contp + " numeros positivos , " + contn + "negativos y " + nul + " nulos");
        System.out.println("total positivos "+sump+" total negativos "+sumn);
    }
}

