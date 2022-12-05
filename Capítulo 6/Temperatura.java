import java.util.Scanner;

//CAP 6: Ejercicio 6.22 TEMPERATURA

public class Temperatura{      

	public static void main( String args[]){  
		double grados;
		Scanner in = new Scanner(System.in);

		//METODO
		Centigrados A = new Centigrados ();
		Farenheit B = new Farenheit ();

		System.out.println("Eliga una de las opciones: ");
		System.out.println("1- Convertir Celsius a Farenheit: ");
		System.out.println("2- Convertir Farenheit a Celsius: ");
		op = in.nextInt();

		if(op==1){
			Centigrados.Conversiones(grados);
		}else if(op==2){
			Farenheit.Conversiones(grados);
		}

		System.out.println("Ingrese los grados a convertir: ");
		grados = in.nextInt();			
  
	}      
}

public class Conversiones {     
 
	public void Centigrados (double grados){  
		grados+=(grados+32)*(9.0/5.0)		
	} 
	
	public void Farenheit (double grados){  
		grados+=(grados-32)*(5.0/9.0)		
	}        
}  