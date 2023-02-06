

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
public class cond6 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        double dinero;
        double cantidad200, cantidad100, cantidad50, cantidad20, cantidad10, cantidad5, cantidad2, cantidad1;
        
        System.out.println("Introduce una cantidad de euros");
        dinero= tcl.nextDouble();
        
        
        cantidad200= dinero/200;
        dinero %= 200;
        
        cantidad100= dinero/100;
        dinero %= 100;
        
        cantidad50= dinero/50;
        dinero %= 50;
        
        cantidad20= dinero/20;
        dinero %= 20;
        
        cantidad10= dinero/10;
        dinero %= 10;
        
        cantidad5= dinero/5;
        dinero %= 5;
        
        cantidad2= dinero/2;
        dinero %= 2;
        
        cantidad1= dinero/1;
        dinero %= 1;
        
        System.out.println("Te cambiarán: "+cantidad200+cantidad100+cantidad50+cantidad20+cantidad10+cantidad5+cantidad2+cantidad1);
        
        
        
        
        
        
    }
}
