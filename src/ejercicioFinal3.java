
import java.util.Scanner;


public class ejercicioFinal3 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el nombre del libro: ");
        String libro = input.nextLine();
        System.out.println("libro = " + libro);
        System.out.println("Introduzca su ID: ");
        int id = input.nextInt();
        System.out.println("id = " + id);
        System.out.println("Introduzca el precio: ");
        double precio = input.nextDouble();
        System.out.println("precio = " + precio);
        System.out.println("Desea envio gratuito? ");
        boolean envio = input.nextBoolean();
        System.out.println("envio = " + envio);
        
    }
    
}
