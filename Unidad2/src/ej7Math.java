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

public class ej7Math {
    public static void main(String[] args) {
        
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Introduce el Angulo:");
        double Angulo=tcl.nextDouble();
        System.out.println("Introduce el Lado Opuesto:");
        double Opuesto=tcl.nextDouble();
        
        double Hipotenusa1= Opuesto/Math.sin(Angulo);
        System.out.println("De la primera forma la Hipotenusa nos da: "+Hipotenusa1);
        
        double Adyacente= Opuesto/Math.tan(Angulo);
        double Hipotenusa2= Math.sqrt(Math.pow(Adyacente, 2)+Math.pow(Opuesto, 2));
        System.out.println("De la segunda forma la Hipotenusa nos da: "+Hipotenusa2);
      
        
        
    }
}
