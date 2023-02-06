package excepciones2;

//@author 6jmati
public class ClaseExcept1 {

    public static void main(String[] args) {
        int[] array = {-2, -1, 0, 1, 2};
        int num = 2;

        dividirEntreArray(num, array);
    }

    public static void comprobarArray(int[] array, int posicion) throws Exception {
            if (array[posicion] == 0) {
                throw new Exception("División entre 0");
            }
    }

    public static void dividirEntreArray(int num, int[] array) {
        float division = 0;

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print(num + " / " + array[i] + " = ");
                comprobarArray(array, i);
                division = num / array[i];
                System.out.println(division);
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            } finally {
                System.out.println("");
            }
        }
    }
}
