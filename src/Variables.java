//Prueba de variables

public class Variables {

    public static void main(String[] args) {
        //definimos varible
        int miVariable = 10;
        //imprimimos varible
        System.out.println(miVariable);

        //cambiamos valor a variable
        miVariable = 5;
        System.out.println(miVariable);
        System.out.println(miVariable);
        //variable tipo cadena
        String variableCadena = "Buenos días gente";
        System.out.println(variableCadena);

        String variableCadena2 = "Adios";
        System.out.println(variableCadena2);

        //Inferencia de tipos en java
        var variableDePrueba = 1;
        System.out.println(variableDePrueba);

        var cadena = "Hola caracola";
        System.out.println(cadena);
        System.out.println("cadena = " + cadena);

        byte numeroByte = (byte) 129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483649L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);

        long numeroLong = (long) 9223372036854775808D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);

        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo de Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de Float: " + Float.MAX_VALUE);

        double numeroDouble = 15.345;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de Double: " + Double.MAX_VALUE);
        
        var numeroEntero = (double)10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char variableChar = '\u0021';
        System.out.println("variableChar = " + variableChar);
        
        char varChar = 33;
        System.out.println("varChar = " + varChar);
        

    }

}
