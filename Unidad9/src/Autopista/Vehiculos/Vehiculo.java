package Autopista.Vehiculos;

 //@author 6jmati
 
import java.util.*;
public class Vehiculo {
    private String matricula, color, modelo;
    
    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Matrícula: "+matricula+"\nModelo: "+modelo+"\nColor: "+color+"\n________________________";
    }
}
