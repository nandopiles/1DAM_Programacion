package excepciones2;

 //@author 6jmati
 

public class Ej3 {
    
    public static void main(String[] args) {
        String[] x = {"Hola", "Pepe", "Maria", "Miguel Angel"};
        String[] m = new String[5];
        String[] z = {"hola", null, "pepe", "", "quinta"};
        
        System.out.println("Primer Array:");
        mostrarCadenasArray(x);
        System.out.println("");
        System.out.println("Segundo Array:");
        mostrarCadenasArray(m);
        System.out.println("");
        System.out.println("Tercer Array:");
        mostrarCadenasArray(z);
        System.out.println("");
    }
    
    public static void mostrarCadenasArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
            System.out.println(array[i].charAt(0)+" ");
            } catch (NullPointerException e1) {
                System.out.println("Null ");
            } catch (StringIndexOutOfBoundsException e2) {
                System.out.println("Vacío ");
            }
        }
    }
}
