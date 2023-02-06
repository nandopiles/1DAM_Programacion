package ArraysObjetos.ProgramaBase;

//@author 6jmati
public class Alumno {

    private String nombre, apellidos;
    private float notaFinal;
    private static float sumaNota = 0;

    public Alumno(String nombre, String apellidos, float nota) {
        this(nota);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno(float nota) {
        this.notaFinal = nota;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public float getSumaNotas() {
        return this.sumaNota;
    }
    
    public float getNotaFinal() {
        return this.notaFinal;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nNota: " + this.notaFinal;
    }
}
