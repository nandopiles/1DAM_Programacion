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

public class ej3 {
    public static void main(String[] args) {
        
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Pon el precio de las zapatillas:");
        double PrecioInicial=tcl.nextDouble();
        
        System.out.println("Pon el descuento que se va a aplicar:");
        double Porcentaje= tcl.nextDouble();
        
        double Descuento= PrecioInicial*(Porcentaje/100);
        double PrecioFinal= PrecioInicial-Descuento;
        
        System.out.println("el precio final de las zapatillas seran: "+PrecioFinal+"€");
        
    }
    
}
