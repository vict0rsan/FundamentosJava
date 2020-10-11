package pasoPorValor;

public class palabraThis {

    public static void main(String[] args) {
        Persona persona1 = new Persona(new String("Victor"),new String("Santiago"));
        System.out.println("persona1 = " + persona1);
        System.out.println("Persona nombre: "+persona1.nombre);
        System.out.println("Persona apellido: "+persona1.apellido);

    }

}
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona: "+ this);
        new Imprimir().imprimir(this);
    }
}
class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir: "+persona);
        System.out.println("operador this: "+this);
    }
}


