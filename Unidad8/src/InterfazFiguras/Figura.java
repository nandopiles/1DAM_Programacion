package InterfazFiguras;

//@author 6jmati
abstract class Figura implements Comparable{

    private String color;
    private int x, y;

    public Figura(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public int compareTo(Object f) {
        Figura newF = (Figura)f;
        
        if (this.calcularArea() < newF.calcularArea()) {
            return -1;
        } else if(this.calcularArea() == newF.calcularArea()) {
            return 0;
        }
        return 1;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "El Color de la Figura es: " + color
                + "\nEl Centro se encuentra en: " + x + "  " + y;
    }

}
