import java.util.Random;

import java.util.Scanner;

public class reto6 {

    public static void main(String[] args) {
        boolean seguirJugando = true;
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        double cantidadApostada;
        int opcionSeleccionada;

        do {
            System.out.println("Digite la cantidad de dinero a apostar: ");
            cantidadApostada = leer.nextDouble();

            System.out.println("Elija sello o cara: [1] Sello, [2] Cara");
            opcionSeleccionada = leer.nextInt();

            switch(opcionSeleccionada) {
                case 1:
                    int resultadoSello = random.nextInt(2);
                    if (resultadoSello == 0) {
                        System.out.println("Felicidades, salió sello. Ganó " + cantidadApostada + " dólares.");
                    } else if (resultadoSello == 1) {
                        System.out.println("Lo siento, salió cara. Perdió " + cantidadApostada + " dólares.");
                    }
                    break;
                case 2:
                    int resultadoCara = random.nextInt(2);
                    if (resultadoCara == 0) {
                        System.out.println("Lo siento, salió sello. Perdió " + cantidadApostada + " dólares.");
                    } else if (resultadoCara == 1) {
                        System.out.println("Felicidades, salió cara. Ganó " + cantidadApostada + " dólares.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println("¿Desea seguir jugando? [si] [no]");
            String opcionSeguirJugando = leer.next();
            if (opcionSeguirJugando.equalsIgnoreCase("no")) {
                seguirJugando = false;
            }
        } while (seguirJugando);
    }
}