package ExamenPractica;

//@author Nando

import java.util.*;
import java.io.*;

public class Main {
    
    static HashSet<Multimedia> lista = new HashSet<Multimedia>();
    
    public static void main(String[] args) {
        Disco d1, d2, d3;
        Peli p1, p2;
        
        d1 = new Disco("lala", Genero.ROCK, 3, "Bustamante");
        d2 = new Disco("pepe", Genero.FUNK, 3, "Maria Porrales");
        /*Repetido...*/
        d3 = new Disco("pepe", Genero.FUNK, 3, "Maria Porrales");
        p1 = new Peli("piratas", 50, "Di Caprio");
        p2 = new Peli("rata", 60, "Da Vincci");
        
        lista.add(d1);
        lista.add(d2);
        lista.add(d3);
        lista.add(p1);
        lista.add(p2);
        
        visualizar();
        
        System.out.println("Qué quieres buscar? --> piratas");
        String nombre = "piratas";
        
        ArrayList<Multimedia> listaArray = new ArrayList(lista);
        
        int indice = listaArray.indexOf(new Peli(nombre));
        System.out.println("Posición " + indice);
        if (listaArray.contains(p2)) {
            System.out.println(p2.getNombre());
        }
        if (indice != -1) {
            
            System.out.println("\n\n" + listaArray.get(indice).toString());
        }
        
    }
    
    public static void visualizar2(ArrayList<Multimedia> listaArray) {
        for(Multimedia m : listaArray) {
            if (m instanceof Disco) {
                System.out.println(((Disco)m).toString() + "\n___________________");
            } else if(m instanceof Peli) {
                System.out.println(((Peli)m).toString() + "\n___________________");
            }
        }
    }
    
    public static void visualizar() {
        for(Multimedia m : lista) {
            if (m instanceof Disco) {
                System.out.println(((Disco)m).toString() + "\n___________________");
            } else if(m instanceof Peli) {
                System.out.println(((Peli)m).toString() + "\n___________________");
            }
        }
    }
}
