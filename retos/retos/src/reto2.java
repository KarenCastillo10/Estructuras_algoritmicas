import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner vacuna = new Scanner(System.in);

        double dosisVacuna;
        double pesoBebe;
        double mesesBebe;
        int uno = 10;
        int dos = 8;

        System.out.print("Ingrese peso del bebe: ");
        pesoBebe = Double.parseDouble(vacuna.nextLine());

        System.out.print("Ingrese meses del bebe: ");
        mesesBebe = Double.parseDouble(vacuna.nextLine());

        dosisVacuna = (pesoBebe / (mesesBebe * uno)) * dos;

        System.out.print("La dosis de vacuna es: " + dosisVacuna);
    }
}