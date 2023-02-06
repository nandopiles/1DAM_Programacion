package PilaColaEj.PilaCola;

//@author 6jmati
import PilaColaEj.PilaCola.PilaCola;
import java.util.*;

public class Cola implements PilaCola{

    LinkedList<Object> cola = new LinkedList<Object>();
    
    @Override
    public Object sacar() {
        cola.removeFirst();
        return this;
    }

    @Override
    public void meter(Object f) {
        cola.add(f);
    }

    @Override
    public int tamanyo() {
        return cola.size();
    }
    
    @Override
    public void listar() {
        Iterator it = cola.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    @Override
    public String toString() {
        Iterator it = cola.iterator();
        String cad = "";
        while (it.hasNext()) {
            cad += it.next()+"\n";
        }
        return cad;
    }
}
