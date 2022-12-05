//EJEMPLO 1.19- Falla del constructor
/*

*/

public class UnaClase{
	public static void main(String[] args) {
		try{
            		for(int i=3; i>=0;i--){
                		double res=10/i;
                		System.out.println(res);
            		}
		}catch(ArithmeticException excepcion){
            		System.out.println("Ha ocurrido un error aritmético de tipo: "+ excepcion.getMessage()); 
       	
       		}catch(Exception excepcion){
            		System.out.println("Ha ocurrido un error de tipo: "+excepcion.getMessage());
        	}finally{
			System.out.println("Esto se ejecuta siempre.");
		}
		}
    	}
}