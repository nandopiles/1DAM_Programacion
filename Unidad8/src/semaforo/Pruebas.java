package semaforo;

//@author Nando


public class Pruebas {
    //dentro de la clase
     enum semaforo{ROJO, AMARILLO, VERDE}
    
    public static void main(String[] args) {
        semaforo estado1;
        semaforo2 estado2;
        semaforo3 estado3;
        
        estado1 = semaforo.AMARILLO;
        System.out.println(estado1.name());
        estado2 = semaforo2.ROJO;
        System.out.println(estado2.name());
        estado3 = semaforo3.VERDE;
        System.out.println(estado3.name());
    } 
//fuera de la clase
enum semaforo2{ROJO, AMARILLO, VERDE};
}
