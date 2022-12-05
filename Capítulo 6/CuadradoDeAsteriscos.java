import java.util.Scanner;

//CAP 6: Ejercicio 6.18 

public class CuadradoDeAteriscos{      

	public static void main( String args[]){  
		System.out.print("\nEste programa recibe un entero e imprime ");
		System.out.println("un cuadrado de asteriscos con ese numero de lado.");

		int lado;
		Scanner entrada = new Scanner(System.in);
		//METODO
		cuadradoDeAsteriscos miObjeto = new cuadradoDeAsteriscos();

		System.out.println("\nPor favor introduzca un entero: ");
		lado = entrada.nextInt();

		miObjeto.Cuadrado(lado);
  
	}      
}

public class cuadradoDeAsteriscos {       
 
	public void Cuadrado(int n){  
		for ( int i = 1; i <= n; i++ ){   
			for ( int j = 1; j <= n; j++ )
				System.out.print("*");
 			System.out.println();
		}
	}        
}  