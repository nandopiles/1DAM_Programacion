
import java.util.*;

public class ejString1 {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String nom, ap1, ap2, cad, cad1, cad2, inv = "";
        int posicion, cont = 0;
        char caract, nCaract;
        //Introducir datos
        System.out.print("Buenas,\nIntroduce tu nombre por favor: ");
        nom = eb.nextLine();
        System.out.print("Introduce tu primer apellido: ");
        ap1 = eb.nextLine();
        System.out.print("Introduce tu segundo apellido: ");
        ap2 = eb.nextLine();
        //nombre completo
        cad = nom.concat(" ").concat(ap1).concat(" ").concat(ap2);
        
        //Nombre completo en min
        cad1 = nom.concat(" ").concat(ap1).concat(" ").concat(ap2).toLowerCase();
        System.out.println(cad1);
        
        //Nombre completo en may
        cad2 = nom.concat(" ").concat(ap1).concat(" ").concat(ap2).toUpperCase();
        System.out.println(cad2);
        
        //2 primeros carcts SI la longitud es de 2 o +
        if (cad.length() >= 2) {
            System.out.println(cad1.substring(0, 2));
        }
        
        //2 últimos caracts SI longitud es 2 o +
        if (cad.length() >= 2) {
            System.out.println(cad1.substring(cad1.length()-2, cad1.length()));
        }
        
        //número de veces que aparece la última letra de la cadena
        caract = cad.charAt(cad.length()-1);
        posicion = cad.indexOf(caract);
        while (posicion != -1) { //mientras se encuentre el caracter           
            cont++;
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cad.indexOf(caract, posicion + 1);
        }
        System.out.println(cont);
        
        //ej. si la primera letra de la cadena es la P pues poner todas las P que hayan en la cadena en mayúscula
        caract = cad1.charAt(0);
        nCaract = Character.toUpperCase(caract); //para convertir a mayúsculas un char
        System.out.println(cad1.replace(caract, nCaract));
        
        //cadena de "***" por delante y por detrás
        System.out.println("***"+cad.concat("***"));
        
        //invertir una cadena
        for(int a = cad.length() ; a != 0 ; a--)
        {
            inv += cad.substring(a-1,a);
        }
        System.out.println(inv);
    }
}
