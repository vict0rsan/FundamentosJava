
package clases;


public class AritmeticaTest {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        
        aritmetica1.a = 3;
        aritmetica1.b = 4;
        
      
            
        
        
        aritmetica1.sumar();
        int suma = aritmetica1.sumaRetorno();
        System.out.println("suma = " + suma);
        
        suma = aritmetica1.sumaConArgumentos(12, 3);
        System.out.println("suma = " + suma);
        
        System.out.println(aritmetica1.a);
        
        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println(aritmetica2.a);
        System.out.println(aritmetica2.b);
        
        
    }
    
}
