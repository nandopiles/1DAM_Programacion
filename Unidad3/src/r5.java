


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
public class r5 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner (System.in);
        int num, num2, suma=0;
        String opc;
        
        System.out.println("Escribe un número:");
        num= tcl.nextInt();
        suma= suma+num;
        
        do {
            System.out.println("Escribe otro número para sumar:");
            num= tcl.nextInt();
            suma= suma+num;
            System.out.println("Desea Continuar S/N");
            opc= tcl.next();
        } while (opc.equals("S")||opc.equals("s"));
        
        System.out.println("La suma da como resultado: "+suma);
    }
}
