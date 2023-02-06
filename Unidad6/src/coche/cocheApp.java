package coche;

 //@author 6jmati
 
import java.util.*;

public class cocheApp {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String coche;
        
        System.out.print("¿Qué coche querrías registrar en el sistema?  ");
        coche = eb.nextLine();
        rellenarRegistro(coche);
    }
    
    public static void rellenarRegistro(String coche) {
        Scanner eb = new Scanner(System.in);
        Scanner fr = new Scanner(System.in);
        
        String modelo, matricula, color, fecha, seguro;
        
        System.out.println("Bienvenido al registro de vehículos...");
        System.out.println("");
        System.out.print("¿Que modelo es \""+coche+"\"? ");
        modelo = eb.nextLine();
        System.out.print("Introduce la matrícula de \""+coche+"\": ");
        matricula = fr.next();
        
        coche1 cocheChoosen = new coche1(modelo, matricula);       
        
        System.out.print("Introduce color para \""+coche+"\": ");
        color = eb.nextLine();
        System.out.print("Introduce fecha de fabricación de \""+coche+"\": ");
        fecha = eb.nextLine();
        System.out.print("Introduce la modalidad del seguro:  ");
        seguro = eb.nextLine();
        
        coche1 cocheElegido = new coche1(modelo, matricula, color, fecha, seguro);
        
        imprimeCoche(cocheChoosen, cocheElegido, coche);
    }
    
    public static void imprimeCoche(coche1 y ,coche1 x, String nombre) {
        System.out.println("El modelo de \""+nombre+"\" es un \""+y.dimeModelo()+"\" en color \""+x.dimeColor()+"\"");
    }
}
