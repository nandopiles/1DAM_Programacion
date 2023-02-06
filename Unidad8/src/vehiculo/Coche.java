package vehiculo;

 //@author 6jmati
 

public class Coche extends Vehiculo{
    double gasolina;
    
    public Coche(double v, double g) {
        super(v);
        gasolina = g;
    }
    
    public void acelerar(double cantidad) {
        super.acelerar(cantidad);
        gasolina *= 0.9;
    }
}
