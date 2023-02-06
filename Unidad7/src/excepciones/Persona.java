package excepciones;

//@author Nando
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void ponerEdad (int edad) throws Exception{
            
            if (edad < 0 || edad > 100) {
                throw new Exception("Edad incorrecta...");
            }else {
                this.edad = edad;
            }
    }

    @Override
    public String toString() {
        return "El nombre es:" + this.nombre + "\nY la edad es: " + this.edad;
    }
}
