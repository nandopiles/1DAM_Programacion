 //@author 6jmati

package Veterinaria;

import java.util.*;
public class Mamifero extends Mascota implements Vacunable {

    private String fechaV;
    private boolean vacunado;
    static private HashSet<Vacunable> listaVacunados = new HashSet();

    public Mamifero(String fechaV, boolean vacunado, String nombre, String fechaN, String especie, Cliente amo) {
        super(nombre, fechaN, especie, amo);
        this.fechaV = fechaV;
        this.vacunado = vacunado;
    }
    
    public void añadirVacunado() {
        Vacunable v;
        try {
            v = this;
            listaVacunados.add(v);
        } catch(Exception e) {
            System.out.println("[-]No se puede vacunar...");
        }
    }

    @Override
    public void vacunar() {
        if (vacunado == true) {
            System.out.println("Este mamífero está vacunado");
        } else if (vacunado == false) {
            System.out.println("Vacunando al mamífero...");
            this.vacunado = true;
        }
    }

    @Override
    public String toString() {
        if (!fechaV.equals("0")) {
            return super.toString() + "\nFecha de Vacunación: " + fechaV;
        }
        return super.toString() + "\nNo está vacunado";
    }
    
    
}
