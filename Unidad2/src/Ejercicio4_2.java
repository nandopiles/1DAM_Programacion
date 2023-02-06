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

public class Ejercicio4_2 {
    public static void main(String[] args) {
     Scanner tcl= new Scanner(System.in);
     
     System.out.println("Introduce una letra:");
     char letra1= tcl.next().charAt(0); 
     System.out.println("Introduce una letra:");
     char letra2 =tcl.next().charAt(0);
     
     String Solucion= letra1==letra2 ? "Son iguales":"No son iguales";
     System.out.println(Solucion);
        
    }
}
