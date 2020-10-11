package estructurasControl;

public class ifElse {

    public static void main(String[] args) {
        
        int numero = 1;
        String numerotexto ="Numero desconocido";
        
        if(numero==1){
          numerotexto = "Numero 1";
        }
        else if (numero ==2){
            numerotexto = "Numero 2";
        }
        else if (numero==3){
            numerotexto="Numero 3";
        }
        else if (numero==4){
            numerotexto="Numero 4";
        }
        else
            numerotexto="No se encontraron resultados";
        System.out.println("numerotexto = " + numerotexto);;
    }

}
