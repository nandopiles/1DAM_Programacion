package excepciones2;

//@author Nando
public class email {

    public static void main(String[] args) {
        enviarMensaje("nando@gmail.com");
        System.out.println("");
        enviarMensaje("calogmail.com");
        System.out.println("");
        enviarMensaje("zegio@gmailcom");
        System.out.println("");
        enviarMensaje("rompeipads.gmail@com");
        System.out.println("");
        enviarMensaje("nando@gmailcom.");
        System.out.println("");
        enviarMensaje("palo@.com");
        System.out.println("");
        enviarMensaje(null);
    }

    public static void enviarMensaje(String x) {
        int longitud = 0, arroba = 0, punto = 0;
        System.out.println(x);
        if (x != null && !x.isEmpty()) {
            longitud = x.length();
            arroba = x.indexOf("@");
            punto = x.lastIndexOf(".");
        }
        if (arroba < longitud - 1 && arroba + 1 < punto && punto < longitud - 1 && arroba != -1 && punto != -1) {
            System.out.println("¡¡email correcto!!");
        } else {
            try {
                Exception DirCorreoIncorrectaExcepcion = new Exception();
                System.out.println("Correo erroneo");
                throw DirCorreoIncorrectaExcepcion;
            } catch (Exception b) {
                System.out.println(b.getMessage());
                if (longitud == 0) {
                    System.out.println("El email tiene que tener uno o mas caracteres");
                } else {
                    if (arroba == -1) {
                        System.out.println("El email tiene que tener @");
                    }
                    if (punto == -1) {
                        System.out.println("El email tiene que tener un .");
                    }
                    if (arroba >= longitud - 1) {
                        System.out.println("La @ debe contener caracteres despues");
                    }
                    if (punto >= longitud - 1) {
                        System.out.println("El punto debe contener caracteres despues");
                    }
                    if (punto <= arroba + 1) {
                        System.out.println("debe haber algun caracter antes del punto");
                    }
                    if (arroba > punto) {
                        System.out.println("El @ debe estar antes del .");
                    }
                }
            }
        }
    }
}
