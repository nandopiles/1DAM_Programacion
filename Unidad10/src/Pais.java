//@author Nando


public class Pais {
    private String nombre;
    
    public Pais(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
