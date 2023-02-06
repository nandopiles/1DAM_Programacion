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

public class Ejercicio4_3 {
    public static void main(String[] args) {       
        Scanner tcl= new Scanner(System.in);
     
     System.out.println("Introduce una frase:");
     String frase1= tcl.nextLine(); 
     System.out.println("Introduce una frase:");
     String frase2 =tcl.nextLine();
     
     String Solucion= frase1.equals(frase2) ? "Son iguales":"No son iguales";
     System.out.println(Solucion);
    }
}
