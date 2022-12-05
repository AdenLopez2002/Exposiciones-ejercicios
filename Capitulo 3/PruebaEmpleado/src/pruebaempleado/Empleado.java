
package pruebaempleado;

/**
 *
 * @author Richard Lopez
 */
public class Empleado {
    String primerNombre;
    String primerApellido;
    double salarioMensual;
    double salarioAnual;

    public Empleado(String primerNombre, String primerApellido, double salarioMensual) {
        this.primerApellido=primerApellido;
        this.primerNombre=primerNombre;
        
        if (salarioMensual<0.0){
            this.salarioMensual=0;            
        }else if (salarioMensual>0.0){
            this.salarioMensual=salarioMensual;
        }
    }
    
    //Proporcione un método establecer y un método obtener para cada variable de instancia
    public void establecerprimerNombre(String primerNombre){
        this.primerNombre=primerNombre;        
    }    
    public String obtenerprimerNombre(){
        return primerNombre;
    }
        
    public void establecerprimerApellido(String primerApellido){
        this.primerApellido=primerApellido;        
    }    
    public String obtenerPrimerApellido(){
        return primerApellido;
    }
        
    public void establecerSalario(double salarioMensual){
        this.salarioMensual=salarioMensual;        
    }    
    public double obtenerSalario(){
        return salarioMensual;
    }
    
    
    //METODO MONTO FACTURA
    public double obtenerSalarioAnual (double salarioMensual){
        this.salarioAnual += (salarioMensual*12);
        return this.salarioAnual;
    }
    
}
