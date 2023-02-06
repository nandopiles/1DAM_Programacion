 //@author 6jmati
 package VeterinariaPOO;

public class Ave extends Mascota{
    private int nAnilla;

    public Ave(int nAnilla, String nombre, String fechaN, String especie, Cliente amo) {
        super(nombre, fechaN, especie, amo);
        this.nAnilla = nAnilla;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNº Anilla: " + nAnilla;
    }
}
