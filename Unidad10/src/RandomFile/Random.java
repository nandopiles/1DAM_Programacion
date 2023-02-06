package RandomFile;

//@author Nando
import java.io.*;
import java.util.*;

public class Random {
     
    public static void main(String[] args) {
        char c;
        String cConv;
        boolean finArchivo = false;
        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile("random.txt", "rw");
            System.out.println("Tamaño: " + raf.length());
            do {
                try {
                    c = (char) raf.readByte();
                    c = conversion(c);
                    switch (c) {
                        case 'a':
                            raf.seek(raf.getFilePointer() - 1);
                            raf.writeByte('1');
                            break;
                        case 'e':
                            raf.seek(raf.getFilePointer() - 1);
                            raf.writeByte('2');
                            break;
                        case 'i':
                            raf.seek(raf.getFilePointer() - 1);
                            raf.writeByte('3');
                            break;
                        case 'o':
                            raf.seek(raf.getFilePointer() - 1);
                            raf.writeByte('4');
                            break;
                        case 'u':
                            raf.seek(raf.getFilePointer() - 1);
                            raf.writeByte('5');
                            break;
                    }
                } catch (EOFException e) {
                    finArchivo = true;
                    raf.close();
                    System.out.println("[+]Conversiones Hechas");
                }
            } while (!finArchivo);
        } catch (FileNotFoundException e1) {
            System.out.println("[-]Archivo no encontrado");
        } catch (Exception e) {
            System.out.println("[-]Error");
        }
    }

    public static char conversion(char c) {
        String cConv;

        cConv = String.valueOf(c);
        cConv = cConv.toLowerCase();
        c = cConv.charAt(0);

        return c;
    }
}
