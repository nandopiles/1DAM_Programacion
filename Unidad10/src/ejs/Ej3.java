//@author Nando

import java.io.*;

public class Ej3 {

    public static void main(String[] args) {
        BufferedReader br = null;        
        String nombre = "z.txt", texto;
        int cont = 0;

        try {
            br = new BufferedReader(new FileReader(nombre));

            while ((texto = br.readLine()) != null) {
                System.out.println("Longitud --> " + texto.length());
                cont = 0;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Fichero no encontrado");
            ex.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Error de lectura del fichero");
            ex.printStackTrace();
        } finally {
            try {
                // Cerrar el fichero si se ha podido abrir
                if (br != null) {
                    br.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar el fichero");
                ex.printStackTrace();
            }
        }
    }
}
