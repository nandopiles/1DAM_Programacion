package RepasoFiguras;

//@author Nando
abstract class Figura implements Comparable<Figura> {

    private String color;
    private int[] posicion;

    public Figura(String color, int[] posicion) {
        this.color = color;
        this.posicion = posicion;
    }

    public Figura(int[] posicion) {
        this.posicion = posicion;
        this.color = "negro";
    }

    abstract double calcularPerimetro();

    abstract double calcularArea();

    final public boolean menorQue(Figura f) {
        if (this.calcularArea() < f.calcularArea()) {
            return true;
        }
        return false;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public int[] getPosicion() {
        return posicion;
    }

    @Override
    public int compareTo(Figura f) {
        if (this.calcularArea() < f.calcularArea()) {
            return -1;
        } else if (this.calcularArea() > f.calcularArea()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nCentro:\nx: " + posicion[0] + "\ny: " + posicion[1];
    }

}
