package AgendaObjetos;

 //@author 6jmati

import java.io.Serializable;
import java.util.Objects;

public class Contacto implements Serializable{
    private String nombre;
    private long telefono;

    public Contacto(String nombre, long telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
    }  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
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
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + (int) (this.telefono ^ (this.telefono >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nTeléfono: "+telefono+"\n______________________________________";
    }

}
