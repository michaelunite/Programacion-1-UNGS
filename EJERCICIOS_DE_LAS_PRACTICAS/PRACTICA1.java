package EJERCICIOS_DE_LAS_PRACTICAS;

import java.util.Scanner;

public class PRACTICA1 {
    public static void main(String[] args) {


        //1. Variables, expresiones y tipos {


        //Ejercicio 1
        // Escribir el programa “¡Hola, mundo!”.

        System.out.println("hola mundo");
        // Ejercicio 2
        // Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo del estilo “Hola nombre”.

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        String nombre = scanner.next();
        System.out.println("hola " + nombre);


        // Ejercicio 3
        // Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje del estilo
        // “La suma es: ” y el valor de la suma de ambos números.

        System.out.println("ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("ingrese un numero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);


        // Ejercicio 4
        // Imprimir desde Java las siguientes expresiones e interpretar el valor que arrojan:


        //Ejercicio 5
        //Escribir un programa que te pregunte por dos números, y
        //a continuación imprima un mensaje del estilo “El promedio es: ” y el valor del promedio de ambos números.

        System.out.println("ingrese un numero");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese un numero");
        int numero2 = scanner.nextInt();

        double promedio = (numero1 + numero2) / 2;
        System.out.println("el promedio es: " + promedio);


    //    }



        //2. Métodos y condicionales{

        //Ejercicio 6
        //Escribir un método static void imprimirSuma(int a, int b)
        //que al igual que el ejercicio 3 imprima la suma de los dos parámetros.
        //Modificar el programa de dicho ejercicio para que utilice este método.

        imprimirsuma(2,2);


        // Ejercicio 7
        // Análogamente al ejercicio anterior,
        // escribir un método static void imprimirPromedio(int a, int b)
        // que imprima el promedio de los dos parámetros.

        imprimirPromedio(2,2);







    }

    // 2. {
    // EJERCICIO 6
    static void imprimirsuma(int a , int b){
        System.out.println("la suma es: "+(a+b));
    }

    // EJERCICIO 7
    static void imprimirPromedio(int a,int b){
        int suma = a+b;
        System.out.println("el promedio es: "+ (suma/2));
    }
}
