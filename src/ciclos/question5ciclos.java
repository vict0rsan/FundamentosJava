package ciclos;

import java.util.Scanner;

public class question5ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la base:  ");
        int numero1 = input.nextInt();
        System.out.println("Introduzca la potencia: ");
        int numero2 = input.nextInt();

        int resultado = 1;

        if (numero2 == 1) {
            resultado = numero1;
        }

        for (int i = 1; i <= numero2; i++) {
            resultado*=numero1;

        }
        System.out.println("resultado = " + resultado);

    }
}
