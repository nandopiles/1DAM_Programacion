package Vocales;

//@author 6jmati
import java.util.*;
public class Vocales {

    public static void main(String[] args) {
        //String[] cadenas = {null, "aEiou", "ccc", "Aeina", "aceituno"};
         String[] cadenas=null;
        /*Probad el funcionamiento con las 2 definiciones
        anteriores*/
        try {
            String[] c5v = obtenerArrCad5Vocales(cadenas);
            System.out.println(Arrays.toString(c5v));
        } catch (NullPointerException e) {
            System.out.println("La cadena es nulo");
        }
    }
    
    public static String[] obtenerArrCad5Vocales(String[] array) {
        ArrayList<String> miLista = new ArrayList<String>();
        String[] arrayString = null;
                
        for (int i = 0; i < array.length; i++) {
            try{
                if (array[i].toLowerCase().contains("a")) 
                    if (array[i].toLowerCase().contains("e")) 
                        if (array[i].toLowerCase().contains("i")) 
                            if (array[i].toLowerCase().contains("o")) 
                                if (array[i].toLowerCase().contains("u"))
                                    miLista.add(array[i]); 
            } catch(Exception e2) {
            }
        }
        arrayString = miLista.toArray(new String[miLista.size()]);                     
        return arrayString;
    }
}
