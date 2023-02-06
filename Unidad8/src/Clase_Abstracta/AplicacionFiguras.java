package Clase_Abstracta;

//@author 6jmati
public class AplicacionFiguras {

    public static void main(String[] args) {
        Figura[] vec = new Figura[4];
        vec[0] = new Circulo("rojo", 4, 5, 3);
        vec[1] = new Rectangulo(3, 6, 10, 12);
        vec[2] = new Rectangulo("azul",2, 5, 3, 5);
        vec[3] = new Circulo(42, 35, 4);
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
