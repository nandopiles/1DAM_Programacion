package ExamenPractica;

//@author Nando
import java.util.Objects;

public class Multimedia implements Comparable<Multimedia> {

    private String nombre;
    private int duracion;

    public Multimedia(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Multimedia(String nombre) {
        this.nombre = nombre;
    }  

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public int compareTo(Multimedia m) {
        return this.nombre.compareTo(m.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Multimedia other = (Multimedia) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDuración: " + duracion;
    }

}
