package circuloGaraje.practica2;

 //@author 6jmati
 

public class Coche {
    private Motor motor;
    String marca, modelo;
    double precioAcumulado;
    
    public Coche(String marca, String modelo, int caballos) {
        this.motor = new Motor(caballos);
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public double getPrecioAcumulado() {
        return this.precioAcumulado;
    }
    
    public void acumularAveria(double importe) {
        this.precioAcumulado += importe;
    }
    
    @Override
    public String toString() {
        return "______________________________________\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nCaballos: "+motor.getCaballos();
    }
}
