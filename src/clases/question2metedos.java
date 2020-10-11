package clases;
import java.util.Scanner;

public class question2metedos {

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = input.nextInt();
        boolean numeroPar = isEven(numero);
        System.out.println("numeroPar = " + numeroPar);

    }

}
