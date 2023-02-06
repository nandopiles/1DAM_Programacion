package excepciones2;

//@author 6jmati
public class ClaseExcept2 {

    public static void main(String[] args) {
        int[] array = {-2, -1, 0, 1, 2};
        int num = 2;

        dividirEntreArray(num, array);
    }

    public static void dividirEntreArray(int num, int[] array) {
        float division = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                i++;
            }
            System.out.print(num + " / " + array[i] + " = ");
            division = num / array[i];
            System.out.println(division);
        }
    }
}
