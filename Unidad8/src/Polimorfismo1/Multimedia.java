package Polimorfismo1;

//@author Nando
public class Multimedia {

    private String titulo, autor;
    private int duracion;
    private Formato formato;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public boolean comparar(Multimedia multimedia) {
        if (this.autor.equals(multimedia.autor) && this.titulo.equals(multimedia.titulo)) {
            return true;
        } else {
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public Formato getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Título: " + titulo
                + "\nAutor: " + autor
                + "\nFormato: " + formato
                + "\nDuración: " + duracion;
    }
}
