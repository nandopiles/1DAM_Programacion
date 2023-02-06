

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
public class m12 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int num, coc=0, resto, div, resta;
        
        System.out.println("Introduce un número:");
        num= tcl.nextInt();
        System.out.println("¿Por cuánto quieres dividirlo?");
        div= tcl.nextInt();
        
        while(num>0){
        coc++;
        num= num-div;        
        }
        
        System.out.println("Cociente "+coc);
        System.out.println("Resto "+(-num));
        
        
    }
}
