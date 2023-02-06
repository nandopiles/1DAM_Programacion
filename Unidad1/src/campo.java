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

public class campo {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("instroduce una frase:");
        String Frase1= tcl.nextLine();
        System.out.println("instroduce una frase:");
        String Frase2= tcl.nextLine();
        
        String Solucion= Frase1.equals(Frase2)?"Son iguales":"NO son iguales";
        System.out.println(Solucion);
        
    }
}
