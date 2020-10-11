package ciclos;
import java.util.Scanner;

public class question6ciclos{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca numero para ver si es palindromo: ");
        String numero = input.nextLine();
        int l = numero.length();
        boolean palindromo =true;
        
        for(int i=0;i<(l/2);i++){
             
            if(numero.charAt(i)!= numero.charAt(l-1-i))
                 palindromo = false;
            
                
        }System.out.println("El numero es un palindromo = " + palindromo);
            
            
    }
}