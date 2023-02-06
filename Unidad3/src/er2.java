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

public class er2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int mult, n;

        for (n = 1; n <= 9; n++) {
            for (mult = 1; mult <= 10; mult++) {
                System.out.printf("%2d x %2d = %2d%n" ,n,mult,n * mult);
            }
            mult = 1;
            System.out.println("______________");
        }
    }
}
