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
public class er3_2 {
    public static void main(String[] args) {
        Scanner eb= new Scanner (System.in);
        int n, i, j;
        boolean primo=true;
        
        do{
        System.out.println("Dame un número:");
        n= eb.nextInt();
        }while(n<=4);
        
        for (i = 2; i < n; i++) {
            for (j = 2; j < i&& primo; j++) {
                if (i%j==0) {
                    primo= false;
                }
            }
            if (primo) {
                System.out.println(i+" es primo");
            }
            primo=true;
        }
    }
}
