package multimedia;

//@author Nando
import java.util.*;

public class AplicacionMultimedia {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        ListaMultimedia lista = null;
        Multimedia obj1, obj2, obj3;
        int longitudLista = 0, posicion;
        boolean continuar = true, rellenar = true;

        //mientras la longitud no esté entre 1 y 10 pedirá la longitud de la lista
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

        //creamos los objetos llamando al método y los añadimos a la Lista
        obj1 = crearObjeto();
        obj2 = crearObjeto();
        //obj3 = crearObjeto();

        //añadimos el objeto a la Lista
        lista.add(obj1);
        lista.add(obj2);
        //lista.add(obj3);

        /*Podríamos hacer un bucle el cual se repita hasta que se completen todos los huecos del array menos el último que está reservado para el objeto que crearemos después.
        Además dichos objetos los añadirá al array
        for (int i = 0; i < longitudLista - 1; i++) {
            obj1 = crearObjeto();
            lista.add(obj);
            separador();
        }*/
        
        //creamos un objeto Multimedia con información Random y lo añadimos a la Lista
        Multimedia objRandom = new Multimedia("Cositas", "Kike Carrasco", Formato.MIDI, 11);
        lista.add(objRandom);

        //mostramos el contenido de la lista
        visualizarLista(lista);

        //encontrar el objRandom en la lista
        System.out.println("Se encuentra en la posición: " + lista.indexOf(objRandom) + " de la lista (se empieza desde 0)");

        //pasar una posición y te devuelve el objeto que está en esa posición
        continuar = true;
        System.out.print("\nElije una posición del array para mostrar su contenido: ");
        do {
            try {
                posicion = eb.nextInt();
                System.out.println(lista.get(posicion));
                continuar = false;
            } catch (IndexOutOfBoundsException e1) {
                System.out.println("Posición NO encontrada...");
            } catch (InputMismatchException e2) {
                System.out.println("Tienes que escribir un entero...");
            } catch (Exception e3) {
                System.out.println("Excepción general");
            }
        } while (continuar);

        //borrar el elemento de la posición introducida y que todos los elementos se desplacen hacia la izquierda
        continuar = true;
        do {
            try {
                System.out.print("Introduce la posición del elemento que quieras eliminar: ");
                posicion = eb.nextInt();               
                if (posicion >= 0 && posicion < longitudLista) {                  
                    lista.delete(posicion);
                    continuar = false;
                } else {
                    throw new Exception("Posición NO encontrada");
                }
            } catch (IndexOutOfBoundsException e1) {
                System.out.println("Posición NO encontrada...");
            } catch (InputMismatchException e2) {
                System.out.println("Tienes que escribir un entero...");
                eb.nextLine();
            } catch (Exception e3) {
                System.out.println(e3.getMessage());
            }
        } while (continuar);

        //listar de nuevo la lista con el elemento eliminado
        visualizarLista(lista);
    }

    //método de creación de obj Multimedia
    public static Multimedia crearObjeto() {
        Scanner eb = new Scanner(System.in);
        Multimedia objeto = null;
        String titulo, autor;
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
                objeto = new Multimedia(titulo, autor, Formato.valueOf(formato), duracion);
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
