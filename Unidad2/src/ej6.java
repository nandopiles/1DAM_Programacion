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

public class ej6 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de Segundos para empezar la conversión:");
        int Segundos= tcl.nextInt();
        
        double Minutos=Segundos/60;
        double Horas=Minutos/60;
        double Dias=Horas/24;
        
        System.out.println(Segundos+" segundos son "+Minutos+" minutos\n"+Horas+" horas\n"+Dias+" dias.");
                        
    }
    
}
