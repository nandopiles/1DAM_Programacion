/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nando
 */
public class cuarto {
    public static void main(String[] args) {
        int CantidadInicial= 2000;
        double Interes= 0.0275;
        double Retencion= 0.18;
        
        double InteresAnual= CantidadInicial * Interes;
        double InteresMeses= CantidadInicial * (Interes/2);
        double RetencionHacienda= InteresMeses * Retencion;
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
