package coche;

 //@author 6jmati
 

public class coche {
    private String modeloCoche,colorCoche,matrCoche,fabrCoche,seguroCoche;
    
    public void PonModelo(String modelo) {
        modeloCoche = modelo;
    }   
    public String dimeModelo() {
        return modeloCoche;
    }
    
    public void PonColor(String color) {
        colorCoche = color;
    }   
    public String dimeColor() {
        return colorCoche;
    }
    
    public void PonMatr(String matricula) {
        matrCoche = matricula;
    }
    
    public void PonFabr(String fabricacion) {
        fabrCoche = fabricacion;
    }
    
    public void PonSeguro(String seguro) {
        seguroCoche = seguro;
    }  
}
