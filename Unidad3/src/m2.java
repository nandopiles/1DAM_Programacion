

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
public class m2 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int cont, num, sum;
        cont=0;
        sum= 0;
        
        System.out.println("Introduce un número:");
        num= tcl.nextInt();
        
        while(!(cont==num)){
        if (num>=1){
            while(cont<num){
                cont++;
            sum= sum+cont;}
        System.out.println("La suma es ="+sum);break;
        }
        else{
            System.out.println("La suma es =0");break;}
        }
        
    }
}
