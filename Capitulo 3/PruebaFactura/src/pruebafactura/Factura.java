/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebafactura;

/**
 *
 * @author Richard Lopez
 */
public class Factura {
    String numeroPieza;
    String descripcion;
    int cantidad;
    double precio;
    double montoFactura;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.cantidad=cantidad;
        this.descripcion=descripcion;
        this.numeroPieza=numeroPieza;
        
        if (precio>0.0){
            this.precio=precio;            
        }
    }
    
    //Proporcione un método establecer y un método obtener para cada variable de instancia
    public void establecerNumeroPieza(String numeroPieza){
        this.numeroPieza=numeroPieza;        
    }    
    public String obtenerNumeroPieza(){
        return numeroPieza;
    }
        
    public void establecerDescrpcion(String descripcion){
        this.descripcion=descripcion;        
    }    
    public String obtenerDescripcion(){
        return descripcion;
    }
    
    public void establecerCantidad(int cantidad){
        this.cantidad=cantidad;        
    }    
    public int obtenerCantidad(){
        return cantidad;
    }
    
    public void establecerPrecio(double precio){
        this.precio=precio;        
    }    
    public double obtenerPrecio(){
        return precio;
    }
    
    
    //METODO MONTO FACTURA
    public double obtenerMontoFactura (int cantidad, double precio){
        this.montoFactura += (cantidad*precio);
        return this.montoFactura;
    }

}
