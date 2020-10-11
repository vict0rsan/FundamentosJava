
package pasoPorValor;
import clases.Persona;



public class pasoPorReferencia {
    public static void main(String[]args){
        Persona persona1 = new Persona();
        persona1.nombre = "Victor";
        System.out.println("persona1.nombre = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1.nombre = " + persona1.nombre);;
        
        
    }
    public static Persona cambiaValor(Persona persona){
        persona.nombre = "David";
        return persona;
        
    }
    
}
