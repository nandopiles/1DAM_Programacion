/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nando
 */
public class quinto {
    public static void main(String[] args) {
        int a= 2;
        int b= 4;
        int Operacion1= -a+5 % b-a*a;
        int Operacion2=  5 + 3 % 7 * b * a - b % a;
        int Operacion3= (a+1) * (b + 1) - b / a;
        int Operacion4= a*((a+2)/b);
        
        
        System.out.println("-a+5 % b-a * a\n"+ Operacion1+"\n");
        System.out.println("5+3 % 7 * b * a–b % a\n"+ Operacion2+"\n");
        System.out.println("(a+1) * (b + 1) – b / a\n"+ Operacion3+"\n");
        System.out.println("a*((a+2)/b)\n"+ Operacion4);
    }
}
