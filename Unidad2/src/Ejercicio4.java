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

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl=new Scanner(System.in);
    
        System.out.println("¿Llueve?");
        boolean lluvia= tcl.nextBoolean();
        System.out.println("¿Hace sol?");
        boolean sol= tcl.nextBoolean();
        System.out.println("¿Cuántos días han pasado  desde el último riego?");
        int diasRiego= tcl.nextInt();
        System.out.println("¿Cuántos días han pasado desde que abonaste?");
        int diasAbono= tcl.nextInt();
        
        System.out.println("¿Riegas?");
        String Riegas= (lluvia==true)||(diasRiego<5==true)||(sol==true)?"false":"true";
        System.out.println(Riegas);
        System.out.println("¿Abonas?");
        String Abonas= diasAbono<10?"false":"true";
        System.out.println(Abonas);
                                                                                      
    }
    
}
