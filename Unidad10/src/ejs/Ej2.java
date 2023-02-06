
/**
 *
 * @author Nando
 */
import java.io.*;

public class Ej2 {

    public static void main(String[] args) {
        File f1 = new File("aguacate.txt");
        File f2 = new File("carrot.txt");
        File f3 = new File("union.txt");
        PrintWriter pw = null;
        BufferedReader br = null;
        BufferedReader br2 = null;
        String linea1 = null, linea2 = null;

        try {
            pw = new PrintWriter(f3);
            br = new BufferedReader(new FileReader(f1));
            br2 = new BufferedReader(new FileReader(f2));

            linea1 = br.readLine();
            linea2 = br2.readLine();

            while (linea1 != null || linea2 != null) {

                if (linea1 != null) {
                    pw.print(linea1 + " -- ");
                }
                if (linea2 != null) {
                    pw.println(linea2);
                }
                linea1 = br.readLine();
                linea2 = br2.readLine();
            }
        } catch (Exception e) {
            System.out.println("Mal");
        } finally {
            try {
                if (pw != null) {
                    pw.close(); //En cualquier caso cierra el fichero
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
