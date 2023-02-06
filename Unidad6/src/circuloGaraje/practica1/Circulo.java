package circuloGaraje.practica1;

 //@author nando

public class Circulo {
    private Punto centro;
    private double radio;
    
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    
    public Circulo() {
        this.centro = new Punto();
        this.radio = random();
    }
    
    public static int random() {
        return (int) (Math.random() * 10 + 1);
    }
    
    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(x, y);
        this.radio = radio;
    }
    
    public Punto getCentro() {
        return this.centro;
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public double calcularDistanciaDesde(Punto punto) {
        double distancia = 0;
        
        distancia = centro.calcularDistanciaDesde(punto) - this.radio;
        return distancia;
        
    }
    
    public double calcularArea() {
        double area = 0;
        
        area = Math.PI * Math.pow(getRadio(), 2);
        return area;
    }
    
    public double calcularPerimetro() {
        double perimetro = 0;
        
        perimetro = 2 * Math.PI * getRadio();
        return perimetro;
    }
}
