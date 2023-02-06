
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

public class r2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        final int UNIDAD=1;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();
        System.out.println("En orden decreciente del " + num + " hasta el " + UNIDAD + " sería:");

        do {
            System.out.println(num);
            num--;
        } while (num >= UNIDAD);
    }
}
