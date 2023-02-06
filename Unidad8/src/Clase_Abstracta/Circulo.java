package Clase_Abstracta;

 //@author 6jmati
 

public class Circulo extends Figura{

    private double area, perimetro, radio;
    
    public Circulo(String color, int x, int y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
}
