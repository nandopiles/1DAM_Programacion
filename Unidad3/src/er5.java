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

public class er5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float pesCalc,pSum=0, espCalc, eSum = 0;

        System.out.println("Introduce el peso de un mueble:");
        pesCalc = kb.nextFloat();
        pSum = pSum + pesCalc;
        System.out.println("Introduce el espacio que ocupa el mueble:");
        espCalc = kb.nextFloat();
        eSum = eSum + espCalc;

        while (pSum <= 27800 && eSum <= 26.75) {
            System.out.println("Introduce el peso de un mueble:");
            pesCalc = kb.nextFloat();
            pSum = pSum + pesCalc;
            System.out.println("Introduce el espacio que ocupa el mueble:");
            espCalc = kb.nextFloat();
            eSum = eSum + espCalc;
        }
        if (pSum > 27800) {
            System.out.println("El peso máximo es de 27800kg y tú has cargado " + pSum + " por lo tanto 27800 - " + pSum + " = " + -(27800 - pSum) + "kg tienes que quitar");
        } else {
            System.out.println("El volumen máximo es de 26.75m^3 y tú has cargado " + eSum + " por lo tanto 26.75 - " + eSum + " = " + -(26.75 - eSum) + "m^3 tienes que vaciar");
        }
    }
}
