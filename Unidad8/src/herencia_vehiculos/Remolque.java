package herencia_vehiculos;

 //@author 6jmati
 

public class Remolque {
    private int peso;
    
    public Remolque(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nEl peso del remolque es de: " + peso + "kg\n";
    }
    
    
}
