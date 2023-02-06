 //@author 6jmati
 
package VeterinariaPOO;


public class Pez {
    
    private String nombre, tipo;

    public Pez(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nTipo:" + tipo + "\n______________";
    }
}
