package multimedia;

//@author 6jmati
import java.util.*;

public class AplicacionDisco {

    public static void main(String[] args) throws InterruptedException {
        Scanner eb = new Scanner(System.in);
        ListaMultimedia lista = null;
        Disco d1, d2, d3, dRandom;
        int longitudLista, posicion;
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
            } catch (InputMismatchException e1) {
                System.out.println("Tiene que ser un entero...");
                eb.nextLine();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        } while (continuar);

        d1 = crearDisco();
        //d2 = crearPelicula();
        //d3 = crearPelicula;

        //añadimos los obj a la lista
        lista.add(d1);
        //lista.add(p2);
        //lista.add(p3);

        visualizarLista(lista);

        //creamos un Disco
        System.out.println("Añadiendo Disco...");
        separador();
        dRandom = new Disco(lista.get(0).getTitulo(), lista.get(0).getAutor(), Formato.DVD, 3, Genero.RAP);//introducimos el título y autor del primer elemento de la lista
        lista.add(dRandom);
        Thread.sleep(1000);

        //mostramos el contenido de la lista
        visualizarLista(lista);

        //devuelve la posición del objeto creado, añadido en la lista
        lista.indexOf(dRandom);

        //obtener el objeto que esté en esa posición y mostrar por pantalla el objeto, junto con la posición en la que se encuentra        
        continuar = true;
        do {
            try {
                System.out.print("Dime una posición de la lista ");
                posicion = eb.nextInt();
                System.out.println("\nEl elemento en la posición seleccionada es:\n " + lista.get(posicion)
                        + "\nse encuentra en la posición " + posicion + " (empieza por 0 la lista)");
                continuar = false;
            } catch (InputMismatchException e1) {
                System.out.println("Tienes que introducir un número entero...");
            } catch (IndexOutOfBoundsException e2) {
                System.out.println("Posición no encontrada...");
            } catch (Exception e3) {
                System.out.println("Excepción General...");
            }
        } while (continuar);

        Thread.sleep(1000);
        visualizarLista(lista);
    }

    //creación obj película
    public static Disco crearDisco() {
        Scanner eb = new Scanner(System.in);
        Disco objeto = null;
        String titulo, autor, actor = null, actriz = null;
        int duracion;
        String genero, formato, opc;
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
                System.out.println(
                          "    ROCK,\n"
                        + "    POP,\n"
                        + "    PUNK,\n"
                        + "    RAP, \n"
                        + "    COUNTRY,\n"
                        + "    POPROCK,\n"
                        + "    JAZZ,\n"
                        + "    TECHNO, \n"
                        + "    REGGAETON");
                System.out.print("Introduce el género: ");
                genero = eb.nextLine().toUpperCase();
                if (!genero.equalsIgnoreCase("ROCK")&&!genero.equalsIgnoreCase("POP")&&!genero.equalsIgnoreCase("PUNK")&&!genero.equalsIgnoreCase("RAP")&&!genero.equalsIgnoreCase("COUNTRY")
                        &&!genero.equalsIgnoreCase("POPROCK")&&!genero.equalsIgnoreCase("JAZZ")&&!genero.equalsIgnoreCase("TECHNO")&&!genero.equalsIgnoreCase("REGGAETON")) {
                    throw new GeneroNulo("Género no encontrado...");
                }
                objeto = new Disco(titulo, autor, Formato.valueOf(formato), duracion, Genero.valueOf(genero));
                continuar = false;
            } catch (IllegalArgumentException e1) {
                System.out.println("Tipo de formato incorrecto...");
            } catch (InputMismatchException e2) {
                System.out.println("Duración incorrecta...");
            } catch (GeneroNulo e3) {
                System.out.println(e3.getMessage());
            }
        } while (continuar);
        return objeto;
    }

    //método para visualizar la Lista
    public static void visualizarLista(ListaMultimedia lista) {
        System.out.println("\nContenido Lista:");
        try {
            System.out.println(lista.toString());
        } catch (Exception e1) {
            System.out.println("Error general...\n");
        }
    }

    public static void separador() {
        System.out.println("______________________________________");
    }
}
