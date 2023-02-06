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

public class ej5 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("¿De cuántos metros quieres que sea la Base?");
        double Base= tcl.nextDouble();
        System.out.println("¿Y de cuántos metros quieres que sea la altura?");
        double Altura= tcl.nextDouble();
        
        double Perimetro = (Base*2) + (Altura*2);
        double Area = Base*Altura;
        
        System.out.println("El Perímetro de este rectángulo es de "+ Perimetro+ " m");
        System.out.println("Y su Área es de "+ Area+ " m^2");
    }
}
