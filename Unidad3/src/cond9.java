

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

public class cond9 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int cuota, años;
        double cuota65, cuota18ns, cuota18s;
        boolean socio;
        cuota = 500;

        System.out.println("¿Cuántos años tienes?");
        años = tcl.nextInt();

        if (años > 65) {
            cuota65 = 500 * 0.5;
            System.out.println("Tu cuota será de " + (500 - cuota65) + "€");
        } else {
            if (años < 18) {
                System.out.println("¿Tus padres son socios?(true,false)");
                socio = tcl.nextBoolean();
                if (socio == true) {
                    cuota18s = 500 * 0.35;
                    System.out.println("Tu cuota será de " + (500 - cuota18s) + "€");
                } else {
                    cuota18ns = 500 * 0.25;
                    System.out.println("Tu cuota será de " + (500 - cuota18ns) + "€");
                }
            }
            else{
                System.out.println("Tu cuota es de "+cuota+"€");}
        }
    }
}
