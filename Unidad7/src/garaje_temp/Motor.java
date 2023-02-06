package garaje_temp;

//@author Nando


public class Motor {
    private int litrosAceite, caballos;
    
    public Motor(int caballos) {
        this.caballos = caballos;
        this.litrosAceite = 0;
    }
    
    public int getCaballos() {
        return this.caballos;
    }
    
    public int getLitrosAceite(){
        return this.litrosAceite;
    }
    
    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
}
