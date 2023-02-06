import java.util.Scanner;
public class ej1 {
    public static int sigPot(int n){
        int produc=1, cont;
        
        for (cont = 0; produc <= n; cont++) {
            produc=produc*2;
        }
        return cont;
    }
    public static void main(String[] args) {
        Scanner eb= new Scanner (System.in);
        int n, resul;
        
        System.out.println("Introduce un número:");
        n= eb.nextInt();
        resul=sigPot(n);
        System.out.printf("La potencia sería: %d ",resul);
    }
}
