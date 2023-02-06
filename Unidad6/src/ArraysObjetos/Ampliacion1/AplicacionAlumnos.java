package ArraysObjetos.Ampliacion1;

//@author 6jmati
import java.util.Scanner;

public class AplicacionAlumnos {

    static Scanner eb = new Scanner(System.in);
    static Scanner fr = new Scanner(System.in);

    public static void main(String[] args) {

        Alumno estudiante;
        int numeroAlumnos;
        float notaMedia = 0, sumaNotas = 0;

        System.out.println("¿Cuántos alumnos quieres agrega a la lista?");
        numeroAlumnos = fr.nextInt();
        Alumno[] listaAlumnos = new Alumno[numeroAlumnos];
        sumaNotas = introducirDatosAlumnos(listaAlumnos);
        System.out.println("Lista Alumnos:");
        for (int alumno = 0; alumno < listaAlumnos.length; alumno++) {
            System.out.println(listaAlumnos[alumno]);
            System.out.println("________________");
        }
        notaMedia = notaMediaClase(numeroAlumnos, sumaNotas);
        System.out.println("");
        System.out.println("Nota media de la clase: "+notaMedia);
        System.out.println("Alumnos por encima de la media:");
        encimaMedia(notaMedia, listaAlumnos);
    }
    
    public static float introducirDatosAlumnos(Alumno [] listaAlumnos) {
        float sumaNotas = 0;
        Alumno estudiante;
        
        for (int alumno = 0; alumno < listaAlumnos.length; alumno++) {
            estudiante = introducirDatos();
            System.out.println("");
            System.out.println("Nota media " + estudiante.getNombre() + " " + estudiante.getApellidos() + " --> " + estudiante.notaMediaAlumno());
            listaAlumnos[alumno] = estudiante;
            System.out.println("");
            sumaNotas += estudiante.notaMediaAlumno();
        }
        return sumaNotas;
    }

    public static Alumno introducirDatos() {
        float calificacion;
        String nombre = "", apellidos = "";
        float [] listaNotas = new float [3];
        Alumno estudiante;

        System.out.print("Nombre Alumno: ");
        nombre = eb.nextLine();
        System.out.print("Apellidos de " + nombre + ": ");
        apellidos = eb.nextLine();
        for (int nota = 0; nota < listaNotas.length; nota++) {
            System.out.print("Nota " + nota + " de " + nombre + " " + apellidos + ": ");
            calificacion = fr.nextFloat();
            comprobarNota(calificacion);
            listaNotas[nota] = calificacion;
        }
        estudiante = new Alumno(nombre, apellidos, listaNotas);
        return estudiante;
    }
    
    public static float notaMediaClase(int cantidadAlumnos, float notas) {
        float media;
        
        media = notas / cantidadAlumnos;
        return media;
    }

    public static float comprobarNota(float nota) {
        while (nota < 0 || nota > 10) {
            System.out.print("Nota no válida...\nRepita: ");
            nota = fr.nextFloat();
        }
        return nota;
    }

    public static void encimaMedia(float media, Alumno [] lista) {
        for (int alumno = 0; alumno < lista.length; alumno++) {
            if (lista[alumno].notaMediaAlumno() > media) {
                System.out.println(lista[alumno].getNombre());
            }
        }
    }
}
