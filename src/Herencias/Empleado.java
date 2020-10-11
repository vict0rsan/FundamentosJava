
package Herencias;


public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contador;
    
    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contador;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

 

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", Persona:").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
