 //@author 6jmati

import java.util.*;
import java.io.*;

public class ej1 {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        File f;
        String nombre;

        System.out.print("Nombre Fichero: ");
        nombre = eb.nextLine();
        f = new File(nombre);

        if (f.exists()) {
            System.out.println("El fichero " + nombre + " Existe");
            System.out.println(f.getName() + " se encuentra en la ruta --> " + f.getAbsolutePath());
        } else {
            System.out.println("El fichero " + nombre + " NO existe");
        }

        if (f.isFile()) {
            System.out.println("Es un Fichero");
        } else if (f.isDirectory()) {
            System.out.println("Es un Directorio");
        }

        if (f.isFile()) {
            System.out.println("Tamaño --> " + f.length());
            System.out.println("Cambiando de nombre...");
            f.renameTo(new File("copiaFichero.txt"));
        } else if (f.isDirectory()) {
            File[] archivos = f.listFiles();
            System.out.println("Archivos: ");
            for(File a : archivos) {
                System.out.println(a.getName());
            }        
        }
    }
}
