


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
public class r4 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int num, cont=0;
        
        System.out.println("Introduce un número");
        num= tcl.nextInt();
        
        if(num>0){
            do {
                System.out.println("*");
                cont++;
            } while (cont!=num);
            
        }
        else{
            System.out.println("*");
        }
    }
}
