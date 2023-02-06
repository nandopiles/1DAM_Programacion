

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

public class cond10 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int hora, minuto, segundo, UNO;
        UNO = 1;

        System.out.println("Dime una hora:");
        hora = tcl.nextInt();
        System.out.println("Dime un minuto:");
        minuto = tcl.nextInt();
        System.out.println("Dime un segundo");
        segundo = tcl.nextInt();

        if ((hora <= 24 && hora >= 1) && (minuto <= 59 && minuto >= 0) && (segundo >= 0 && segundo <= 59)) {
            if (minuto == 59) {
                System.out.println("Son las "+hora+":"+minuto+":"+segundo);
                minuto = 0;
                hora = hora + UNO;
                System.out.println("Dentro de 1 min serán las " + hora + ":" + minuto + ":" + segundo);
            } else {
                System.out.println("Son las "+hora+":"+minuto+":"+segundo);
                minuto = minuto + UNO;
                System.out.println("Dentro de 1 min serán las " + hora + ":" + minuto + ":" + segundo);
            }
        } else {
            System.out.println("Formato Incorrecto");
        }

    }
}
