import java.util.*;

public class ejString2 {
    public static String devMitad(String frase) {
        String mod;
        
         mod = frase.substring(0, frase.length()/2);
         return mod;
    }
    
    public static String cambEs(String frase) {
        String mod;
        
        mod = frase.replaceAll("es", "no es");
        return mod;
    }
    
    public static int buscarPal(String frase, String buscar) {
        int posicion, cont = 0;
        
        posicion = frase.indexOf(buscar);
        while (posicion != -1) {          
            cont++;
            posicion = frase.indexOf(buscar, posicion + 1);
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner eb = new Scanner (System.in);
        String f1, newF1, f2, newF2, f3, palF3;
        int newF3;
        
        //Te imprime la mitad de la frase/palabra
        System.out.print("Introduce una frase: ");
        f1 = eb.nextLine();
        newF1 = devMitad(f1);        
        System.out.println("Hasta la mitad  sería ---> "+newF1);
        System.out.println("");
        
        //Sustituir "es" por "no es"
        System.out.print("Introduce una frase que tenga \"es\": ");
        f2 = eb.nextLine();
        newF2 = cambEs(f2);
        System.out.println("Cambio \"es\" por \"no es\" ---> "+ newF2);
        System.out.println("");
        
        //Dado un texto y un String te dirá cuántas veces sale el String en el texto
        System.out.print("Introduce un texto: ");
        f3 = eb.nextLine();
        System.out.print("Introduce algo que quieras buscar: ");
        palF3 = eb.nextLine();
        newF3 = buscarPal(f3,palF3);
        System.out.println("\""+palF3+"\" ha aparecido "+newF3+" veces");
    }
}
