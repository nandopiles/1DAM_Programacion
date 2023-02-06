
public class array1 {
    
    public static int random() {
        return (int) (Math.random() * 10 + 1);
    }
    
    public static void main(String[] args) {
        int acum = 0, media;
        int [] notas = new int [15];
        
        for (int i = 0; i < notas.length; i++) {
            notas [i] = random();
            System.out.println(notas[i]);
        }
        
        for (int x = 0; x < notas.length; x++) {
            acum = acum + notas[x];
        }
        media = acum / notas.length;
        System.out.println("La media es de: " + media);
        System.out.print("Notas por encima de la media ---> ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.print(notas[i]+" ");
            }
        }
    }
}
