package clases;

public class Aritmetica {

    int a;
    int b;

    public Aritmetica() {
        System.out.println("Ejecutando constructor...");
        a = 1;
        b = 1;

    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumar() {
        System.out.println(a + b);
    }

    public int sumaRetorno() {
        int suma = a + b;
        return suma;
    }

    public int sumaConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return a + b;
    }

}
