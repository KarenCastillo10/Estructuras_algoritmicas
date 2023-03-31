 import java.util.Random;
import java.util.Scanner;
/* creamos la clase*/
public class reto3 {

   /*Creamos metodo main publico statico no retornable tamara caracteres y los pondra como argumentos*/
    public static void main(String args[]) { 
   /*declaracion variable */
    int eleccion;
    /*intanciar clase scanner para que almacene e imprima lo que le pedimos al usuario que digite */
    Scanner lectura =new Scanner(System.in);
    /*Creamos clase ramdon con el objeto */
    Random alAzar =new Random();
   /*le mostramos al usuario un mensaje de bienvenda al juego */
    System.out.println("Bienvenido al juego cara o sello" );
   /*imprimimos un mensaje para que el usuario elija una opcion*/
   System.out.println("elija la opcion que desee: 1 Cara; 2 Sello");
   /*llamamos  una variable para que almacene lo que el usuario digito */
   eleccion =lectura.nextInt();
   /*llamaremos variable tipo entero que llama al objeto para que aparezca */
   /*numero al azar entre el 1 y el 2 */
   int s = alAzar.nextInt(1);
   /*se imprime un mensaje para mostrar que la moneda esta girando o jugando*/
   System.out.println("la moneda esta jugando");
   /*creamos una condicion si el numero al azar es 1 */
   if (s==eleccion){
      /*se imprime un mensaje que dice que gano ya que el numero cumple con la condicion*/
      System.out.println("¡¡Has Ganado!!");
      /*se crea otra condicion si el numero que se escogio al azar no cumple con el requisito */
       }else if (s > eleccion){
      System.out.println("Ha perdido, Vuelva a intentarlo");
       }else if (s < eleccion){
      System.out.println("Ha perdido, Vuelva a intentarlo");
      }
      /*Y Para finalizar se limpia el buffer llamando el objeto y el metodo close */
      lectura.close();

       }
        }
       



    

