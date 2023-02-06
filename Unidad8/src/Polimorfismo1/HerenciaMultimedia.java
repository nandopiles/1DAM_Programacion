package Polimorfismo1;

//@author Nando
import java.util.*;

public class HerenciaMultimedia {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        ListaMultimedia lista = null;
        Pelicula p1, p2;
        Disco d1, d2;
        int longitudLista = 0;
        boolean continuar = true;
               
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
        
        //creamos todos los objetos
        p1 = new Pelicula("aaa", "auttt", Formato.AVI, 3, "actrizzz", null);
        p2 = new Pelicula("bbb", "aut", Formato.DVD, 6, null, "actorrr");
        d1 = new Disco("Lose Yourself", "Eminem", Formato.MP3, 3, Genero.RAP);
        d2 = new Disco("Stan", "Rabbit B", Formato.DVD, 4, Genero.ROCK);
        
        //añadimos todos los obj a la lista
        lista.add(p1);
        lista.add(d1);
        lista.add(p2);
        lista.add(d2);
        
        visualizarLista(lista);
        
        lista.filtrar();
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
}
