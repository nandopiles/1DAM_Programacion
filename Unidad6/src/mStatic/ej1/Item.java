package mStatic.ej1;

 //@author 6jmati
 

public class Item {
    static int cont = 0;
    static String nombreItem, idItem;
    
    public Item(String nombre, String id) {
        this.nombreItem = nombre;
        this.idItem = id;
        cont++;
    }
    
    public static String dimeNombre() {
        return nombreItem;
    }
    
    public static int dimeId() {
        return cont;
    }
    
    @Override
    public String toString() {
        return "ID --> "+idItem+"\nNombre --> "+nombreItem+"\n(Items: "+cont+")";
    }
    
}
