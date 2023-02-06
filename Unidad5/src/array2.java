
import java.util.*;

public class array2 {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int d;
        /*int[] vD1 = {};
        int[] vD2 = {};
        int[] vD3 = {};*/
        
        System.out.println("Introduce el departamento dónde se ha hecho la venta: ");
        d = eb.nextInt();
        while(d != 1 && d != 2 && d != 3) {
            System.out.println("No existe ese departamento");
            System.out.print("Vuelve a introducirlo ---> ");
            d = eb.nextInt();
        }
        
    }
}
