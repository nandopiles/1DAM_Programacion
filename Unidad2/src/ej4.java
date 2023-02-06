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

public class ej4 {
    public static void main(String[] args) {
        
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("Teclea la Cantidad Inicial:");
        double CantidadInicial= tcl.nextDouble();
        System.out.println("Teclea el interés:");
        double Interes= tcl.nextDouble();
        System.out.println("Teclea la retención:");
        double Retencion= tcl.nextDouble();
        
        double InteresAnual= CantidadInicial * (Interes/100);
        double InteresMeses= CantidadInicial * ((Interes/100)/2);
        double RetencionHacienda= InteresMeses * (Retencion/100);
        double InteresNeto= InteresMeses - RetencionHacienda;
        double CantidadFinal= CantidadInicial + InteresNeto;
        
        System.out.println("Cantidad Inicial: " +CantidadInicial);
        System.out.println("Intereses Anuales: " +InteresAnual);
        System.out.println("Intereses a los 6 meses: " +InteresMeses);
        System.out.println("Retención Hacienda: " +RetencionHacienda);
        System.out.println("Interés Neto: " +InteresNeto);
        System.out.println("Cantidad Final: " +CantidadFinal);
    }
}
