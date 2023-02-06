/**
 * @author 6jmati
 */
package Veterinaria;

import java.util.*;

public class Cliente implements Comparable<Cliente> {

    private String dni, nombre, apellido;
    private HashSet<Mascota> listaMascotas = new HashSet();
    private HashSet<Pez> listaPeces = new HashSet();

    public Cliente(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(String dni) {
        this.dni = dni;
    }

    public void añadirMascota(Mascota m) {
        listaMascotas.add(m);
    }

    public void añadirPeces(Pez p) {
        listaPeces.add(p);
    }

    public void visualizarAnimales() {
        System.out.println("Mascotas: ");
        for (Mascota m : listaMascotas) {
            if (m instanceof Ave) {
                System.out.println(((Ave) m).toString() + "\n_________________________\n");
            } else {
                System.out.println(((Mamifero) m).toString() + "\n_________________________\n");
            }
        }
        if (listaPeces.size() != 0) {
            System.out.println("Peces: ");
            for (Pez p : listaPeces) {
                System.out.println(p + "\n_________________________\n");
            }
        }
    }

    public String getDni() {
        return dni;
    }

    @Override
    public int compareTo(Cliente e) {
        return this.dni.compareTo(e.dni);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dni);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre: " + nombre + " " + apellido
                + "\nMascotas: " + listaMascotas.size() + "\nPeces: " + listaPeces.size();
    }
}
