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
   
public class ej2 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Primera nota:");
        double nota1= tcl.nextDouble();
        System.out.println("Segunda nota:");
        double nota2= tcl.nextDouble();
        
        double suma= (nota1+nota2)/2;
        
        System.out.println("Tu nota media final es: "+suma);
    }
 
}
