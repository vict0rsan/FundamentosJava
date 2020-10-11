
package estructurasControl;


public class switchEstructura {
    public static void main(String[]args){
        int numero =5;
        String numeroTexto ="Valor desconocido";
        
        switch(numero){
            case 1: 
                numeroTexto = "Numero 1";
                break;
            case 2:
                numeroTexto ="Numero 2";
                break;
            case 3:
                numeroTexto="Numero3";
                break;
            case 4:
                numeroTexto="Numero 4";
                break;
            default:
                numeroTexto="Numero no valido";
                        
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
