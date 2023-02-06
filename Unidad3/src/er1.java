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
public class er1 {
    public static void main(String[] args) {
        Scanner kb= new Scanner (System.in);
        int opc;
        
        System.out.println("1.-Opción\n2.-Opción\n3.-Opción\n4.-Opción");
        opc= kb.nextInt();
        
        if (opc<4&&opc>=1) {
            do{
            switch(opc){
                case 1: System.out.println("1.-Opción\n2.-Opción\n3.-Opción\n4.-Opción");
                        opc= kb.nextInt();
                case 2: System.out.println("1.-Opción\n2.-Opción\n3.-Opción\n4.-Opción");
                        opc= kb.nextInt();
                case 3: System.out.println("1.-Opción\n2.-Opción\n3.-Opción\n4.-Opción");
                        opc= kb.nextInt();       
            }
        }while(opc>=1&&opc<4);
        System.out.println("Ya");
        }else{
            System.out.println("Error, número no encontrado");}
    }
}
