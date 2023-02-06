package RandomFile;

//@author Nando

import java.util.*;
import java.io.*;

public class RandomPalabra {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        RandomAccessFile raf = null;
        String palabra, x;
        
        System.out.print("Palabra: ");
        palabra = eb.next();
        try {
            raf = new RandomAccessFile("random.txt", "rw");
            x = raf.readLine();
            while (x.length() != 0) {
                x = x.replaceAll(palabra, palabra.toUpperCase());
                raf.seek(raf.getFilePointer() - x.length());
                raf.writeBytes(x);
                x = raf.readLine();
            }
        } catch (Exception e) {
            
        }
    }
}
