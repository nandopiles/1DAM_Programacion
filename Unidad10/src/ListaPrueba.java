//@author Nando

import java.util.*;
public class ListaPrueba {
    static ArrayList<Pais> lista = new ArrayList<Pais>();
    
    public static void main(String[] args) {
        
        Pais p1, p2, p3, p4;
        
        p1 = new Pais("España");
        p2 = new Pais("Portugal");
        p3 = new Pais("Francia");
        p4 = new Pais("Masachuches");
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        lista.add(1, p4);
        
        int pos = lista.indexOf(p4);
        System.out.println("Posición " + pos);
        visualizar();
    }
    public static void visualizar() {
        for(Pais p : lista) {
            System.out.println(p.toString());
        }
    }
}
