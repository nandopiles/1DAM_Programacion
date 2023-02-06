package Agenda;

//@author 6jmati
import java.util.*;
import java.io.*;

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
            //miLista = volcarAgenda(miLista);
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
                    exportarContactos(miLista);
                    break;
                case 6:
                    continuar = salirAgenda();
                    actualizarAgenda(miLista);
                    break;
                default:
                    System.out.println("Opc no encontrada...\n");
            }
        } while (continuar);
    }

    public static ArrayList<Contacto> volcarAgenda(ArrayList<Contacto> lista) {
        File f = new File("agenda.dat");
        DataInputStream dis = null;
        String nombre;
        long tlf;
        boolean salir = false;

        try {
            if (!f.exists()) {
                System.out.println("Fichero no encontrado");
            } else {
                dis = new DataInputStream(new FileInputStream(f));
                do { //no sé cómo hacer que el programa sepa hasta cuándo tiene que estar leyendo datos
                    nombre = dis.readUTF();
                    tlf = dis.readLong();

                    Contacto c = new Contacto(nombre, tlf);
                    lista.add(c);
                } while (!salir);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void actualizarAgenda(ArrayList<Contacto> lista) {
        DataOutputStream dos = null;
        File f = new File("agenda.dat");

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            dos = new DataOutputStream(new FileOutputStream(f));
            for (Contacto c : lista) {
                dos.writeUTF(c.getNombre());
                dos.writeLong(c.getTelefono());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void exportarContactos(ArrayList<Contacto> miLista) {
        File f, f1;
        PrintWriter pw = null;

        try {
            f1 = new File("exportaciones");
            if (!f1.exists()) {
                f1.mkdir();
            }
            f = new File("exportaciones/agenda.txt");
            pw = new PrintWriter(f);

            for (Contacto c : miLista) {
                System.out.println("Exportando Contacto --> " + c.getNombre() + "\n");
                pw.println(c.toString());
            }
            if (f.exists()) {
                f.renameTo(new File("exportaciones\\agenda.txt"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
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
        Iterator<Contacto> it = miLista.iterator();
        int indice;
        boolean borrado = false;

        System.out.print("¿Qué contacto quieres borrar? ");
        nombre = eb.nextLine();
        /*indice = miLista.indexOf(new Contacto(nombre));
        if (indice != -1) {
            miLista.remove(indice);
            System.out.println("Contacto \"" + nombre + "\" eliminado\n");
        } else {
            System.out.println("No se pudo eliminar el Contacto\n");
        }*/
        while (it.hasNext()) {
            Contacto elemento = it.next();
            if (elemento.getNombre().equals(nombre)) {
                it.remove();
                System.out.println("Contacto \"" + nombre + "\" eliminado\n");
                borrado = true;
            }
        }
        if (borrado == false) {
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
        Iterator<Contacto> it = miLista.iterator();

        System.out.println("Visualizando Agenda...\n");
        while (it.hasNext()) {
            Contacto elemento = it.next();
            System.out.print(elemento + "\n");
        }

        Thread.sleep(1000);
    }

    public static boolean salirAgenda() {
        System.out.println("Saliendo de la Agenda...");
        return false;
    }

    public static void menu() {
        System.out.println("1. Añadir Contacto\n2. Borrar Contacto\n3. Buscar Contacto\n4. Visualizar Agenda\n5. Exportar Contactos\n6. Salir");
    }
}
