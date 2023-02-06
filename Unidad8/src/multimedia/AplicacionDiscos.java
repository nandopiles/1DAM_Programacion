package multimedia;

//@author Nando
import java.util.*;

public class AplicacionDiscos {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        ListaMultimedia lista = null;
        Pelicula p1, p2, p3;
        int longitudLista;
        boolean continuar = true;

        do {
            try {
                System.out.print("(Max. 10)\nLongitud de la lista --> ");
                longitudLista = eb.nextInt();
                if (longitudLista > 10 || longitudLista <= 0) {
                    throw new Exception("Longitud incorrecta...");
                }
                lista = new ListaMultimedia(longitudLista);
                continuar = false;
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        } while (continuar);

        p1 = crearPelicula();
    }

    public static Pelicula crearPelicula() {
        Scanner eb = new Scanner(System.in);
        Pelicula objeto = null;
        String titulo, autor, actor = null, actriz = null;
        int duracion;
        String formato;
        boolean continuar = true;

        do {
            try {
                System.out.print("Título --> ");
                titulo = eb.nextLine();
                System.out.print("Autor --> ");
                autor = eb.nextLine();
                System.out.print("(WAV, MP3, MIDI, AVI, MOV, MPG, CDAUDIO, DVD)\nFormato --> ");
                formato = eb.nextLine().toUpperCase();
                System.out.print("Duración --> ");
                duracion = eb.nextInt();
                eb.nextLine();
                eleccionActores(actor, actriz);
                objeto = new Pelicula(titulo, autor, Formato.valueOf(formato), duracion, actriz, actor);
                continuar = false;
            } catch (IllegalArgumentException e1) {
                System.out.println("Tipo de formato incorrecto...");
            } catch (InputMismatchException e2) {
                System.out.println("Duración incorrecta...");
            } catch (Exception e3) {
                System.out.println("Error general...");
            }
        } while (continuar);
        return objeto;
    }

    public static void eleccionActores(String actriz, String actor) {
        Scanner eb = new Scanner(System.in);
        String opc;
        boolean continuar = true;
        
        actriz = null;
        actor = null;

        do {
            try {
                System.out.print("¿Tiene Actriz Principal? (s/n)");
                opc = eb.nextLine();
                if (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                    throw new ActoresNulos("Opc Incorrecta");
                } else if (opc.equalsIgnoreCase("s")){
                    System.out.print("Actriz --> ");
                    actriz = eb.nextLine();
                }               
                System.out.print("¿Tiene Actor Principal? (s/n)");
                opc = eb.nextLine();
                if (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                    throw new ActoresNulos("Opc Incorrecta...");
                } else if(opc.equalsIgnoreCase("s")){
                    System.out.print("Actor --> ");
                    actor = eb.nextLine();
                }
                if (actriz == null && actor == null) {
                    throw new ActoresNulos("Tiene que haber almenos un actor/actriz principal...");
                }
                continuar = false;
            } catch(ActoresNulos e2) {
                System.out.println(e2.getMessage());
            }
        } while (continuar);
    }
}
