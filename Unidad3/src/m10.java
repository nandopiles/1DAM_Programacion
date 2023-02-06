

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
public class m10 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int num, suma=0;
        
        while(suma<1000){
            System.out.println("Introduce un número:");
            num= tcl.nextInt();
            suma= suma+num;           
        }
        System.out.println("La suma da: "+suma);
    }
}
