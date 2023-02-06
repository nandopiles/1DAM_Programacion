
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
public class cond13 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int diaActual, mesActual, añoActual, diaNacimiento, mesNacimiento, añoNacimiento, años;
        
        System.out.println("¿A qué día estamos?");
        diaActual= tcl.nextInt();
        System.out.println("¿A qué mes estamos?");
        mesActual= tcl.nextInt();
        System.out.println("¿A qué año estamos?");
        añoActual= tcl.nextInt();
        
        System.out.println("¿Qué día es tu cumple?");
        diaNacimiento= tcl.nextInt();
        System.out.println("¿En qué mes es tu cumple?");
        mesNacimiento= tcl.nextInt();
        System.out.println("¿Qué año naciste?");
        añoNacimiento= tcl.nextInt();
        
       
        años= añoActual-añoNacimiento;
        
        if (mesActual>mesNacimiento){
            System.out.println("Tienes "+años);}
        else{
            años= años-1;
            if (diaActual<diaNacimiento){
                años= años-1;}           
            else{
            System.out.println("Tienes "+años);}
        }                
            
            
        
        
        
        
        
    }
}
