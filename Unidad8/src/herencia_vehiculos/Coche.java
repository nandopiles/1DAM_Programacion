package herencia_vehiculos;

//@author 6jmati
public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntiene " + puertas + " puertas\n";
    }

}
