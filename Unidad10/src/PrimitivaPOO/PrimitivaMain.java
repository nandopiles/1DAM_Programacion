package PrimitivaPOO;

//@author Nando
import java.io.*;
import java.util.*;

public class PrimitivaMain {

    static Scanner eb = new Scanner(System.in);
    static Scanner fr = new Scanner(System.in);

    public static void main(String[] args) {
        Boleto win = null;
        Boleto b = null;
        int opc, c = 50, r = 10;

        
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    win = new Boleto();
                    win.rellenoAutomatico(c, r);
                    System.out.println("Boleto Ganador:");
                    win.visualizarBoleto();
                    escribirFichero(win);

                    b = new Boleto();
                    b.rellenoManual();
                    System.out.println("Tu Boleto:");
                    b.visualizarBoleto();

                    b.premio(win);
                    break;
                case 2:
                    break;
            }
        } while (opc != 2);
    }

    public static void escribirFichero(Boleto win) {
        File f = new File("BoletosGanadores.txt");
        FileWriter fw = null;
        PrintWriter pw = null;
        TreeSet<Integer> nums = null;
        Iterator r;

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            fw = new FileWriter(f, true);
            pw = new PrintWriter(fw);

            pw.println("Complementario: " + win.getComplementario());
            nums = win.getNums();
            r = nums.iterator();
            pw.println("Nums: ");
            while (r.hasNext()) {
                pw.print(r.next() + "    ");
            }
            pw.println();
            pw.println("Reintegro: " + win.getReintegro() + "\n_________________________\n");
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

    public static int menu() {
        int opc;

        System.out.println("1. Jugar y Sorteo");
        System.out.println("2. Terminar");

        do {
            opc = fr.nextInt();
            if (opc != 1 && opc != 2) {
                System.out.println("opc incorrecta...");
            }
        } while (opc != 1 && opc != 2);

        return opc;
    }
}
