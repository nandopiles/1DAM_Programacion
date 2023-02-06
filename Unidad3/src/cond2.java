

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

public class cond2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduce un número:");
        double num1 = tcl.nextDouble();
        System.out.println("Introduce otro número:");
        double num2 = tcl.nextDouble();
        System.out.println("Ahora di que operación quieres hacer:(Introduce el número)\n1-suma\n2-multiplica\n3-divide");
        int operacion = tcl.nextInt();

        if (operacion == 1) {
            double suma = num1 + num2;
            System.out.println("La suma da " + suma);
        } else {
            if (operacion == 2) {
                double multi = num1 * num2;
                System.out.println("La multiplicación da " + multi);
            } else {
                double divide = num1 / num2;
                System.out.println("La división da " + divide);
            }
        }

    }
}
