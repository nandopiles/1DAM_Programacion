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
public class Ejercicio4_5 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Dime de cuandos m es la Base:");
        double B = tcl.nextDouble();
        System.out.println("Dime de cuandos m es la Altura:");
        double H = tcl.nextDouble();
        
        double Area = B*H;
        
        System.out.println("Y su Área es de "+ Area+ " m^2");
    }
}
