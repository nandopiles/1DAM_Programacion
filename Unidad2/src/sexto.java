/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nando
 */
public class sexto {
    public static void main(String[] args) {
        double Pi= 3.14;
        double Diametro= 15.5;
        double Radio= Diametro/2;
        double Altura= 42.4;
        
        double Area= 2 * Pi * Radio * Altura + 2 * Pi * (Radio * Radio);
        double Volumen= Pi + Altura * (Radio * Radio);
        
        System.out.println("El Área del cilindro es de " +Area +"cm^2 y el volumen es de " + Volumen + "cm^3");
        
    }
}
