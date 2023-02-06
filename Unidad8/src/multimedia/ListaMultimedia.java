package multimedia;

//@author Nando
public class ListaMultimedia {

    private Multimedia[] arrayMultimedia;
    private int objAlmacenados, size, duracionTotal = 0, discosRock = 0, noActriz = 0;

    public ListaMultimedia(int numMaxObj) {
        size = numMaxObj;
        arrayMultimedia = new Multimedia[size];
        objAlmacenados = 0;
    }

    //num objetos que hay en la Lista
    public int size() {
        return objAlmacenados;
    }

    //añade un obj al final de la Lista y devuelve true. Si está llena devuelve false
    public boolean add(Multimedia m) {
        boolean poderRellenar = true;

        for (int i = 0; i < size; i++) {
            if (arrayMultimedia[i] == null) {
                arrayMultimedia[objAlmacenados] = m;
                objAlmacenados++;
                return true; //cuando hay un return se rompe el bucle
            }
        }
        return false;
    }

    //devuelve el obj que está en la posición seleccionada
    public Multimedia get(int posicion) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion > size) {
            throw new IndexOutOfBoundsException();
        }
        return arrayMultimedia[posicion];
    }

    //devuelve la posición del obj pasado o -1 si no se encuentra
    public int indexOf(Multimedia m) {
        boolean encontrado = false;
        int posicion = 0;

        for (int i = 0; i < size; i++) {
            if (arrayMultimedia[i] == m) {
                encontrado = true;
                posicion = i;
            }
        }
        if (encontrado == false) {
            return -1;
        } else {
            return posicion;
        }
    }

    //borra el elemento del array en la posición seleccionada y corre los elementos de la derecha una posición a la izquierda
    public void delete(int posicion) {
        arrayMultimedia[posicion] = null;
        for (int i = posicion; i < objAlmacenados - 1; i++) {
            arrayMultimedia[i] = arrayMultimedia[i + 1];
        }
        objAlmacenados--;
    }
    
    public void filtrar() {
        for (int i = 0; i < arrayMultimedia.length; i++) {
            if (arrayMultimedia[i] instanceof Disco) {
                duracionTotal += ((Disco)arrayMultimedia[i]).getDuracion();
                if (((Disco)arrayMultimedia[i]).getGenero().equals(Genero.ROCK)) {
                    discosRock++;
                }
            } else if (arrayMultimedia[i] instanceof Pelicula){
                duracionTotal += ((Pelicula)arrayMultimedia[i]).getDuracion();
                if (((Pelicula)arrayMultimedia[i]).getActriz_princ() == null) {
                    noActriz++;
                }
            }
        }
        System.out.println("Duración Total --> " + duracionTotal
                            + "\nDiscos de Rock --> " + discosRock
                            + "\nPelículas sin Actriz --> " + noActriz);
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < objAlmacenados; i++) {
            cadena += arrayMultimedia[i].toString() + "\n__________\n";

        }
        for (int i = objAlmacenados; i < size; i++) {
                cadena += "NULL\n__________\n";
        }
        return cadena;
    }
}
