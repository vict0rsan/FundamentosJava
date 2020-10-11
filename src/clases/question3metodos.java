
package clases;
import java.util.Scanner;

public class question3metodos {
    public static boolean isVowel(char a){
        if( a == 'a' || a == 'e'|| a == 'i'|| a == 'o'|| a == 'u')
            return true;
        else 
            return false;
            
        
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Intruduce un caracter: ");
        char ch = input.nextLine().charAt(0);
        boolean vocal = isVowel(ch);
        if(vocal)
            System.out.println("La letra es una vocal");
        else
            System.out.println("La letra no es una vocal");
        
    }
    
}
