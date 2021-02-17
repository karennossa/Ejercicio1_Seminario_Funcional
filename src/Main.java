import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String numeroTarjeta;
        String x1=null, x2 =null;
        System.out.println("Ingrese numero de tarjeta, favor no ingresar letras ni caracteres especiales.");
        numeroTarjeta = teclado.nextLine();

        String x3 = numeroTarjeta.substring(4,8);
        String x4 = numeroTarjeta.substring(8,12);

        String a = x3.replace(x3, " XXXX ");
        String b = x4.replace(x4, "XXXX ");

        while (numeroTarjeta.length() != 16 || numeroTarjeta == "^[A-Z, a-z ]"){
            System.out.println("Ingrese numero de tarjeta");
            numeroTarjeta = teclado.nextLine();

            x1 = numeroTarjeta.substring(0,4);
            x2 = numeroTarjeta.substring(12,16);



        }

        System.out.println(x1+a+b+x2);



    }

}
