 //@author 6jmati

import java.util.*;
import java.io.*;

public class f1 {

    public static void main(String[] args) {
        /*String nombre;
        Scanner eb = new Scanner(System.in);

        System.out.print("Nombre: ");
        nombre = eb.nextLine();
        File f = new File(nombre);
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta: " + f.getPath());

        if (f.isFile()) {
            System.out.println("Tamaño: " + f.length());
        } else {
            File[] archivos = f.listFiles();
            for (File a : archivos) {
                System.out.println(a.getName());
            }
        }*/

 /*File fichero = new File("C:\\Users\\6jmati\\Desktop\\carpeta\\horario.jpeg");
        if (fichero.exists()) {
            System.out.println("Nombre del archivo " + fichero.getName());
            System.out.println("Ruta " + fichero.getPath());
            System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
            System.out.println("Se puede escribir --> " + fichero.canRead());
            System.out.println("Se puede leer --> " + fichero.canWrite());
            System.out.println("Tamaño --> " + fichero.length());
        }*/
 /*File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        
        try {
            archivo = new File("C:\\Users\\6jmati\\Desktop\\carpeta\\nada.txt");
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);
            
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }*/
        //ESCRIBIR UN FICHERO
        /*File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        
        try {
            fichero = new File("C:\\Users\\6jmati\\Desktop\\carpeta\\nada.txt");
            writer = new FileWriter(fichero, true); //si ponemos true escribe después de lo escrito,
            pw = new PrintWriter(writer);           //false sobreescribes
            for (int i = 0; i < 3; i++) {
                pw.println("Tonto");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }*/
        //BORRAR UN FICHERO
        /*File fichero = new File("C:\\Users\\6jmati\\Desktop\\carpeta\\nada.txt");
        
        if (fichero.exists()) {
            System.out.println("Nombre del archivo " + fichero.getName());
            System.out.println("Ruta " + fichero.getPath());
            System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
            System.out.println("Se puede escribir " + fichero.canRead());
            System.out.println("Se puede leer " + fichero.canWrite());
            System.out.println("Tamaño " + fichero.length());
        }
        fichero.delete();*/
        
        //ESCRIBIR CARACTER A CARACTER (ABECEDARIO)
        /*String nombre = "C:\\Users\\6jmati\\Desktop\\carpeta\\je.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(nombre);//Si no existe , lo crea
            for (char c = 'A'; c <= 'Z'; c++) {
                fw.write(c); //Escribe cada caracter
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
        
        //LEER UN FICHERO CARACTER A CARACTER
        String nombre = "lelo.txt";
        int car;
        //Declara una variable FileReader
        FileReader fr = null;
        try {
            fr = new FileReader(nombre); //Abre el fichero
            car = fr.read(); //Lee el primer caracter
            while (car != -1) { //Si existe, entra en el bucle
                car = fr.read();
            }//Lee otro caracter 
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close(); //En cualquier caso cierra el fichero
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
