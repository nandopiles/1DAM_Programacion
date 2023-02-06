package ArraysObjetos.Ampliacion2;

//@author 6jmati
public class Alumno {

    private String nombre, apellidos;
    private static float sumaNota = 0;
    private float eval1, eval2, eval3;

    public Alumno(String nombre, String apellidos, float eval1, float eval2, float eval3) {
        setEval1(eval1);
        setEval2(eval2);
        setEval3(eval3);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }

    public String getNotas() {
        return eval1+", "+eval2+", "+eval3;
    }
    
    public float notaMediaAlumno() {
        float media = 0;
        
         media = (eval1 + eval2 + eval3) / 3;
         return media;
    }
    
    public void setEval1(float nota) {
        this.eval1 = nota;
    }

    public void setEval2(float nota) {
        this.eval2 = nota;
    }
    
    public void setEval3(float nota) {
        this.eval3 = nota;
    }
    
    public float getEval1() {
        return this.eval1;
    }
    
    public float getEval2() {
     return this.eval2;   
    }
    
    public float getEval3() {
        return this.eval3;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nNota: " + getNotas();
    }
}
