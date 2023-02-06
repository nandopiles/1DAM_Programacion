package excepciones3;

//@author 6jmati
public class Corredor {

    private int energia, contAgotado;

    public Corredor(int energia) {
        this.energia = energia;
        this.contAgotado = 0;
    }
    
    public int getEnergia() {
        return this.energia;
    }

    public void recargarEnergia(int energia) {
        this.energia += energia;
    }

    public boolean correr() {
        try {
            comprobarEnergia();
            System.out.println("Al correr se gasta 10 de energia...");
            this.energia -= 10;
            return true;
        }catch(AgotadoException e) {
            contAgotado++;
            System.out.println(e.getMessage());
            if (contAgotado == 1) {
                recargarEnergia(30);
                System.out.println("Se recargan 30 unidades de Energía");
                return true;
            } else if (contAgotado == 2) {
                recargarEnergia(10);
                System.out.println("Se regarcan 10 unidades de Energía");
                return true;
            } else {
                System.out.println("Entrenamiento finalizado");
                return false;
            }
        } 
    }

    public void comprobarEnergia() throws AgotadoException {
        if (this.energia < 10) {
            throw new AgotadoException ("Energía insuficiente...");
        }
    } 
}
