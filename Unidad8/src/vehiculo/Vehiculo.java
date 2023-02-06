package vehiculo;

//@author 6jmati
public class Vehiculo {

    double velocidad;
    
    public Vehiculo(double v) {
        velocidad = v;
    } 

    public void acelerar(double cantidad) {
        velocidad += cantidad;
    }
}
