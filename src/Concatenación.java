
public class Concatenación {

    public static void main(String args[]) {
        var cadena = "usuario";
        var numero = "21";

        var union = cadena + " " + numero;
        System.out.println("union = " + union);

        int i = 3;
        int j = 4;

        var unionNumeros = i + j;
        System.out.println("unionNumeros = " + unionNumeros);

        System.out.println(union + i + j);
        
        
        //caracteres especiales
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso\b"+ nombre);
        System.out.println("Comilla simple: \'" + nombre+"'");
        System.out.println("Comilla doble: \" " + nombre + "\"");
    }

}
