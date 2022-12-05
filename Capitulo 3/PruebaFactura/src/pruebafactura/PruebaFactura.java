/*
 GRUPO 3: Ejemplo 3.12 (La clase Factura)
 */
package pruebafactura;

import java.util.Scanner;

/**
 *
 * @author Richard Lopez
 */


public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numeroPieza=null;
        String descripcion=null;
        int cantidad=0;
        double precio=0.0;
        
        //Clase Factura
        Factura fact=new Factura(numeroPieza, descripcion, cantidad, precio);
        
        Scanner in = new Scanner(System.in);
        int op=0;
        while(op==0){
            System.out.print("Ingrese el número de pieza: ");
            numeroPieza=in.next();
            System.out.print("Ingrese la descripción de la pieza: ");
            descripcion=in.next();
            System.out.print("Ingrese la cantidad de piezas: ");
            cantidad=in.nextInt();
            System.out.print("Ingrese el precio de la pieza: ");
            precio=in.nextDouble();
            
            //Obtener monto
            fact.obtenerMontoFactura(cantidad, precio);            
            System.out.print("El precio total a pagar es de: "+ fact.montoFactura);
            
            System.out.println("\n¿Salir? (1-SI, 0-NO) ");
            op=in.nextInt();
        }
        
        
    }
    
   
}

