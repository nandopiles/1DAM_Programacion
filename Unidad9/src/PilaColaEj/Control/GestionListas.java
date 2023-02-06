package PilaColaEj.Control;

 //@author 6jmati

import java.util.*;
import PilaColaEj.PilaCola.Cola;
import PilaColaEj.PilaCola.Pila;
import PilaColaEj.PilaCola.PilaCola;

public class GestionListas {
    public static Pila pila = new Pila();
    public static Cola cola = new Cola();
    
    public static void anyadir(String elemento) {
        pila.meter(elemento);
        cola.meter(elemento);
    }
    
    public static void sacar(PilaCola elemento) {
        if (elemento.tamanyo() > 0)
            elemento.sacar();
    }
}
