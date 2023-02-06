package RepasoFiguras;

//@author Nando


public class Rectangulo extends Figura{
    private int b, h;

    public Rectangulo(int b, int h, String color, int[] posicion) {
        super(color, posicion);
        this.b = b;
        this.h = h;
    }

    public Rectangulo(int b, int h, int[] posicion) {
        super(posicion);
        this.b = b;
        this.h = h;
    }
    
    @Override
    public double calcularArea() {
        double area = b * h;       
        
        return area;
    }
    
    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (b + h);
        
        return perimetro;
    }
}
