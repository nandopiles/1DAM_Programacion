
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

public class cond12 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dia, mes, año;
        int enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;

        System.out.println("Dime un día:");
        dia = tcl.nextInt();
        System.out.println("Dime un mes:");
        mes = tcl.nextInt();
        System.out.println("Dime un año");
        año = tcl.nextInt();

        enero = 1;
        febrero = 2;
        marzo = 3;
        abril = 4;
        mayo = 5;
        junio = 6;
        julio = 7;
        agosto = 8;
        septiembre = 9;
        octubre = 10;
        noviembre = 11;
        diciembre = 12;
          
        if ((((mes == enero || mes == marzo || mes == mayo || mes == julio || mes == agosto || mes == octubre || mes == diciembre) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31)) 
                || ((mes == abril || mes == junio || mes == septiembre || mes == noviembre) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 30))
                || ((mes== febrero)&&(mes>=1&&mes<=12)&&(dia>=1&&dia<=28)))
                &&(año >= 1970 && año < 3000)) {
            System.out.println("el día "+dia+" de "+mes+" del año "+año);
            }
         else {
            System.out.println("formato incorrecto");
        }

    }
}
