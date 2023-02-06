package coche;

 //@author 6jmati
 

public class coche1 {
    private String modeloCoche,colorCoche,matrCoche,fabrCoche,seguroCoche;
    
    public coche1(String modelo, String matricula) {
        this.modeloCoche = modelo;
        this.matrCoche = matricula;      
    }
    
    public coche1(String modelo, String matricula, String color, String fecha, String seguro) {
        this(modelo,matricula); //llamar al constructor anterior (solo lo puedo llamar a otro constructor en la 1ª línea)
        this.colorCoche = color;
        this.fabrCoche = fecha;
        this.seguroCoche = seguro;
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
    
    public void PonFabr(String fabricacion) {
        fabrCoche = fabricacion;
    }
    
    public void PonSeguro(String seguro) {
        seguroCoche = seguro;
    }
    
    
}
