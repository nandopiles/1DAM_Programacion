package CarreraPArticipante;

//@author Nando
public class Participante implements Comparable<Participante> {

    private String nombre;
    private int dorsal;

    public Participante(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Participante p) {
        if (this.dorsal > p.dorsal) {
            return 1;
        } else if (this.dorsal < p.dorsal) {
            return -1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.dorsal;
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
        final Participante other = (Participante) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String toString() {
        return "Dorsal " + this.dorsal + "\nNombre " + this.nombre;
    }
}
