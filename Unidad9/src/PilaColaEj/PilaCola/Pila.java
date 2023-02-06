package PilaColaEj.PilaCola;

//@author 6jmati
import PilaColaEj.PilaCola.PilaCola;
import java.util.*;

public class Pila implements PilaCola{

    LinkedList<Object> pila = new LinkedList<Object>();
    

    @Override
    public Object sacar() {
        pila.removeLast();
        return this;
    }

    @Override
    public void meter(Object f) {
        pila.add(f);
    }

    @Override
    public int tamanyo() {
        return pila.size();
    }
    
    @Override
    public void listar() {
        Iterator it = pila.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    @Override
    public String toString() {
        Iterator it = pila.iterator();
        String cad = "";
        while (it.hasNext()) {
            cad += it.next()+"\n";
        }
        return cad;
    }
}
