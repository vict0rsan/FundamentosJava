package estructurasControl;

import java.util.Scanner;

public class ifElseEjercicio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un mes del año: ");
        int mes = input.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("Estamos en invierno");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Estamos en primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Estamos en verano");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Estamos en otoño");
        }
        else 
            System.out.println("Mes incorrecto");
    }

}
