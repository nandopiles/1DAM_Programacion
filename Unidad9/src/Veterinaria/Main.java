 //@author 6jmati
package Veterinaria;

import java.util.*;

public class Main {

    static Scanner eb = new Scanner(System.in);
    static Scanner fr = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        boolean continuar = true;
        HashSet<Cliente> listaClientes = new HashSet();
        HashSet<Vacunable> listaVacunados = new HashSet();

        System.out.println("Bienvenido a la Veterinaria McChicken");
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    listaClientes = crearCliente(listaClientes);
                    break;
                case 2:
                    listaClientes = borrarCliente(listaClientes);
                    break;
                case 3:

                    break;
                case 4:
                    listarClientes(listaClientes);
                    break;
                case 5:

                    break;
                case 6:
                    continuar = false;
                    break;
            }
        } while (continuar);
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
    public static HashSet<Cliente> crearCliente(HashSet<Cliente> lista) {
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
            crearAnimal(c);
        }

        lista.add(c);
        return lista;
    }

    //crea animales y los añade a su respectiva lista del Cliente
    public static void crearAnimal(Cliente c) {
        int cantMam, cantAve, cantPez, opc;
        
        do {
            opc = seleccionAnimal();
            switch (opc) {
                case 1:
                    System.out.print("¿cuántos mamíferos quieres regitrar? ");
                    cantMam = fr.nextInt();
                    crearMamifero(cantMam, c);
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

    public static void crearMamifero(int cantAnimal, Cliente c) {
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
            c.añadirMascota(m);
        }
    }

    public static void crearAve(int cantAnimal, Cliente c) {
        String nombreMascota, fechaNMasc, especie;
        int nAnilla;
        Ave a;

        for (int i = 0; i < cantAnimal; i++) {
            System.out.print("Nombre Mamífero --> ");
            nombreMascota = eb.nextLine();
            System.out.print("Fecha de Nacimiento Mamífero --> ");
            fechaNMasc = eb.nextLine();
            System.out.print("Especie Mamífero --> ");
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
    
    public static void vacunar(Cliente c) {
        Vacunable v;
        
        try {
            
        } catch(Exception e) {
            
        }
    }

    public static int menu() {
        int opc;

        do {
            System.out.println("\n1. Crear Cliente\n2. Borrar Cliente\n3. Vacunar Animal\n4. Listar Clientes\n5. Listar Animales Vacunados\n6. Salir\n");
            opc = fr.nextInt();
            if (opc < 1 || opc > 6) {
                System.out.println("[-]Opc Incorrecta\n");
            }
        } while (opc > 6 || opc < 1);

        return opc;
    }
}
