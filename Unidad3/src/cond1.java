

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
public class cond1 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Introduce tu edad:");
        int edad= tcl.nextInt();
        
        if (edad>=18){
            System.out.println("Es mayor de edad");}
        else{
            System.out.println("Es menor de edad");}
    }
}
