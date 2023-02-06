

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
public class cond4 {
    public static void main(String[] args) {
      Scanner tcl= new Scanner(System.in);
      int pasos;
      
        System.out.println("¿Cuántos pasos has dado hoy?");
        pasos= tcl.nextInt();
        
        if(pasos<=5){
            System.out.println("Tu llamada cuesta 0.10cts");}
        else{
            System.out.println("Tu llamada cuesta "+((pasos-5)*0.05+0.10)+"cts");}
        
      
    }
}
