package clases;

public class ContextoEstatico {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public ContextoEstatico(String nombre) {
        this.nombre = nombre;
        ContextoEstatico.contadorPersonas++;
        this.idPersona = ContextoEstatico.contadorPersonas;
    }

    ContextoEstatico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    public String toString() {
        return "ID: " + this.idPersona + ",nombre: " + this.nombre;
    }

}
