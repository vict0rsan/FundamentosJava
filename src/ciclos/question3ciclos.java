
package ciclos;
import java.util.Scanner;


public class question3ciclos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int entero = input.nextInt();
        
        for(int i=1; i<=10; i++){
            int mult = entero*i;
            System.out.println(entero+"*"+i+ " = " +mult);
                    
            
        }
    }
    
}
