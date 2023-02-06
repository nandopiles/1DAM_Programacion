

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
public class cond11 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        String dias;
        
        System.out.println("Dime un día de la semana:");
        dias= tcl.next();
        
        if (dias.equals("sabado")||dias.equals("domingo")){
            System.out.println("Es un día FESTIVO");}
        else{
            System.out.println("Es un día LECTIVO");}      
    }
}
