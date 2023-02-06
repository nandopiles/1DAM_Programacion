

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
public class m3 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Escribe un número:");
        num1= tcl.nextInt();
        System.out.println("Escribe otro número:");
        num2= tcl.nextInt();
        
        while(!(num1==num2)){
            if (num1<num2) {
                num1++;
                System.out.println(num1);
            }else{
            num2++;
                System.out.println(num2);}
}
    }
}
