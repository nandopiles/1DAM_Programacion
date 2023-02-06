package Autopista.Vehiculos;

 //@author 6jmati
 

public class Moto extends Vehiculo{
    private static int contMotos = 0;
    
    public Moto(String matricula, String modelo, String color) {
        super(matricula, modelo, color);
        contMotos++;
    }

    public static int getContMotos() {
        return contMotos;
    }
}
