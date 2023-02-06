 //@author 6jmati

package VeterinariaPOO;

import java.io.*;
public class Mamifero extends Mascota implements Vacunable, Serializable {

    private String fechaV;
    protected boolean vacunado;

    public Mamifero(String fechaV, boolean vacunado, String nombre, String fechaN, String especie, Cliente amo) {
        super(nombre, fechaN, especie, amo);
        this.fechaV = fechaV;
        this.vacunado = vacunado;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    @Override
    public void vacunar() {
        if (this.vacunado == true) {
            System.out.println("Este mamífero está vacunado");
        } else if (this.vacunado == false) {
            System.out.println("Vacunando al mamífero...");           
            this.vacunado = true;
            this.fechaV = "hoy";
        }
    }

    @Override
    public String toString() {
        if (!fechaV.equals("")) {
            return super.toString() + "\nFecha de Vacunación: " + fechaV;
        }
        return super.toString() + "\nNo está vacunado";
    }
    
    
}
