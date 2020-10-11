package operadoresJava;


public class operadorTernario {
    public static void main(String[]args){
        
        var result = (1>2) ? "verdad": "falso";
        System.out.println("result = " + result);
        
        int numero = 9;
        result = (numero%2==0) ? "Es par" : "Es impar";
        System.out.println("result = " + result);
        
        
    }
    
}
