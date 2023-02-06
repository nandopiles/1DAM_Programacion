/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 2 Do While
import java.util.Scanner;

public class f1_10 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        final int UNO;

        System.out.println("Escribe un número: ");
        num = tcl.nextInt();

        for (UNO = 1; num >= UNO; num--) {
            System.out.println(num);
        }
    }
}
/*Lo veo mejor hacerlo de esta manera auque en verdad estamos haciendo lo mismo pero con otro tipo de bucle*/
