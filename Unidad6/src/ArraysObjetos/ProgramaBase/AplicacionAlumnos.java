package ArraysObjetos.ProgramaBase;

//@author 6jmati
import ArraysObjetos.ProgramaBase.Alumno;
import java.util.*;

public class AplicacionAlumnos {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Scanner fr = new Scanner(System.in);
        Alumno estudiante;
        int numeroAlumnos;
        float nota = 0, notaMedia = 0, sumaNota = 0;
        String nombre = "", apellidos = "";

        System.out.println("¿Cuántos alumnos quieres agrega a la lista?");
        numeroAlumnos = fr.nextInt();
        Alumno[] listaAlumnos = new Alumno[numeroAlumnos];
        for (int alumno = 0; alumno < listaAlumnos.length; alumno++) {
            System.out.print("Nombre Alumno: ");
            nombre = eb.nextLine();
            System.out.print("Apellidos de " + nombre + ": ");
            apellidos = eb.nextLine();
            System.out.print("Nota de " + nombre + " " + apellidos + ": ");
            nota = fr.nextFloat();
            nota = comprobarNota(nota);
            estudiante = new Alumno(nombre, apellidos, nota);
            listaAlumnos[alumno] = estudiante;
            System.out.println("");
            sumaNota += estudiante.getNotaFinal();
        }
        System.out.println("Lista Alumnos:");
        for (int alumno = 0; alumno < listaAlumnos.length; alumno++) {
            System.out.println(listaAlumnos[alumno]);
            System.out.println("________________");
        }
        notaMedia = calcularMedia(sumaNota, numeroAlumnos);
        System.out.println("Nota Media Clase --> " + notaMedia);
        System.out.println("");
        System.out.println("Alumnos por encima de la media:");
        encimaMedia(notaMedia, listaAlumnos);
    }

    public static float comprobarNota(float nota) {
        Scanner fr = new Scanner(System.in);
        while (nota < 0 || nota > 10) {
            System.out.print("Nota no válida...\nRepita: ");
            nota = fr.nextFloat();
        }
        return nota;
    }

    public static float calcularMedia(float suma, int cantidadAlumnos) {
        float media;

        media = suma / cantidadAlumnos;
        return media;
    }

    public static void encimaMedia(float media, Alumno[] lista) {
        for (int alumno = 0; alumno < lista.length; alumno++) {
            if (lista[alumno].getNotaFinal() > media) {
                System.out.println(lista[alumno].getNombre());
            }
        }
    }
}
