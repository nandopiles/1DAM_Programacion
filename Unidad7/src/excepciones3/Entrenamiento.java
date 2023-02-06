package excepciones3;

 //@author 6jmati
 

public class Entrenamiento {
    public static void main(String[] args) {
        Corredor corredor1 = new Corredor(50);
        boolean continuar = true;
        
        do {
            continuar = corredor1.correr();
        } while (continuar);     
    }
}
