package excepciones;

//@author Nando
import java.util.*;

public class Ej1 {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int num1, num2;
        double division;
        boolean continuar = true;

        //Sin tratar las excepciones:
        num1 = eb.nextInt();
        num2 = eb.nextInt();
        division = num1 / num2;
        System.out.println(division);
        System.out.println("El programa ya ha acabado\n_________________________");
        
        //Tratar las excepciones y mostrar un mensaje genérico      
        try {
            num1 = eb.nextInt();
            num2 = eb.nextInt();
            division = num1 / num2;
            System.out.println(division);
        }catch(ArithmeticException e1){
            System.out.println(e1);
        }catch(InputMismatchException e2){
            System.out.println(e2);
        }catch(Exception e3) {
            System.out.println(e3);
        }
        System.out.println("El programa ya ha acabado\n_________________________");
        
        //Programa continúe hasta que la entrada sea correcta y muestre una explicación del error
        do {
            try {
                num1 = eb.nextInt();
                num2 = eb.nextInt();
                division = num1 / num2;
                System.out.println(division);
                continuar = false;
            } catch (ArithmeticException e1) {
                System.out.println("División por cero");
                System.out.println(e1);
            } catch (InputMismatchException e2) {
                System.out.println("No es un entero");
                System.out.println(e2);
            } catch (Exception e3) {
                System.out.println("Error Genérico");
                System.out.println(e3);
            }finally {
                eb.nextLine();
            }
        } while (continuar);
        System.out.println("El programa ya ha acabado\n_________________________");
    }
}
