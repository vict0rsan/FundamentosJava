package operadoresJava;

public class precedeenciaOperadores {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        double resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4+5)*6/3;
        System.out.println("resultado = " + resultado);

    }

}
