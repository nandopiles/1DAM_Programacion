 //@author 6jmati
package Veterinaria;

public class Mascota {

    private static int cont = 0;
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

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nFecha Nacimiento: " + fechaN
                + "\nEspecie: " + especie + "\nDNI Amo: "+amo.getDni();
    }
}
