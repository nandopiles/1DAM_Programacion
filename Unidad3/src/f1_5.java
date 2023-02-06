/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6jmati
 */
//Ej 6 While
import java.util.Scanner;

public class f1_5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, produc;

        System.out.println("Introduce un número:");
        num = tcl.nextInt();

        if (num > 0) {
            for (produc = 1; num > 1; num--) {
                produc = produc * num;
            }
            System.out.println("El factorial es " + produc);
        } else {
            System.out.println("Es un número negativo");
        }
    }
}

/*La diferencia que he podido ver es que se hace de manera más corta ya que cuando definimos el bucle For es donde ponemos ya todo,
tanto las condiciones, como el ir decrementando el número ha medida que vaya pasando...
Aunque no tiene muchas diferencias con el While, del do While sí que se diferencia más.*/
