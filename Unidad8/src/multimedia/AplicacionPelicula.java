package multimedia;

//@author 6jmati
import java.util.*;

public class AplicacionPelicula {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        ListaMultimedia lista = null;
        Pelicula p1, p2, p3, pRandom;
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

        p1 = crearPelicula();
        //p2 = crearPelicula();
        //p3 = crearPelicula;

        //añadimos los obj a la lista
        lista.add(p1);
        //lista.add(p2);
        //lista.add(p3);

        visualizarLista(lista);

        //creamos un Disco
        System.out.println("Añadiendo Película...");
        separador();
        pRandom = new Pelicula(lista.get(0).getTitulo(), lista.get(0).getAutor(), Formato.DVD, 3, "sawa", null);
        lista.add(pRandom);

        //mostramos el contenido de la lista
        visualizarLista(lista);

        //devuelve la posición del objeto creado, añadido en la lista
        lista.indexOf(pRandom);

        //obtener el objeto que esté en esa posición y mostrar por pantalla el objeto, junto con la posición en la que se encuentra        
        continuar = true;
        do {
            try {
                System.out.print("Dime una posición de la lista ");
                posicion = eb.nextInt();
                Thread.sleep(1000);
                System.out.println("El elemento en la posición seleccionada es:\n " + lista.get(posicion)
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
    }

    //creación obj película
    public static Pelicula crearPelicula() {
        Scanner eb = new Scanner(System.in);
        Pelicula objeto = null;
        String titulo, autor, actor = null, actriz = null;
        int duracion;
        String formato, opc;
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
                do {
                    try {
                        System.out.print("¿Tiene Actriz Principal? (s/n)");
                        opc = eb.nextLine();
                        if (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                            throw new ActoresNulos("Opc Incorrecta");
                        } else if (opc.equalsIgnoreCase("s")) {
                            System.out.print("Actriz --> ");
                            actriz = eb.nextLine();
                        }
                        System.out.print("¿Tiene Actor Principal? (s/n)");
                        opc = eb.nextLine();
                        if (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                            throw new ActoresNulos("Opc Incorrecta...");
                        } else if (opc.equalsIgnoreCase("s")) {
                            System.out.print("Actor --> ");
                            actor = eb.nextLine();
                        }
                        if (actriz == null && actor == null) {
                            throw new ActoresNulos("Tiene que haber almenos un actor/actriz principal...");
                        }
                        continuar = false;
                    } catch (ActoresNulos e2) {
                        System.out.println(e2.getMessage());
                    }
                } while (continuar);
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
