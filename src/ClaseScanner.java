
import java.util.Scanner;

//CLASE ESCANER
public class ClaseScanner {
    
    public static void main(String args[]){
       
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero");  
        double numero1 = input.nextDouble();
        System.out.println("Introduzca otro numero");
       double numero2 = input.nextDouble();
        System.out.println("La suma de ambos digitos es: "+ (numero1+numero2));
    }
    
}
