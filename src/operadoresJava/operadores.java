package operadoresJava;

import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {

        /* int a=3, b=2;
        int resultado = a+b;
        System.out.println("resultado suma= " + resultado);
        
        resultado = a-b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a*b;
        System.out.println("resultado producto= " + resultado);
        
        resultado =a/b;
        System.out.println("resultado division = " + resultado);
        
        double resultado2;
        resultado2=3D/2;
        System.out.println("resultado2 = " + resultado2);
        
        resultado =a%b;
        System.out.println("resultado modulo = " + resultado);
        
        if(b % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
        
       
       int a = 3, b =2;
       int c= a+5-b;
        System.out.println("c = " + c);
        
        a +=1; 
        a +=3;
        System.out.println("a = " + a);
        
        a -=2;
        System.out.println("a = " + a);
        
        a *=2;
        System.out.println("a = " + a);
        
        a/=2;
        System.out.println("a = " + a);
        
        a%=2;
        System.out.println("a = " + a);

         
        
        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        int e =3; 
        System.out.println("e = " + e);
        int f=++e;
        System.out.println("f = " + f);
        
        int g = 0, h=--g;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
         */
        int a = 3;
        int b = 2;

        boolean c = (a == b);
        System.out.println("c = " + c);

        boolean d = (a != b);
        System.out.println("d = " + d);

        String cadena1 = "hola";

        String cadena2 = "hola";

        boolean f = cadena1.equals(cadena2);
        System.out.println("f = " + f);

        boolean g = 3 >= 2;
        System.out.println("g = " + g);

        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = input.nextInt();

        if (edad>=18) {
            System.out.println("Bienvenido a nuestro local de ocio");
        } else {
            System.out.println("Fuera de aqui chupapijas prepuberto");
        }

    }
}
