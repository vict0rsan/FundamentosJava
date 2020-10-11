package operadoresJava;

import java.util.Scanner;

public class elMayorDe2numeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero1 = input.nextDouble();
        System.out.println("Escribe otro numero: ");
        double numero2 = input.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El mayor de ellos es " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El mayor de ellos es: " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
            
                
    
        }
    }

}
