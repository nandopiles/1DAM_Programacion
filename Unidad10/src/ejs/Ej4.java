 //@author 6jmati
 
import java.io.*;

public class Ej4 {
    public static void main(String[] args) {
        File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        BufferedReader br = null;
        String texto;
        
        try {
            fichero = new File("z.txt");
            writer = new FileWriter(fichero, true);
            pw = new PrintWriter(writer);
            br = new BufferedReader(new FileReader("carrot.txt"));
            while ((texto = br.readLine()) != null) {
                pw.println(texto);
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
        }
    }
}
