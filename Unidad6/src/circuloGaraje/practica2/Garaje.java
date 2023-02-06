package circuloGaraje.practica2;

//@author 6jmati
public class Garaje {

    Coche coche;
    String averia;
    int numCochesAtendidos;
    static int cochesEnGaraje = 0;
    
    
    public boolean atenderCoche() {
        if (cochesEnGaraje != 0) {
            return false;
        }else{
            return true;
        }
    }
    
    public void aceptarCoche(Coche coche, String averia) {
        if (atenderCoche() == true) {
            this.coche = coche;
            this.averia = averia;
            cochesEnGaraje++;
        }else{
            System.out.println("Ya hay un coche en el Garaje, no se puede entrar...");
        }
    }
    
    public void devolverCoche() {
        if (atenderCoche() == false) {
            cochesEnGaraje--;
        }else{
            System.out.println("No hay ningún coche en el garaje");
        }      
    }
}
