package ArraysObjetos.Ampliacion1;

//@author 6jmati
public class Alumno {

    private String nombre, apellidos;
    private float [] listaNotas;
    private static float sumaNota = 0;

    public Alumno(String nombre, String apellidos, float [] nota) {
        this(nota);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno(float [] nota) {
        this.listaNotas = nota;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
 
    public float getSumaNotas() {
        return this.sumaNota;
    }

    public String getNotas() {
        String imprimeNotas = "";
        
        for (int nota = 0; nota < listaNotas.length - 1; nota++) {
            imprimeNotas += listaNotas[nota]+", ";
        }
        imprimeNotas += listaNotas[listaNotas.length - 1];
        return imprimeNotas;
    }
    
    public float notaMediaAlumno() {
        float sumaNota = 0, media;
        
        for (int nota = 0; nota < this.listaNotas.length; nota++) {
            sumaNota += this.listaNotas[nota];
        }
        media = sumaNota / listaNotas.length;
        return media;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nNota: " + getNotas();
    }
}
