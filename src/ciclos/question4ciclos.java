package ciclos;

import java.util.Scanner;

public class question4ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero para averiguar su !: ");
        int numero = input.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++){
             factorial*=i;
        }
        System.out.println("factorial = " + factorial);
                               
    }
}


    


