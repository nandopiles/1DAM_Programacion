

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
public class r8 {
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
//La diferencia entre hacer el While o el Do While en este ejercicio es:
/*En este caso nos pasa lo mismo que en anterior, nos da igual con qué hacerlo ya que al iniciar el programa se van
a imprimir por pantalla los números comprendidos del número introducido al 1 en orden descendente*/
