/*
 *EJERCICIO 7.11 - Capitulo 7
 */

import java.util.Scanner;
/**
 *
 * @author Richard Lopez
 */
public class ArreglosUni{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.        
        int[] cuentas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<cuentas.length; i++){
            System.out.println(cuentas[i]+" ");
        }
        
        
        //2.BONO
        Scanner in = new Scanner(System.in);
        int[] bono= new int [15];
        //introduce BONOS
        for (int i=0; i<bono.length; i++){
            System.out.print("Bono "+ (i+1)+ ":");
            bono[i]=in.nextInt();
        }
        
        for (int i=0; i<bono.length; i++){
            int suma=bono[i]+1;
            System.out.print("Bono "+ (i+1)+ " nuevo:");
            System.out.println(suma);     
        }
        
        //3.MEJORES PUNTUACIONES
        int[] mejoresPuntuaciones = {890, 900, 780, 830, 877};
        for (int i=0; i<mejoresPuntuaciones.length; i++){
            System.out.println(mejoresPuntuaciones[i]+"\n");
        }
    }
    
}
