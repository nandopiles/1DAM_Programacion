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
public class Ejercicio4_4 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("teclea la distancia:");
        long distancia= tcl.nextLong();
        System.out.println("teclea la velocidad máxima:");
        long velMaxima= tcl.nextLong();
        System.out.println("teclea el tiempo en segundos:");
        long numSegundos= tcl.nextLong();
        
        long velocidad= distancia*60*60/numSegundos;
        String respuesta= velocidad>velMaxima? "MULTA":"BIEN";
        System.out.println("Ibas a una velocidad de "+velocidad+" por lo tanto "+respuesta);
        
    }
}
