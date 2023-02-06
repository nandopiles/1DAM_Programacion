

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
public class m5 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner (System.in);
        int num, cont, sum=0;
        
        System.out.println("Introduce un número:");
        num= tcl.nextInt();
        
        while(num>=0){
            sum= sum+num;
            System.out.println("Introduce un número:");
            num= tcl.nextInt();}
        
        System.out.println("La suma da "+sum);
    }
}
