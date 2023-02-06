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

public class ej1 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Introduce tu nombre completo:");
        String Nombre= tcl.nextLine();
        
        System.out.println("Introduce tu fecha de nacimiento:");
        String FechaN= tcl.nextLine();
       
        System.out.println("Tu nombre completo es "+Nombre+"\ny tu fecha de nacimiento es el "+FechaN);
    }
    
}
