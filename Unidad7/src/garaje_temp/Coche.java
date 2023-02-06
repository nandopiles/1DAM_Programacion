package garaje_temp;

//@author Nando


public class Coche {
    private Motor motor;
    private String marca, modelo;
    private double precioAverias;
    
    public Coche(String marca, String modelo, int caballos) {
        this.motor = new Motor(caballos);
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //para navegar dentro del objeto motor
    public Motor getMotor() {
        return motor;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public double getPrecioAverias() {
        return this.precioAverias;
    }
    
    public void acumularAveria(double importe) {
        this.precioAverias += importe;
    }
    
    @Override
    public String toString() {
        return "______________________________________\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nCaballos: "
                +motor.getCaballos()+"\nLitros de Aceite "+getMotor().getLitrosAceite()+"\nAverías: "+getPrecioAverias()+"€";
    }
}
