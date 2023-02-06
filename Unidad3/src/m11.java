

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
public class m11 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int num, mult, sum=0, cont=0;
        
        System.out.println("Introduce un número:");
        num= tcl.nextInt();
        System.out.println("¿Por cuánto quieres multiplicar ese número?");
        mult= tcl.nextInt();
        
        while(cont!=mult){
        cont++;
        sum= sum+num;
        }
        
        System.out.println(num+" * "+mult+" = "+sum);
    }
}
