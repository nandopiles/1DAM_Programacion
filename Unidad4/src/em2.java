
import java.util.Scanner;

public class em2 {
    
public static final String ANSI_RED = "\u001B[31m"; //color letra rojo (código ANSI)
public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m"; //color fondo cyan(código ANSI)

    public static int menu() { //método para el menú
        Scanner eb = new Scanner(System.in);
        int opc;
        System.out.println("1.   Capicua\n2.   Números amigos\n3.   Dibujar rectángulo de *\n4.   Salir");
        opc = eb.nextInt();

        if (opc <= 4 && opc >= 1) { //Switch para elegir la opción en el menú
            switch (opc) {
                case 1:
                    System.out.println("Has elegido la opción -->"+ ANSI_CYAN_BACKGROUND + ANSI_RED +"Capicua");
                    break;
                case 2:
                    System.out.println("Has elegido la opción -->"+ ANSI_CYAN_BACKGROUND + ANSI_RED +"Números amigos");
                    break;
                case 3:
                    System.out.println("Has elegido la opción -->"+ ANSI_CYAN_BACKGROUND + ANSI_RED +"Dibujar rectángulo de *");
                    break;
                case 4:
                    System.out.println("Has elegido la opción -->"+ ANSI_CYAN_BACKGROUND + ANSI_RED +"Salir");
                    break;
            }
        } else {
            System.out.println("La opción NO es correcta");
        }
        return opc; //devuelve el número que hemos introducido por teclado para elegir el menú
    }

    public static int capicua(int nCap) { //método capicua
        Scanner eb = new Scanner(System.in);
        int aux, inverso = 0, cifra, opc;

        aux = nCap; //creamos una variable que se asignará el mismo número que hemos introducido
                    //para poder tocar el número como queramos sin tener miedo de perderlo
        while (aux != 0) {//Mientras número introducido diferente a 0
            cifra = aux % 10; //módulo de 10 nos devuelve el último dígito del número
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (nCap == inverso) {
            System.out.println("Es capicua");
            opc = 1;
        } else {
            System.out.println("NO es capicua");
            opc = 0;
        }
        return opc;
    }

    public static int sumDiv(int nDiv) { //método para sumar todos los divisores de un número SIN CONTAR el número
        int div, sum = 0;

        for (div = 1; div < nDiv; div++) { //creamos una variable Contador para que nos cuente del 1 al número que queremos saber sus divisores
            if (nDiv % div == 0) {//ahora irá número a número comprobando si dividiendo el numIntroducido entre el númeroContador su resto nos da 0 (si da 0 es que es divisor)
                sum = sum + div;//si es divisor entonces se irá sumando en la variable sum
            }
        }
        return sum;
    }

    public static void amigos(int metDiv1, int metDiv2) {//método amigos
        if (metDiv1 == metDiv2) { //si son iguales son amigos sino no. muy feo esto
            System.out.println("Son amigos");
        } else {
            System.out.println("NO son amigos");
        }
    }

    public static void rectangulo(int filas, int columnas) { //método para hacer un rectángulo introduciendo sus columnas y filas
        for (int cont = 0; cont < filas; cont++) {//filas: mientras el cont sea < a filas entrará al bucle
            for (int cont2 = 0; cont2 < columnas; cont2++) {//columnas: mientras cont2 sea < a columnas entrará al bucle
                System.out.print("*");//si entra al bucle de columnas irá escribiendo los *
            }
            System.out.println("");/*hará un salto de línea cuando cont2 sea igual al número de columnas, es decir habrá puesto una fila
                                    llena de * y saltará de línea para rellenar la siguiente línea*/
        }
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int opc, nCap, metCap, nDiv1, nDiv2, metDiv1, metDiv2, filas, columnas;

        opc = menu(); //llamamos al método menú 

        switch (opc) { //con la opcioón que nos devuelva un menú hacemos un switch para empezar a navegar por el programa
            case 1:
                System.out.println("Introduce un número:");
                nCap = eb.nextInt();
                metCap = capicua(nCap);
                break;

            case 2:
                System.out.println("Introduce un número:");
                nDiv1 = eb.nextInt();
                metDiv1 = sumDiv(nDiv1);//haremos el método suma divisores del nDiv1
                System.out.println("Introduce un número:");
                nDiv2 = eb.nextInt();
                metDiv2 = sumDiv(nDiv2);// ahora lo haremos con el nDiv2
                amigos(metDiv1, metDiv2); //llamaremos al método amigos para que nos diga si son iguales o no
                break;

            case 3:
                System.out.println("Introduce el número de filas:");
                filas = eb.nextInt();
                System.out.println("Introduce el número de columnas:");
                columnas = eb.nextInt();
                rectangulo(filas, columnas); //llamamos a la función rectángulo para que nos lo dibuje
                break;                       //IMPORTANTE introducir filas y columnas en ese órden sino, obvismente, nos lo escribirá al revés
                
            case 4: break; //si pulsa 4 salimos del programa
        }
    }
}
