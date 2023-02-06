package Agenda;

//@author 6jmati
import java.util.*;

public class Agenda {

    static Scanner eb = new Scanner(System.in);
    static Scanner fr = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Contacto> miLista = new ArrayList<Contacto>();
        String nombre = "";
        int opc;
        long telefono = 0;
        boolean continuar = true;

        do {
            menu();
            opc = fr.nextInt();
            Thread.sleep(1000);
            switch (opc) {
                case 1:
                    anyadirContacto(nombre, telefono, miLista);
                    break;
                case 2:
                    borrarContacto(nombre, miLista);
                    break;
                case 3:
                    buscarContacto(nombre, miLista);
                    break;
                case 4:
                    visualizarAgenda(miLista);
                    break;
                case 5:
                    continuar = salirAgenda();
                    break;
                default:
                    System.out.println("Opc no encontrada...\n");
            }
        } while (continuar);
    }

    public static void anyadirContacto(String nombre, long telefono, ArrayList<Contacto> miLista) throws InterruptedException {
        String stringTelefono = "";
        boolean continuar = true;

        System.out.print("Nombre --> ");
        nombre = eb.nextLine();
        do {
            try {
                System.out.print("Teléfono --> ");
                telefono = fr.nextLong();
                stringTelefono = String.valueOf(telefono);
                if (stringTelefono.length() != 9) {
                    throw new TelefonoException("Teléfono no válido\tTiene que tener 9 dígitos");
                }
                continuar = false;
            } catch (TelefonoException e2) {
                System.out.println(e2.getMessage());
            } catch (InputMismatchException e1) {
                System.out.println("Error al introducir el teléfono\nRepita:");
                fr.nextLine();
            }
        } while (continuar);
        Contacto c = new Contacto(nombre, telefono);
        miLista.add(c);
        System.out.println("Contacto \"" + nombre + "\" añadido\n");
        Thread.sleep(1000);
    }

    public static void borrarContacto(String nombre, ArrayList<Contacto> miLista) throws InterruptedException {
        int indice;

        System.out.print("¿Qué contacto quieres borrar? ");
        nombre = eb.nextLine();
        indice = miLista.indexOf(new Contacto(nombre));
        if (indice != -1) {
            miLista.remove(indice);
            System.out.println("Contacto \"" + nombre + "\" eliminado\n");
        } else {
            System.out.println("No se pudo eliminar el Contacto\n");
        }
        Thread.sleep(1000);
    }

    public static void buscarContacto(String nombre, ArrayList<Contacto> miLista) throws InterruptedException {
        int indice;

        System.out.print("¿Qué contacto quieres buscar? ");
        nombre = eb.nextLine();
        indice = miLista.indexOf(new Contacto(nombre));
        if (indice != -1) {
            System.out.println(miLista.get(indice) + "\n");
        } else {
            System.out.println("El Contacto NO existe\n");
        }
        Thread.sleep(1000);
    }

    public static void visualizarAgenda(ArrayList<Contacto> miLista) throws InterruptedException {
        System.out.println("Visualizando Agenda...\n");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i) + "\n");
        }
        Thread.sleep(1000);
    }

    public static boolean salirAgenda() {
        System.out.println("Saliendo de la Agenda...");
        return false;
    }

    public static void menu() {
        System.out.println("1. Añadir Contacto\n2. Borrar Contacto\n3. Buscar Contacto\n4. Visualizar Agenda\n5. Salir");
    }
}
