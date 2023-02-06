package Clase_Abstracta;

 //@author 6jmati
 

public class Rectangulo extends Figura{

    private double area;
    private int base, altura, perimetro;
    
    public Rectangulo(String color, int x, int y, int base, int altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        area = base * altura;
        return area;
    }
    
    public double calcularPerimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }
    
}
