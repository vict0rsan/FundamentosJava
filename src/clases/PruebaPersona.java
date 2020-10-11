package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Juanes";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        
        persona2.desplegarInformacion();
        persona2.nombre = "Karla papa";
        persona2.apellido = "Roncesvalles";
        
        persona2.desplegarInformacion();

    }

}
