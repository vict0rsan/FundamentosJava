package clases;

public class question4metodos {

    public static void main(String[] args) {

        for (int i = 1; i < 500; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;

                }
            }
            if (prime) {
                System.out.println(" " + i + " ");
            }

        }
        boolean primo = isPrime(18);
        System.out.println("primo = " + primo);
    }

    public static boolean isPrime(int a) {
        boolean prime = true;
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                prime = false;
                break;

            }

        }
        return prime;
    }

}
