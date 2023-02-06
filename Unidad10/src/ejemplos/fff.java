 //@author 6jmati
package ejemplos;
 
import java.io.*;

public class fff {
    public static void main(String[] args) {
        
        String carpeta = "carpeta";
        File x = new File(carpeta);
        
        if (!x.exists()) {
            x.mkdir();
        }
        
        String nombre = "f.txt";
        File f = new File(nombre);
        
        try {
        if (!f.exists()) {
            f.createNewFile();
        }
        }catch(Exception e) {
            
        }
        
        if (f.exists()) {
            f.renameTo(new File("carpeta\\f.txt"));
        }
    }
}
