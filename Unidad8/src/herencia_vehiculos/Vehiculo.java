package herencia_vehiculos;

 //@author 6jmati
 

public class Vehiculo {
    private String matricula;
    protected int velocidad;
    
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }
    
    public void acelerar(int velocidad) throws DemasiadoRapidoException{
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "El vehículo con matrícula: "+matricula
                +"\nva a una velocidad de: "+velocidad+"km/h";
    }
    
    
}
