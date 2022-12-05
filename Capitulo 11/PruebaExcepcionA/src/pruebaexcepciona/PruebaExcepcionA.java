/*
//Ejemplo 11.16 SUPERCLASES EXCEPCIONES
 */
package pruebaexcepciona;

/**
 *
 * @author Richard Lopez
 */
public class PruebaExcepcionA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public void ExcepcionA(){
    // TODO code application logic here{
        try{
            for(int i=3; i>=0;i--){
                double res=10/i;
                System.out.println(res);
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error de tipo: "+e.getMessage());
        }
    }    
        public void ExcepcionB(){
            ExcepcionA();
        }
            public void ExcepcionC(){
                ExcepcionB();
            }
        }

