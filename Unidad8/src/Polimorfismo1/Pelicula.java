package Polimorfismo1;

 //@author 6jmati
 

public class Pelicula extends Multimedia{
    private String actriz_princ, actor_princ;
    
    //los 2 no pueden ser nulos (lo hago en el main)
    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actriz, String actor) {
        super(titulo, autor, formato, duracion);
        this.actriz_princ = actriz;
        this.actor_princ = actor;
    }

    public void setActriz_princ(String actriz_princ) {
        this.actriz_princ = actriz_princ;
    }

    public void setActor_princ(String actor_princ) {
        this.actor_princ = actor_princ;
    }

    public String getActriz_princ() {
        return actriz_princ;
    }
    
    @Override
    public String toString() {
        return super.toString()
                +"\nActor Principal: "+actor_princ
                +"\nActriz Principal: "+actriz_princ;
    }
}
