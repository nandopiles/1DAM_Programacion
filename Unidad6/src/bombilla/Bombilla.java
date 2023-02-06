package bombilla;

//@author 6jmati
public class Bombilla {

    private boolean encendido, encendidoGeneral;

    public Bombilla() {
        this.encendido = false;
        this.encendidoGeneral = false;
    }

    public void setEstadoBombillaOn() {
        this.encendido = true;
    }
    
    public void setEstadoBombillaOff() {
        this.encendido = false;
    }

    public boolean getBombilla() {
        return this.encendido;
    }

    public boolean estadoBombilla() {
        return encendido;
    }

    public void setEncendidoGeneral() {
        this.encendidoGeneral = true;
    }
    
    public void setApagadoGeneral() {
        this.encendidoGeneral = false;
    }

    public boolean estadoGeneral() {
        return encendidoGeneral;
    }
}
