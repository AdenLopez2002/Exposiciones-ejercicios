// Fig. 6.8: Simula el juego de dados “craps”.
import java.security.SecureRandom;

public class Craps
{
	//Generador de números aleatorios
	private static final SecureRandom numerosAleatorios = new SecureRandom();

    //Constantes que representan el estado del juego
    private enum Estado {CONTINUA, GANO, PERDIO};

    //Constantes que representan tiros comunes del dado
    //GANA
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    //PIERDE
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;    
    private static final int DOCE = 12;

    
    public static void main(String[] args)
    {
        int miPunto = 0; // GUARDA el punto si no gana o pierde en el primer tiro
        Estado estadoJuego; //CONTINUA, GANO o PERDIO

        int sumaDeDados = tirarDados(); // primer tiro de los dados (LLAMAMOS AL MÉTODO)

        //determina el estado del juego y el punto con base en el primer tiro
        switch (sumaDeDados)
        {   
            //GANA
            case SIETE: 
            case ONCE: 
            estadoJuego = Estado.GANO;
            break;

            //PIERDE
            case DOS_UNOS: 
            case TRES: 
            case DOCE: 
                estadoJuego = Estado.PERDIO;
                break;

            default: //ni gana ni pierde, por lo que guarda el punto
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados; // aquí guarda el punto
                System.out.printf("El punto es %d%n", miPunto);
                break;
        }

        // mientras el juego CONTINÚE
        while (estadoJuego == Estado.CONTINUA)
        {
            sumaDeDados = tirarDados(); // tiramos los dados de nuevo

            // determina el estado del juego
            if (sumaDeDados == miPunto) // GANA haciendo el punto
                estadoJuego = Estado.GANO;
            else
            if (sumaDeDados == SIETE) // PIERDE al caer 7 en vez del punto
                estadoJuego = Estado.PERDIO;
        }

        //Mensaje Final
        if (estadoJuego == Estado.GANO)
            System.out.println("El jugador gana.");
        else
            System.out.println("El jugador pierde.");
    }



    //MÉTODO
    public static int tirarDados()
    {
        //Elige valores Aleatorios del 1 al 6
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6); 

        int suma = dado1 + dado2;

        //Resultado del tiro
        System.out.printf("El jugador tiro %d + %d = %d%n", dado1, dado2, suma);

        return suma;
    }
}