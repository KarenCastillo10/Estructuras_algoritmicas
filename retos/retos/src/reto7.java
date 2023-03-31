
import java.util.Scanner;


public class reto7 { 
    
    public static void main(String[] args) {
       
       int usuario1, vidajugador = 3;
       int ramdon2 = (int)(Match.ramdon() *3)+1;
       String Acomulado=0;
       String jugador;
       final double Apostando=100000;

       /*instanciamos clase*/
       Scanner lectura =new Scanner(System.in);
       /*pedimos nombre al jugador */
       System.out.println("Por favor ingrese el nombre del jugador:");
       /*imprimimos mensaje */
       System.out.print("jugador");
       /*llamamos la variable jugador y le ponemos un objeto */
       jugador=lectura.nextLine();
       /*un bucle para que el juego se repita*/
       while(vidajugador > 0){
        /*pondremos las elecciones del juego */
        System.out.println("eleccion de Juego:");
        /*ingresamos datos del juego */
        System.out.println("piedra=1, papel=2, tijera=3");
        /*llamamos la variable y la almacenamos en el objeto lectura con un tipo entero */
        usuario1=lectura.nextInt();
        /*usamos un switch como condicional para crear diferentes situaciones */
        switch (ramdon2) {
            /*imprimimos el caso en que la computadora jugando con piedra */
            case 1:
            System.out.println("piedra");
            /*creamos switch para el numero que digita el usuario */
            switch(usuario1){
            /*muestra las opciones que hay segun lo que se elija */
            case 1:
            System.out.println("Has empatado");
            break;
            case 2:
            System.out.println("Has ganado $10000");
            Acomulado = Apostando + 10000;
            break;
            case 3:
            System.out.println("has perdido $10000");
            Acomulado=Apostando-10000;
            vidajugador=vidajugador-1;

            break;
             }
             /*imprimimos el caso en que la computadora jugando con papel*/
             case 2:
             System.out.println("papel");
             /*creamos un bucle switch para el numero que digita el usuario */
             switch(usuario1){
            /*las opciones que hay segun lo que se ingreso*/
            case 1:
            System.out.println("Has perdido $10000");
            Acomulado=Apostando-10000;
            vidajugador=vidajugador-1;
            
            break;
            case 2:
            System.out.println("Has empatado");
    
            break;
            case 3:
            System.out.println("has ganado $10000");
            Acomulado=Apostando+10000;
            
            break;
            /*creamos un break para cerrar el switch*/
            break;
            /*imprimimos el caso en que la computadora jugando con tijera  */
            case 3:
            System.out.println("tijera");
            /*creamos un bucle switch para el numero que digita el usuario */
            switch(usuario1){
                /*las opciones que hay segun lo que se ingreso*/
                case 1:
                System.out.println("Has perdido $10000");
                Acomulado=Apostando-10000;
                vidajugador=vidajugador - 1;
               
                break;
                case 2:
                System.out.println("has ganado $10000");
                Acomulado=Apostando+10000;
              
        
                break;
                case 3:
                System.out.println("Has empatado");
                break;  
                }
                }
                /*se muestra un mensaje que le muestra el nombre del jugador si gano o perdio */
                /*el valor que acomulo */
                System.out.println("el nombre del jugador"+jugador+"perdio todas sus vidas y quedo con"+Acomulado);
                /*para terminar un buffer para limpiar y volver a jugar */
                lectura.close();
                 }
                 }
                 }
                  }