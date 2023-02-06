package almacenes;

 //@author 6jmati
 

public class LogisticaAlmacen {
    private int capacidadAlmacen, huecosAlmacen;
    
    public void setCapacidad (int capacidad) {
        this.capacidadAlmacen = capacidad;
        this.huecosAlmacen = capacidad;
    }
    
    public int getCapacidad () {
        return capacidadAlmacen;
    }
    
    public boolean hayHuecos() {
        return huecosAlmacen > 0;
    }
    
    public boolean hayContenedores() {
        return huecosAlmacen < capacidadAlmacen;
    }
    
    public boolean meterContenedor() {
        if (hayHuecos()) {
            huecosAlmacen--;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean sacarContenedores() {
        if (hayContenedores()) {
            huecosAlmacen++;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "LogisticaAlmacen (capacidad= "+capacidadAlmacen+" huecos="+huecosAlmacen+")";
    }
}
