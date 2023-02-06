 //@author 6jmati
package VeterinariaPOO;

import java.util.*;
import java.io.*;

public class Main {

    static Scanner eb = new Scanner(System.in);
    static Scanner fr = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        boolean continuar = true;
        HashSet<Cliente> listaClientes = new HashSet();
        HashSet<Vacunable> listaVacunados = new HashSet();

        System.out.println("Bienvenido a la Veterinaria McChicken");
        listaClientes = leerClientes(listaClientes);
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    listaClientes = crearCliente(listaClientes, listaVacunados);
                    break;
                case 2:
                    listaClientes = borrarCliente(listaClientes);
                    break;
                case 3:
                    vacunar(listaClientes, listaVacunados);
                    break;
                case 4:
                    listarClientes(listaClientes);
                    break;
                case 5:
                    listarVacunados(listaClientes);
                    break;
                case 6:
                    exportarAnimalesVacunados(listaVacunados);
                    break;
                case 7:
                    continuar = false;
                    guardarClientes(listaClientes);
                    break;
            }
        } while (continuar);
    }

    public static HashSet<Cliente> leerClientes(HashSet<Cliente> listaClientes) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object aux = null;
        Cliente c = null;

        try {
            f = new File("Clientes.dat");
            if (f.exists() && f.isFile()) {
                System.out.println("Importando Datos...");
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                aux = ois.readObject();
                while (aux != null) {
                    if (aux instanceof Cliente) {
                        c = (Cliente) aux;
                        listaClientes.add(c);
                    }
                    aux = ois.readObject();
                }
            }
        } catch (EOFException e1) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listaClientes;
    }

    public static void guardarClientes(HashSet<Cliente> listaClientes) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        //String dni, nombre, apellido;

        try {
            f = new File("Clientes.dat");
            if (!f.exists()) {
                f.createNewFile();
            }
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            for(Cliente c : listaClientes) {
                oos.writeObject(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void listarVacunados(HashSet<Cliente> lista) {
        HashSet<Mascota> listaMasc;
        String dni;

        System.out.print("DNI Cliente --> ");
        dni = eb.nextLine();
        for (Cliente c : lista) {
            if (c.equals(new Cliente(dni))) {
                listaMasc = c.getListaMascotas();
                for (Mascota m : listaMasc) {
                    if (m instanceof Vacunable && ((Mamifero) m).vacunado == true) {
                        System.out.println(((Mamifero) m).toString());
                    }
                }
            }
        }
    }

    public static void listarClientes(HashSet<Cliente> lista) {
        for (Cliente e : lista) {
            System.out.println(e.toString() + "\n_______\n");
            /*e.visualizarListaMascotas();
            si quisiéramos pintar por pantalla sus mascotas también
             */
        }
    }

    //introduciendo DNI se borra el Cliente de la lista y la devuelve al Main
    public static HashSet<Cliente> borrarCliente(HashSet<Cliente> lista) {
        String dni;

        System.out.print("DNI del Cliente a eliminar --> ");
        dni = eb.nextLine();
        if (lista.remove(new Cliente(dni))) {
            System.out.println("[+]Eliminando Cliente con DNI " + dni + "...\n");
        } else {
            System.out.println("[-]DNI no encontrado\n");
        }

        return lista;
    }

    //Crea un Cliente, lo añade a la lista y devuelve la lista al Main
    public static HashSet<Cliente> crearCliente(HashSet<Cliente> lista, HashSet<Vacunable> listaVacunados) {
        Cliente c;
        String dni, nombre, apellidos, OpcMascotas;

        System.out.print("DNI --> ");
        dni = eb.nextLine();
        System.out.print("Nombre --> ");
        nombre = eb.nextLine();
        System.out.print("Apellidos --> ");
        apellidos = eb.nextLine();
        c = new Cliente(dni, nombre, apellidos);

        System.out.println("¿Desea regitrar alguna mascota?(s/n)");
        do {
            OpcMascotas = eb.nextLine();
            if (!OpcMascotas.equalsIgnoreCase("s") && !OpcMascotas.equalsIgnoreCase("n")) {
                System.out.println("[-]Opción incorrecta...");
                OpcMascotas = eb.nextLine();
            }
        } while (!OpcMascotas.equalsIgnoreCase("s") && !OpcMascotas.equalsIgnoreCase("n"));

        if (OpcMascotas.equalsIgnoreCase("s")) {
            crearAnimal(c, listaVacunados);
        }

        lista.add(c);
        return lista;
    }

    //crea animales y los añade a su respectiva lista del Cliente
    public static void crearAnimal(Cliente c, HashSet<Vacunable> listaVacunados) {
        int cantMam, cantAve, cantPez, opc;

        do {
            opc = seleccionAnimal();
            switch (opc) {
                case 1:
                    System.out.print("¿cuántos mamíferos quieres regitrar? ");
                    cantMam = fr.nextInt();
                    crearMamifero(cantMam, c, listaVacunados);
                    break;
                case 2:
                    System.out.print("¿cuántas aves quieres regitrar? ");
                    cantAve = fr.nextInt();
                    crearAve(cantAve, c);
                    break;
                case 3:
                    System.out.print("¿cuántos peces quieres regitrar? ");
                    cantPez = fr.nextInt();
                    crearPez(cantPez, c);
                    break;
            }
        } while (opc != 4);

    }

    public static void crearMamifero(int cantAnimal, Cliente c, HashSet<Vacunable> listaVacunados) {
        String nombreMascota, fechaNMasc, especie, fechaV = "0", vacun;
        boolean vacunado = false;
        Mamifero m;
        Vacunable v;

        for (int i = 0; i < cantAnimal; i++) {
            System.out.print("Nombre Mamífero --> ");
            nombreMascota = eb.nextLine();
            System.out.print("Fecha de Nacimiento Mamífero --> ");
            fechaNMasc = eb.nextLine();
            System.out.print("Especie Mamífero --> ");
            especie = eb.nextLine();
            System.out.print("¿Está vacunado?(s/n) ");
            do {
                vacun = eb.nextLine();
            } while (!vacun.equalsIgnoreCase("s") && !vacun.equalsIgnoreCase("n"));
            if (vacun.equalsIgnoreCase("s")) {
                vacunado = true;
                System.out.print("Fecha Vacunación --> ");
                fechaV = eb.nextLine();
            }

            m = new Mamifero(fechaV, vacunado, nombreMascota, fechaNMasc, especie, c);
            if (m.vacunado == true) {
                listaVacunados.add((Vacunable) m);
            }
            c.añadirMascota(m);
        }
    }

    public static void crearAve(int cantAnimal, Cliente c) {
        String nombreMascota, fechaNMasc, especie;
        int nAnilla;
        Ave a;

        for (int i = 0; i < cantAnimal; i++) {
            System.out.print("Nombre Ave --> ");
            nombreMascota = eb.nextLine();
            System.out.print("Fecha de Nacimiento Ave --> ");
            fechaNMasc = eb.nextLine();
            System.out.print("Especie Ave --> ");
            especie = eb.nextLine();
            System.out.print("Nº de Anilla --> ");
            nAnilla = eb.nextInt();

            a = new Ave(nAnilla, nombreMascota, fechaNMasc, especie, c);
            c.añadirMascota(a);
        }
    }

    public static void crearPez(int cantPez, Cliente c) {
        String nombre, tipo;
        Pez p;

        for (int i = 0; i < cantPez; i++) {
            System.out.print("Nombre Pez --> ");
            nombre = eb.nextLine();
            System.out.print("Tipo --> ");
            tipo = eb.nextLine();

            p = new Pez(nombre, tipo);
            c.añadirPeces(p);
        }
    }

    public static int seleccionAnimal() {
        int opc;

        System.out.println("1. Mamífero\n2. Ave\n3. Pez\n4. Salir");
        do {
            opc = fr.nextInt();
            if (opc > 4 || opc < 1) {
                System.out.println("opc no válida...");
            }
        } while (opc > 4 || opc < 1);

        return opc;
    }

    public static void vacunar(HashSet<Cliente> listaClientes, HashSet<Vacunable> listaVacunados) {
        String nombre, dni;
        int id;
        HashSet<Mascota> lista;

        try {
            System.out.print("Animal a Vacunar --> ");
            nombre = eb.nextLine();
            System.out.print("DNI Amo --> ");
            dni = eb.nextLine();

            for (Cliente c : listaClientes) {
                if (c.equals(new Cliente(dni))) {
                    c.visualizarAnimales();
                    System.out.print("ID Mascota a Vacunar --> ");
                    id = fr.nextInt();
                    lista = c.getListaMascotas();
                    for (Mascota m : lista) {
                        if (!m.equals(new Mascota(id))) {
                            if (m instanceof Vacunable) {
                                ((Vacunable) m).vacunar();
                                listaVacunados.add(((Vacunable) m));
                            } else {
                                System.out.println("No se puede vacunar");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    public static void exportarAnimalesVacunados(HashSet<Vacunable> listaVacunados) {
        File f = null;
        PrintWriter pw = null;

        try {
            f = new File("animalesVacunados.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            pw = new PrintWriter(f);
            for (Vacunable v : listaVacunados) {
                if (v instanceof Mamifero) {
                    pw.println(((Mamifero) v).toString());
                    pw.println("_______________________");
                }
            }
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

        do {
            System.out.println("\n1. Crear Cliente\n2. Borrar Cliente\n3. Vacunar Animal\n4. Listar Clientes\n5. Listar Animales Vacunados\n6. Exportar Vacunados\n7. Salir");
            opc = fr.nextInt();
            if (opc < 1 || opc > 7) {
                System.out.println("[-]Opc Incorrecta\n");
            }
        } while (opc > 7 || opc < 1);

        return opc;
    }
}
