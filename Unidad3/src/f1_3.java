/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 3 While
import java.util.Scanner;

public class f1_3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, num2;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();
        System.out.println("Introduce otro número:");
        num2 = tcl.nextInt();

        if (num < num2) {
            for (int cont = num; cont <= num2; cont++) {
                System.out.println(cont);
            }
        } else {
            for (int cont = num2; cont <= num; cont++) {
                System.out.println(cont);
            }
        }
    }
}

/*Me ha parecido más sencillo hacerlo con el for ya que se hace mucho más fácil y de manera muy resumida*/
