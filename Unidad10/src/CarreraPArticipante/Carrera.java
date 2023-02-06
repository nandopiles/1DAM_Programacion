package CarreraPArticipante;

//@author Nando

import java.util.*;
import java.io.*;

public class Carrera {
    
    static TreeSet<Participante> lista = new TreeSet<Participante>();
    
    public static void main(String[] args) {
        
        lista.add(new Participante("Juan", 1));
        lista.add(new Participante("Pepe", 2));
        lista.add(new Participante("Andrea", 3));
        lista.add(new Participante("Silvia", 3));
        lista.add(new Participante("Maria", 4));
        
        mostrarLista();
        exportarXML();
    }
    
    public static void exportarXML() {
        File f = new File("Carrera.txt");
        FileWriter fw = null;
        PrintWriter pw = null;
        Iterator it = lista.iterator();
        Participante p;
        String a;
        
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            fw = new FileWriter(f);
            pw = new PrintWriter(fw);
            
            pw.println("<?xml version=\"1.0\">");
            pw.println("<carrera>");
            while (it.hasNext()) {
                p = (Participante)it.next();
                pw.println("\t<participante>");
                pw.println("\t\t<dorsal>"+p.getDorsal()+"</dorsal>");
                pw.println("\t\t<nombre>"+p.getNombre()+"</nombre>");
                pw.println("\t</participante>");
            }
            pw.println("</carrera>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public static void mostrarLista() {
        Iterator it = lista.iterator();
        Participante p;       
        
        while (it.hasNext()) {
            p = (Participante)it.next();
            System.out.println(p+"\n");
        }
    }
}
