package HashMap;

//@author Nando

import java.util.*;
public class Diccionario {
    public static void main(String[] args) {
        HashMap diccionario = new HashMap();
        
        diccionario.put("usuario", "nando");
        diccionario.put("país", "españa");
        diccionario.put("ciudad", "kk");
        diccionario.put("ciudad", "valencia"); //sustituye
        
        String valor = diccionario.get("ciudad").toString();
        
        System.out.println(valor);
        
        //________________________________________
        
        HashMap<Integer, String> ejemplo = new HashMap<Integer, String>();
        
        ejemplo.put(0, "hola");
        ejemplo.put(1, "adiós");
        ejemplo.put(2, "cabra");
        
        //creamos una variable Integer que va a tener la información de todas las keys que tenemos en nuestro HashMap
        Set<Integer> keys = ejemplo.keySet();
        
        //iteramos la variable que contiene cada key de nuestro HashMap
        for (Integer key:keys) {
            String valor2 = ejemplo.get(key);
            System.out.println("valor " + key + " " + valor2);
        }
        
        //ver si existe una variable mirando su key
        System.out.println(ejemplo.containsKey(2));               
    }
}
