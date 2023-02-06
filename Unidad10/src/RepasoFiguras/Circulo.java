package RepasoFiguras;

//@author Nando


public class Circulo extends Figura{
    private float radio;

    public Circulo(float radio, int[] posicion) {
        super(posicion);
        this.radio = radio;
    }
    
    public Circulo(float radio, int[] posicion, String color) {
        super(color, posicion);
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro() {
        double perimetro = Math.PI * 2 * radio;
        
        return perimetro;
    }
    
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        
        return area;
    }
}
