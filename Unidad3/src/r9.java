
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

public class r9 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, produc = 1;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 1) {
            do {
                produc = num * produc;
                num--;
            } while (num > 1);
            System.out.println("El factorial es " + produc);
        } else {
            System.out.println("Es negativo");
        }
    }
}
//La diferencia entre hacer el While o el Do While en este ejercicio es:
/*Aquí no es lo mismo ya que al iniciarse SÍ O SÍ 1 vez mínimo dándole igual la condición que le ponemos en el While,
hay que introducir un IF para que entre o no al DO, ya que sino podríamos introducir un -2 por ejemplo y no queremos eso, queremos que si se nos
introduce un número negativo nos diga: "Es negativo"*/
