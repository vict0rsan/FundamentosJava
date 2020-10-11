
package clases;
import clases.Encapsulamiento;


public class EncapsulamientoTest {
    public static void main(String[]args){
        Encapsulamiento persona1= new Encapsulamiento("VICTOR",5000,false);
        persona1.getNombre();
        System.out.println("persona1 nombre = " + persona1.getNombre());
        System.out.println("persona1 = " + persona1.getSueldo());
        System.out.println("persona1: "+persona1);
        persona1.setSueldo(10239.35);
        System.out.println("persona1 = " + persona1.getSueldo());
        
        String caracteristicas1 = persona1.toString();
        System.out.println("caracteristicas1 = " + caracteristicas1);
        
    }
    
}
