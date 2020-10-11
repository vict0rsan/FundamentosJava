package operadoresJava;
import java.util.Scanner;

public class ejercicioRectangulo {
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la base del rectangulo: ");
        double base = input.nextDouble();
        System.out.println("Introduzca la altura del rectangulo: ");
        double altura = input.nextDouble();
        
        double area = base*altura;
        System.out.println("area = " + area);
        
        double perimetro = 2*base+2*altura;
        System.out.println("perimetro = " + perimetro);
    }
    
}
