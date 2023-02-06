

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
public class m9 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int num, cont=0, exp, produc=1;
        
        System.out.println("Introduce un número:");
        num= tcl.nextInt();
        System.out.println("¿A qué lo quieres elevar?");
        exp= tcl.nextInt();
        
        while(cont<exp){
        produc= produc*num;
        cont++;        
        }
        
        System.out.println("Eso da como resultado: "+produc);
    }
}
