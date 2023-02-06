package PilaColaEj;

//@author 6jmati

import PilaColaEj.PilaCola.Cola;
import PilaColaEj.PilaCola.Pila;

public class AplicacionPilaCola{

    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();
        /*  float f1=1.5f;
            float f2=5.2f;
            float f3=0.2f;  */
        String f1 = "uno", f2 = "dos", f3 = "tres";
        pila.meter(f1);
        pila.meter(f2);
        pila.meter(f3);
        
        cola.meter(f1);
        cola.meter(f2);
        cola.meter(f3);
        
        pila.listar();
        System.out.println("----");
        cola.listar();
        System.out.println("-----");
        
        pila.sacar();
        cola.sacar();
        
        pila.listar();
        System.out.println("----");
        cola.listar();
        System.out.println("----");
        
        pila.meter(f2);
        cola.meter(f2);
        
        pila.listar();
        System.out.println("----");
        cola.listar();
        System.out.println("----");
    }
}
