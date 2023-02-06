package herencia_vehiculos;

//@author 6jmati
public class Camion extends Vehiculo {

    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }
    
    public void acelerar(int velocidad) throws DemasiadoRapidoException{
        if (remolque != null && (this.velocidad + velocidad) > 100) {
            throw new DemasiadoRapidoException("EL camión tiene remolque y supera los 100km/h\n");
        } else {
            this.velocidad += velocidad;
        }
    }

    @Override
    public String toString() {
        if (remolque != null) {
            return super.toString() + remolque.toString();
        }
        return super.toString();
    }
}
