package ExamenPractica;

//@author Nando


public class Peli extends Multimedia{
    private String actor;
    
    public Peli(String nombre, int duracion, String actor) {
        super(nombre, duracion);
        this.actor = actor;
    }

    public Peli(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nActor: " + actor;
    }
}
