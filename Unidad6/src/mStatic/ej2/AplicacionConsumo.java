package mStatic.ej2;

//@author Nando

import java.util.*;

public class AplicacionConsumo {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Scanner fr = new Scanner(System.in);
        int consumo, dispositivos = 3, consumoTotal;
        String nombre;
        String opc = "si";
        String [] eleccion = new String [dispositivos];
        String [] nomsDisps = new String [dispositivos];
        Aparato [] array = new Aparato[dispositivos]; //en este caso hay solo 3 dispositivos
        
        do {
            bienvenida();
            for (int i = 0; i < array.length; i++) {
                System.out.print("Nombre del dispositivo: ");
                nombre = eb.nextLine();
                nomsDisps[i] = nombre; /*registrar cada nombre en un array distinta para posteriormente imprimirla por pantalla*/
                System.out.print("Consumo de "+nombre+": ");
                consumo = fr.nextInt();
                array[i] = new Aparato(consumo, nombre);
                System.out.println(array[i]);
            }
            eleccion = opcionDispositivos(nomsDisps);
            consumoTotal = calcularConsumo(eleccion, array);
            System.out.println("El consumo total de la casa son de: "+consumoTotal+"W");
            System.out.println("¿Quieres continuar?(si/no)");
            opc = eb.nextLine();
            while (!(opc.equalsIgnoreCase("si"))&&!(opc.equalsIgnoreCase("no"))) {
                System.out.println("Opción no válida...");
                System.out.println("¿Quieres continuar?(si/no)");
                opc = eb.nextLine();
            }
        } while (opc.equalsIgnoreCase("si"));  
    }
    
    public static void bienvenida() {
        System.out.print("Bienvenido a la aplicación de Consumo...\n\n");
    }
    
    public static String [] opcionDispositivos(String [] lista) {
        Scanner eb = new Scanner(System.in);
        String opcion;
        String [] decision = new String [lista.length];
        
        for (int i = 0, cont = 1; i < lista.length; i++, cont++) {
            System.out.println("¿Quiere encender el Dispositivo "+cont+"?: "+lista[i]);
            opcion = eb.nextLine();  
            
            while(!(opcion.equalsIgnoreCase("si"))&&!(opcion.equalsIgnoreCase("no"))) {
                System.out.println("Introduzca una opción válida...");
                System.out.println("¿Quiere encender el Dispositivo "+cont+"?: "+lista[i]);
                opcion = eb.nextLine();
            }
            decision[i] = opcion;
            
        }
        return decision;
    }
    public static int calcularConsumo(String [] opcion, Aparato [] lista) {
        int consumo = 0;
        
        for (int i = 0; i < opcion.length; i++) {
            if (opcion[i].equalsIgnoreCase("si")) {
                consumo += lista[i].getConsumo();
            }
        }
        return consumo;
    }
}
