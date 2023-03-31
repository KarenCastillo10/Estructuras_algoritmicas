

import java.util.Scanner;

public class reto8 {

    public static void main(String[] args) {

        
        int i = 0;
        int contador = 0;
        int maquina = 0;
        int intento = 0;

        
        Scanner lectura = new Scanner(System.in);

        
        maquina = (int) (Math.random()*100)+1;
        
        
        for (i = 0; i < 100; i++){

            
            contador = contador +1;

            
            System.out.println("Ingrese un Numero");
            intento = lectura.nextInt();

            
            if(maquina==intento){
                System.out.println("Felicidades usted gano");
                System.out.println("Intentos: "+contador);
                
                break;

            
            }else if(maquina > intento){
                System.out.println("el numero es mas mayor que "+intento);
            }else if(maquina < intento){
                System.out.println("el numero es mas menor que "+intento);
            }
        }
                
                System.out.println("perdiste todas sus vidas");
                lectura.close();


    }
    
}

