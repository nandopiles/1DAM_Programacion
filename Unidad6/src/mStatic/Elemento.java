package mStatic;

 //@author 6jmati

public class Elemento {
    private String nom;
    static int numElemento = 0; 
    
    public Elemento(String n) {
        this.nom = n;
        numElemento++;
    }
    
    static public int numeroDeElementos() {
        return numElemento;
    }
}
