
package clases;


public class ContextoEstaticoTest {
    public static void main(String[]args){
        ContextoEstatico persona1= new ContextoEstatico("Victor");
        System.out.println("persona1 = " + persona1);
        
        ContextoEstatico persona2 = new ContextoEstatico("David");
        System.out.println("persona2 = " + persona2);
        
        Imprimir(persona1);
        persona2.setNombre("mama");
        Imprimir(persona2);
        
    }
    public static void Imprimir(ContextoEstatico persona){
        System.out.println("persona: "+persona);
    }
    
}
