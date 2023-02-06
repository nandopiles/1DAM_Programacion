
 //@author 6jmati
 
enum TipoEmpleado {
    VENDEDOR(1000),
    ENCARGADO(1500);
    
    private int salarioBase;
    
    private TipoEmpleado(int salarioBase) {
        this.salarioBase = salarioBase;
    }
};

public class EmpleadoBR {
    
    public float calcularSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) throws BRException {
        float salarioBase = 0, hExtra = 0;
        
        if (ventasMes >= 1000) {
            if (tipo == null || ventasMes < 0 || horasExtra < 0) {
                throw new BRException("Excepción de tipo BRException");
            }
            salarioBase += 100;
            hExtra = 20 * horasExtra;
            salarioBase += hExtra;
        } else if (ventasMes >= 1500) {
            if (tipo == null || ventasMes < 0 || horasExtra < 0) {
                throw new BRException("Datos incorrectos...");
            }
            salarioBase += 200;
            hExtra = 20 * horasExtra;
            salarioBase += hExtra;
        }
        return salarioBase;
    }
    
    public float calcularSalarioNeto(float salarioBruto) throws BRException{
        float salarioNeto = 0, retencion;
        
        if (salarioBruto < 0) {
            throw new BRException ("Salario negativo...");
        } else if(salarioBruto >= 1500) {
            retencion = (18 * salarioBruto)/100;
            salarioNeto = salarioBruto * (1-retencion);
            return salarioNeto;
        } else if(salarioBruto >= 1000) {
            retencion = (16 * salarioBruto)/100;
            salarioNeto = salarioBruto * (1-retencion);
            return salarioNeto;
        }
        salarioNeto = salarioBruto;
        return salarioNeto;
    }
}
