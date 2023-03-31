import java.util.Scanner;

public class reto5 {

    public static void main (String[] args) {
        double codigo, importe_a_pagar, importe_de_la_compra, precio_unitario;
        double unidades_adquiridas;
        Scanner Leer  = new Scanner(System.in);

        System.out.println("Ingresa el valor de codigo");
        codigo = Leer .nextDouble();

        System.out.println("Ingresa el valor de unidades adquiridas");
        unidades_adquiridas = Leer .nextDouble();


        precio_unitario=0;
        if(codigo==101)
            precio_unitario=17.5;
        if(codigo==102)
            precio_unitario=25.0;
        if(codigo==103)
            precio_unitario=15.5;
       importe_a_pagar=precio_unitario*unidades_adquiridas;

        importe_a_pagar=importe_a_pagar;
        System.out.println("Valor de importe a pagar: " + importe_a_pagar + "\n" +
        "Valor de precio unitario: " + precio_unitario);
    }

}
