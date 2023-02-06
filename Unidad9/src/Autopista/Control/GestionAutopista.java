package Autopista.Control;

//@author 6jmati
import Autopista.Vehiculos.*;
import Autopista.Exceptions.OpcException;
import java.util.*;

public class GestionAutopista {

    public static void main(String[] args) {
        LinkedList<Vehiculo> efectivo = new LinkedList<Vehiculo>();
        LinkedList<Vehiculo> imp_exacto = new LinkedList<Vehiculo>();
        LinkedList<Vehiculo> tarjeta = new LinkedList<Vehiculo>();
        Coche coche = null;
        String pregunta;
        int cola, opc;
        boolean terminar = true;

        do {
            opc = menu();
            if (opc == 1) {
                cola = seleccionCola();
                switch (cola) {
                    case 1:
                        pregunta = opcSalirEntrar();
                        if (pregunta.equals("entrar")) {
                            efectivo = entrar(efectivo);
                            System.out.println("Entrando por la ventanilla Efectivo\n");
                        } else {
                            efectivo = salir(efectivo);
                        }
                        System.out.println("");
                        listar(efectivo);
                        break;
                    case 2:
                        pregunta = opcSalirEntrar();
                        if (pregunta.equals("entrar")) {
                            imp_exacto = entrar(imp_exacto);
                        } else {
                            imp_exacto = salir(imp_exacto);
                            System.out.println("Saliendo por la ventanilla Importe Exacto\n");
                        }
                        System.out.println("");
                        listar(imp_exacto);
                        break;
                    case 3:
                        pregunta = opcSalirEntrar();
                        if (pregunta.equals("entrar")) {
                            tarjeta = entrar(tarjeta);
                            System.out.println("Entrando por la ventanilla Tarjeta\n");
                        } else {
                            tarjeta = salir(tarjeta);
                        }
                        System.out.println("");
                        listar(tarjeta);
                        break;
                }
            } else if (opc == 2) {
                System.out.println("\nHan entrado "+coche.getContCoches()+" coches");
                System.out.println("Adiós");
                terminar = false;
            }
        } while (terminar);
    }

    public static LinkedList<Vehiculo> entrar(LinkedList<Vehiculo> lista) {
        Scanner eb = new Scanner(System.in);
        int opc = 0;
        String matricula, modelo, color;
        boolean continuar = true;

        System.out.print("Es un coche(1) o una moto(2): ");
        do {
            try {
                opc = eb.nextInt();
                if (opc != 1 && opc != 2) {
                    throw new OpcException("Opc 1 o 2...");
                }
                continuar = false;
            } catch (OpcException e1) {
                System.out.println(e1.getMessage());
            } catch (InputMismatchException e2) {
                System.out.println("Tiene que ser un número entero");
            } catch (Exception e) {
                System.out.println("Error");
            } finally {
                eb.nextLine();
            }
        } while (continuar);
        System.out.print("Matrícula --> ");
        matricula = eb.nextLine();
        System.out.print("Modelo --> ");
        modelo = eb.nextLine();
        System.out.print("Color --> ");
        color = eb.nextLine();
        if (opc == 1) {
            Coche coche = new Coche(matricula, modelo, color);
            lista.add(coche);
            System.out.println("Coche Añadido");
            return lista;
        }
        Moto moto = new Moto(matricula, modelo, color);
        lista.add(moto);
        System.out.println("Moto Añadida");
        return lista;
    }

    public static LinkedList<Vehiculo> salir(LinkedList<Vehiculo> lista) {
        if (!lista.isEmpty()) {
            lista.removeFirst();
            System.out.println("Saliendo el 1er vehículo de la lista");
        } else {
            System.out.println("La lista está vacía");
        }
        return lista;
    }

    public static String opcSalirEntrar() {
        Scanner eb = new Scanner(System.in);
        String opc = "";
        boolean continuar = true;

        System.out.println("¿Va a entrar o salir?");
        do {
            try {

                opc = eb.nextLine().toLowerCase();
                if (!opc.equals("entrar") && !opc.equals("salir")) {
                    throw new Exception("Opc no válida...");
                }
                continuar = false;

            } catch (Exception e) {
                System.out.println("Opc tiene que ser o \"entrar\" o \"salir\"");
            }
        } while (continuar);
        return opc;
    }

    public static int seleccionCola() {
        Scanner eb = new Scanner(System.in);
        int cola = 0;
        boolean continuar = true;

        System.out.println("Por qué cola quiere pasar:");

        do {
            try {
                System.out.println("1. Efectivo\n2. Importe Exacto\n3. Tarjeta");
                cola = eb.nextInt();
                if (cola > 3 || cola <= 0) {
                    throw new OpcException("Tiene que estar entre el 1 y el 3");
                }
                continuar = false;

            } catch (OpcException e1) {
                System.out.println(e1.getMessage());
            } catch (InputMismatchException e2) {
                System.out.println("Tiene que ser un número entero...");
            } catch (Exception e) {
                System.out.println("Error...");
            } finally {
                eb.nextLine();
            }
        } while (continuar);

        return cola;
    }

    public static int menu() {
        Scanner eb = new Scanner(System.in);
        int opc = 0;
        boolean continuar = true;

        System.out.println("Bienvenido al Control de Autopista");

        System.out.println("1. Elegir Cola\n2. Salir");
        do {
            try {
                opc = eb.nextInt();
                if (opc != 1 && opc != 2) {
                    throw new OpcException("Tiene que ser opc 1 o 2");
                }
                continuar = false;

            } catch (OpcException e1) {
                System.out.println(e1.getMessage());
            } catch (InputMismatchException e2) {
                System.out.println("Tiene que ser un número entero");
            } catch (Exception e) {
                System.out.println("Error...");
            } finally {
                eb.nextLine();
            }
        } while (continuar);

        return opc;
    }

    public static void listar(LinkedList<Vehiculo> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
