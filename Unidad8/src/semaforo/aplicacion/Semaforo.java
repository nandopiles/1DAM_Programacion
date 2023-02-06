package semaforo.aplicacion;

//@author Nando
enum ColorSemaforo {
    ROJO, AMARILLO, VERDE
};

public class Semaforo {

    ColorSemaforo color;
    boolean parpadeando;

    public Semaforo() {
        this.color = ColorSemaforo.ROJO;
        this.parpadeando = false;
    }

    public Semaforo(ColorSemaforo color, boolean parpadeando) {
            this.color = color;
            this.parpadeando = parpadeando;
    }

    @Override
    public String toString() {
        if (parpadeando == true) {
            return "El semáforo está de color: " + this.color + " y está parpadeando";
        } else {
            return "El semáforo está de color: " + this.color + " y NO está parpadeando";
        }
    }
}
