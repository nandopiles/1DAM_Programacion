package ejemplos;

 //@author nando
 
import java.util.*;
import java.io.*;

public class f2 {
    public static void main(String[] args) {
        try {
            escribir();
            leer();
        } catch(FileNotFoundException e1) {
            System.out.println("Mal");
        } catch(IOException e2) {
            System.out.println("También mal");
        }
    }
    
    public static void escribir() throws FileNotFoundException, IOException {
        Scanner eb = new Scanner(System.in);
        String nombrep;
        int cant;
        float precio;
        FileOutputStream salida;
        DataOutputStream dos;
        
        salida = new FileOutputStream("C:\\Users\\6jmati\\Desktop\\carpeta\\dato.dat");
        dos = new DataOutputStream(salida);
        
        System.out.println("Producto: ");
        nombrep = eb.nextLine();
        System.out.println("Cantidad: ");
        cant = eb.nextInt();
        System.out.println("Precio: ");
        precio = eb.nextFloat();
        
        dos.writeUTF(nombrep);
        dos.writeInt(cant);
        dos.writeFloat(precio);
        
        dos.close();
    }
    
    public static void leer() throws FileNotFoundException, IOException{
        FileInputStream entrada = new FileInputStream("C:\\Users\\6jmati\\Desktop\\carpeta\\dato.dat");
        DataInputStream dis = new DataInputStream(entrada);
        String nombrep;
        int cant;
        float precio;
        
        while (dis.available() != 0) {
            nombrep = dis.readUTF();
            cant = dis.readInt();
            precio = dis.readFloat();
            System.out.println(nombrep + " " + cant + " " + precio);
        }
        dis.close();
    }
}
