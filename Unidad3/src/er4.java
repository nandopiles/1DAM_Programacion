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
public class er4 {
    public static void main(String[] args) {
        Scanner eb= new Scanner (System.in);
        int n, mult;
        
        System.out.println("Introduce un número:");
        n= eb.nextInt();
        
        if (n>=3) {
             for (mult = 3; mult <= n; mult+=3) { 
                 System.out.print("El múltiplo="+mult+" divisores del "+mult+"->");
                 for (int div = 1; div <= mult; div++) {
                     if (mult%div==0) {
                         System.out.print(div+" ");
                     }
                 }
                 System.out.println();
            }
        }else{
            System.out.println("El número es menor de 3");}       
    }
}
