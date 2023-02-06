

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nando
 */
import java.util.Scanner;
public class cond3 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        
        System.out.println("¿De qué turno deseas ver su salario?(Introduce su número)\n1-mañana\n2-noche\n3-festivo");
        int turno= tcl.nextInt();
        
        if (turno==1){
            System.out.println("Tu salario semanal será de: "+600*40+"pts");} //se hacen siempre 8h y por la mañana solo se trabajan 5 días a la semana
        else{
        if(turno==2){
            System.out.println("Tu salario semanal será de: "+800*40+"pts");}// 8h y se trabajan 5 días a la semana
        else{
            System.out.println("Tu salario semanal será de: "+1000*16+"pts");}//8h pero solo se trabajan 2 días a la semana, FINES DE SEMANA
        }
    }
}
