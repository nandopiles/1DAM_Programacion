package garaje_temp;

//@author Nando
public class Garaje {

    private Coche coche;
    private String averia;
    private static int cochesAtendidos, cochesEnGaraje = 0;
    private static boolean pasar;

    public void aceptarCoche(Coche coche, String averia) {
        this.pasar = comprobarGaraje();
        if (this.pasar == true) {
            System.out.println("Puede pasar al Garaje");
            this.cochesAtendidos++;
            this.cochesEnGaraje++;
        } else {
            System.out.println("El garaje está lleno...");
        }
    }

    public void devolverCoche() {
        if (this.cochesEnGaraje == 0) {
            System.out.println("El coche no está en el garaje");
        } else {
            System.out.println("Sacando coche");
            this.cochesEnGaraje--;
        }
    }

    public boolean comprobarGaraje() {
        if (cochesEnGaraje != 0) {
            return false;
        } else {
            return true;
        }
    }
}
