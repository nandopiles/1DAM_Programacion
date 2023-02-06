package Autopista.Vehiculos;

 //@author 6jmati
 

public class Coche extends Vehiculo{
    private static int contCoches = 0;
    
    public Coche(String matricula, String modelo, String color) {
        super(matricula, modelo, color);
        contCoches++;
    }

    public int getContCoches() {
        return contCoches;
    }
}
