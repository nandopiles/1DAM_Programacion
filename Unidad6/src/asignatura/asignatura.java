package asignatura;

 //@author 6jmati
 

public class asignatura {
    private String nombreAsignatura, codAsignatura, cursoAsignatura;
    
    public void PonNombre(String nombre) {
        nombreAsignatura = nombre;
    }
    public String dimeNombre() {
        return nombreAsignatura;
    }
    
    public void PonCodigo(String codigo) {
        codAsignatura = codigo;
    }
    public String dimeCodigo() {
        return codAsignatura;
    }
    
    public void PonCurso(String curso) {
        cursoAsignatura = curso;
    }
    public String dimeCurso() {
        return cursoAsignatura;
    }
}
