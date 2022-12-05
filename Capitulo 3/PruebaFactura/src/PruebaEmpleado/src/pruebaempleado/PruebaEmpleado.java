/*
 GRUPO 3: Ejemplo 3.14 (La clase Empleado)
 */
package pruebaempleado;

import java.util.Scanner;

/**
 *
 * @author Richard Lopez
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String primerNombre=null;
        String primerApellido=null;
        double salarioMensual=0.0;
        
        //Clase Factura
        Empleado empleado=new Empleado(primerNombre, primerApellido, salarioMensual);
        
        Scanner in = new Scanner(System.in);
        int op=0;
        while(op==0){
            System.out.print("Ingrese su primer nombre: ");
            primerNombre=in.next();
            System.out.print("Ingrese su segundo nombre: ");
            primerApellido=in.next();
            System.out.print("Ingrese su salario mensual: ");
            salarioMensual=in.nextDouble();
            
            //Obtener monto
            empleado.obtenerSalarioAnual(salarioMensual);
            System.out.println("Su salario ANUAL es de: "+ (empleado.salarioAnual));
            System.out.println("Aumento: "+ (empleado.salarioAnual*0.10));
            System.out.println("--------------------------------------------");
            System.out.println("Su NUEVO SALARIO ANUAL es de: "+ (empleado.salarioAnual+(empleado.salarioAnual*0.10)));
            
            System.out.println("\n¿Salir? (1-SI, 0-NO) ");
            op=in.nextInt();
        }
    }
    
}
