package estructurasControl;

import java.util.Scanner;

public class switchEjercicio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un mes del año");
        int mes = input.nextInt();
        String estacion = "Error";

        switch (mes) {
            case 1: case 2: case 12:
                estacion="Invierno";
                break;
            case 3: case 4: case 5:
                estacion ="Primavera";
                break;
            case 6: case 7: case 8:
                estacion="verano";
                break;
            case 9: case 10: case 11:
                estacion = "otoño";
                break;
            default:
                System.out.println("No existe esta estacion");
                

        }
        System.out.println("estacion = " + estacion);

    }

}
