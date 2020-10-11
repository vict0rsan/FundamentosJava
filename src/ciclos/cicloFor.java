package ciclos;

public class cicloFor {

    public static void main(String[] args) {

        for (int contador = 0; contador < 5; contador++) {
            if (contador % 2 != 0) {
                continue;
            }

            System.out.println("contador = " + contador);

        }

    }
}
