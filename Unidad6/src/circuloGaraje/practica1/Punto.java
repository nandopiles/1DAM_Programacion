package circuloGaraje.practica1;

//@author nando
public class Punto {

    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = random();
        this.y = random();
    }
    
    public static int random() {
        return (int) (Math.random() * 10 + 1);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double calcularDistanciaDesde(Punto punto) {
        double distancia = 0;

        distancia = Math.sqrt((Math.pow(this.x - punto.getX(), 2) + Math.pow(this.y - punto.getY(), 2)));        
        return distancia;
    }
}
