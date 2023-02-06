package almacenes;

 //@author 6jmati
 
import java.util.*;
public class LogisticaControlContenedor {
    public static void main(String[] args) {
        LogisticaAlmacen almacen1 = new LogisticaAlmacen();
        LogisticaAlmacen almacen2 = new LogisticaAlmacen();
        LogisticaAlmacen almacen3 = new LogisticaAlmacen();
        almacen1.setCapacidad(2);
        almacen2.setCapacidad(4);
        almacen3.setCapacidad(8);
        int opc; 
        
        System.out.println("Bienvenido al sistema...");
        do {
            opc = menu();
            switch (opc) {
                case 1: if (!almacen1.meterContenedor())
                            if (!almacen2.meterContenedor())
                                if (!almacen3.meterContenedor())
                                    System.out.println("No puede descargar");
                    break;
                case 2: if (!almacen1.sacarContenedores())
                            if (!almacen2.sacarContenedores())
                                if (!almacen3.sacarContenedores())
                                    System.out.println("No hay contenedores");
            }
            System.out.println("\nAlmacen1: "+almacen1);
            System.out.println("Almacen2: "+almacen2);
            System.out.println("Almacen3: "+almacen3);
        } while (opc != 3);
        
        System.out.println("Hasta Luego");
    }
    public static int menu() {
        Scanner eb = new Scanner(System.in);
        int opc;
        
        System.out.print("¿Qué desea hacer?\n\n1. Meter\n2. Sacar\n3. Finalizar\n");
        opc = eb.nextInt();
        
        return opc;
    }
}
