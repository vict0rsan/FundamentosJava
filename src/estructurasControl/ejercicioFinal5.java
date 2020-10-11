package estructurasControl;

import java.util.Scanner;

public class ejercicioFinal5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca su calificacion en el examen: ");
        double nota = input.nextDouble();
        String notaFinal;
        
        if (nota <= 10 && nota >= 9) {
            notaFinal = "A";
        } else if (nota < 9 && nota >= 8) {
            notaFinal = "B";
        } else if (nota < 8 && nota >= 7) {
            notaFinal = "C";
            
        } else if (nota < 7 && nota >= 6) {
            notaFinal = "D";
        } else if (nota < 6 && nota >= 0) {
            notaFinal = "F";
        } else {
            notaFinal = "Introduce una nota correcta";
        }
        System.out.println("notaFinal = " + notaFinal);
        
    }
    
}
