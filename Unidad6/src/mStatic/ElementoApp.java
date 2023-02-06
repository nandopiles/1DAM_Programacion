package mStatic;

 //@author 6jmati
import java.util.Scanner;

public class ElementoApp {
    public static void main(String[] args) {
        Elemento mercurio = new Elemento("agua");
        Elemento kk = new Elemento("vapor");
        
        System.out.println("Hay " +  Elemento.numeroDeElementos() + " elemento(s)");
    }
}
