 //@author 6jmati
package VeterinariaPOO;

import java.io.*;

public class Mascota implements Serializable{

    private static int cont = 1;
    private int id;
    private String nombre, fechaN, especie;
    private Cliente amo;

    public Mascota(String nombre, String fechaN, String especie, Cliente amo) {
        
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.especie = especie;
        this.id = cont;
        this.amo = amo;
        cont++;
    }

    public Mascota(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
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
        final Mascota other = (Mascota) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nFecha Nacimiento: " + fechaN
                + "\nEspecie: " + especie + "\nDNI Amo: "+amo.getDni();
    }
}
