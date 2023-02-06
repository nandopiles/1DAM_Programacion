 //@author 6jmati
 

public class Calculadora {
    private int num1, num2;
    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int suma() {
        int result = num1 + num2;
        
        return result;
    }
    
    public int resta() {
        int result = num1 - num2;
        
        return result;
    }
    
    public int multiplica() {
        int result = num1 * num2;
        
        return result;
    }
    
    public int divide() {
        int result = num1 / num2;
        
        return result;
    }
}
