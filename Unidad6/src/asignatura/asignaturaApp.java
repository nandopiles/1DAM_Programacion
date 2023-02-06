package asignatura;

 //@author 6jmati
 
import java.util.*;
public class asignaturaApp {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String asignatura;
        
        System.out.println("Bienvenido al programa de relleno de Asignaturas...");
        System.out.println("");
        rellenarAsignatura();
    }
    
    
    public static void rellenarAsignatura() {
        Scanner eb = new Scanner(System.in);
        asignatura asig = new asignatura();
        
        System.out.print("¿Qué Asignatura desea rellenar?  ");
        asig.PonNombre(eb.nextLine());
        System.out.print("¿Qué código tiene \""+asig.dimeNombre()+"\"?  ");
        asig.PonCodigo(eb.nextLine());
        System.out.print("En que curso se imparte \""+asig.dimeNombre()+"\"?  ");
        asig.PonCurso(eb.nextLine());
        imprimir(asig);
    }
    
    public static void imprimir(asignatura x) {
        System.out.println("\""+x.dimeNombre()+"\", codigo:  \""+x.dimeCodigo()+"\", curso: \""+x.dimeCurso()+"\"");
    }
}
