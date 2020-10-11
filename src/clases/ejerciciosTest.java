
package clases;


public class ejerciciosTest {
    public static void main(String[]args){
        Pet mascota1 = new Pet("richard", "gato", 6);
        System.out.println(mascota1.name);
        System.out.println("mascota1 = " + mascota1);
        mascota1.setAge(19);
        System.out.println(mascota1.age);
        
        Caja caja1 = new Caja(3,3,3);
        
        int volumen = caja1.volumen();
        System.out.println("el volumen de la caja es: "+volumen);
        
        Caja caja2 = new Caja();
        System.out.println(caja2.alto);
    }
    
    
}
