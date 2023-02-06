package ExamenPractica;

//@author Nando


public class Disco extends Multimedia{
    private String cantante;
    private Genero genero;
    
    public Disco(String nombre, Genero genero, int duracion, String cantante) {
        super(nombre, duracion);
        this.cantante = cantante;
        this.genero = genero;
    }

    public Disco(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCantante: " + cantante + "\nGénero: " + genero;
    }
}
