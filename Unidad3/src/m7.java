

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

public class m7 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, cont=0;

        System.out.println("Introduce un número entero y positivo:");
        num = tcl.nextInt();

        if (num > 0) {
            while (!(num == 0)) {
                num = num / 10;
                cont++;                
            }
            System.out.println("El número que has introducido tiene "+cont+ " dígitos");
        }
        
        else{
            System.out.println("El número es negativo");}
        
        
                
    }
}
