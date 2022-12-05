/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tirodedados;

import java.security.SecureRandom;

/**
 *
 * @author Richard Lopez
 */
public class tirarDados {
    int arr[]= new int[36000000];
    public static final SecureRandom numerosAleatorios = new SecureRandom();
    
    public void lanzar(){
        for(int i=0;i<35;i++){
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6); 
        arr[i]= dado1 + dado2;
        }
    Contar();

    }
    
    public void Contar(){     
        int cont[] = new int[13];
 
        for ( int j = 0; j < arr.length; j++ ) {  
            for ( int k = 0; k < cont.length; k++ ) {       
                if ( arr[j] == k )
                    cont[k]++;                
            }
        } 
    Imprimir(cont);

    }  

    public void Imprimir( int B[]){ 
        for (int m = 0; m < B.length; m++ ){      
            System.out.printf("\n%d lanzamientos sumaron %d\n", B[m], m ); 
        }      
    }
}
   

