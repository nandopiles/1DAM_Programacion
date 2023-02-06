package RepasoFiguras;

//@author Nando
public class MainFiguras {

    public static void main(String[] args) {
        Figura[] vec = new Figura[4];
        int[] v = {1,2};
        
        vec[0] = new Circulo(1,v,"rojo");
        vec[1] = new Rectangulo(3, 6, v);
        vec[2] = new Rectangulo(2, 5,"azul", v);
        vec[3] = new Circulo(3, v);
        for (int i = 0; i < 4; i++) {
            System.out.println(vec[i].calcularArea());
        }
        System.out.println("Ordenados:" + estanEnOrden(vec));
    }

    public static boolean estanEnOrden(Figura[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i].compareTo(vec[i + 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
