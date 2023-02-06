package mStatic.ej2;

//@author Nando


public class Aparato {
    private int consumo;
    static int consumoTotal = 0;
    private String nombre;
    
    public Aparato(int c, String nombre) {
        this.consumo = c;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getConsumo() {
        return this.consumo;
    }
    
    static public int calcPotenciaTotal() {
        return consumoTotal;
    }
    
    @Override
    public String toString() {
        return "_____________________\nDispositivo: "+ this.nombre +"\nConsumo: " +this.consumo+ "W\n";
    }
}
