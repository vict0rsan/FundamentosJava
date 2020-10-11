
public class operadoresCondicionales {

    public static void main(String[] args) {

        int a = 1;
        int valorMinimo = 0;
        int valorMaximo = 10;

        if (a >= 0 && a < 10) {
            System.out.println("Se encuentra en rango");
        } else {
            System.out.println("no se encuentra en rango");
        }
        
        boolean vacaciones = true;
        boolean descanso = false;
        
        if (vacaciones || descanso )
            System.out.println("Puede ver a su hijo");
        else
            System.out.println("No puede ver a su hijo");
        
    }

}
