package transporte;

//@author 6jmati
enum Madera {
    ROBLE("CASTAÑO VERDOSO", 800),
    CAOBA("MARRON OSCURO", 770),
    NOGAL("MARRON ROJIZO", 820),
    CEREZO("MARRON CEREZA", 790),
    BOJ("MARRON NEGRUZCO", 675);
    
    private String color;
    private int peso;
    private double pesoFinal, VOLUMEN = 2.27;

    private Madera(String color, int peso) {
        this.color = color;
        this.peso = peso;
        this.pesoFinal = this.VOLUMEN * this.peso;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getPeso() {
        return this.peso;
    }
    
    public double getPesoFinal() {
        return this.pesoFinal;
    }       
}
