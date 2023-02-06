package ArraysObjetos.Ampliacion2;

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
        Scanner fr = new Scanner(System.in);
        
        float evaluacion1 = 0, evaluacion2 = 0, evaluacion3 = 0;
        String nombre = "", apellidos = "";
        Alumno estudiante;

        System.out.print("Nombre Alumno: ");
        nombre = eb.nextLine();
        System.out.print("Apellidos de " + nombre + ": ");
        apellidos = eb.nextLine();
        System.out.print("Introduce la nota de la 1ª evaluación: ");
        evaluacion1 = fr.nextFloat();
        System.out.print("Introduce la nota de la 2ª evaluación: ");
        evaluacion2 = fr.nextFloat();
        System.out.print("Introduce la nota de la 3ª evaluación: ");
        evaluacion3 = fr.nextFloat();
        
        estudiante = new Alumno(nombre, apellidos, evaluacion1, evaluacion2, evaluacion3);
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
