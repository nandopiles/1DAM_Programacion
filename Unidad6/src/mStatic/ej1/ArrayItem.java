package mStatic.ej1;

//@author 6jmati
import java.util.*;

public class ArrayItem {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Item array[] = new Item[3];
        String nombre, id;

        for (int i = 0; i < array.length; i++) {
            System.out.println("¿Qué nombre quieres ponerle al objeto " + i + "?");
            nombre = eb.nextLine();
            System.out.println("¿Qué ID quieres que tenga?");
            id = eb.nextLine();
            array[i] = new Item(nombre, id);
            System.out.println(array[i]);
        }
    }
}
