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


        // EJERCICIO 8

        //Escribir un método static void ponerNota(double x, double y) que toma dos números
        // decimales y los promedia. En caso que el promedio sea mayor o igual a 7,
        // deberá imprimir “Promocionado”, si es mayor o igual a 4 pero menor que 7,
        // imprime “Aprobado” y si es menor que 4 imprime “Debe recuperar”.
        // Probarla llamándola desde el main con distintos números.
        // Luego, pedirle ambos números al usuario (usando nextFloat() del Scanner) para pasárselos a ponerNota.

        ponerNotas(7,8);
        ponerNotas(4,6);


//        Scanner scaner = new Scanner(System.in);
//        double nota1 = scaner.nextFloat();
//        double nota2 = scaner.nextFloat();
//        ponerNotas(nota1,nota2);


        // EJERCICIO 9

        //Escribir un método static void imprimirFecha(int dia, int mes, int anio)
        //que imprime la fecha pasada como parámetro en formato del estilo “5 de Julio de 2030”.

        int dia = 5;
        int mes = 1;
        int año = 2030;

        imprimirFecha(dia,mes,año);


        //EJERCICIO 10

        //Escribir un método static int sumatoria(int n) que devuelve la sumatoria de los números desde 1 hasta n.
        int n = 3;
        System.out.println(sumatoria(n));

        //Ejercicio 11

        // Escribir un método static int sumatoriaPares(int n) que devuelve la sumatoria de los números pares desde 2 hasta n.
        int nn = 4;
        System.out.println(sumatoriaPares(n));



        //Ejercicio 12
        //
        // Escribir un método static double potencia(double x, int a) que toma un número racional x y un entero a y calcula xa.
        double base = 2;
        int exponente = 2;
        System.out.println(potencia(base,exponente));


        //EJERCICIO 13

        //Escribir un método static double factorial(int n) que toma un entero positivo n y calcula n!
        // (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n.
        // Por ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definición, el factorial de 0 es 1 (0! = 1).

        int numero = 5;

        System.out.println("13 "+factorial(numero));



        //EJERCICIO 14
        System.out.println("14 " + cantCifras( 12));


        // EJERCICIO 15

        //Escribir un método static boolean esDivisible(int n, int m)
        // que devuelve true si n es divisible por m y false en caso contrario.
        // Probarlo adecuadamente llamándolo desde el main.

        int numm1 = 4;
        int numm2 = 2;

        System.out.println(esDivisible(numm1,numm2));


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



    // EJERCICIO 8
    static void ponerNotas(double nota1 , double nota2){
        double promedio = (nota1 + nota2)/2;
        if (promedio>=7){
            System.out.println("Promocionado");
        }
        else if (promedio >=4 && promedio<7){
            System.out.println("Aprobado");
        }
        else if (promedio<4){
            System.out.println("Debe recuperar");
        }
    }



    //EJERCICIO 9
    static void imprimirFecha(int dia, int mes, int año){

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        for (int i = 0 ; i<meses.length ; i++){
            if(i==(mes-1)){
                System.out.println(dia + " de "+ meses[i] + " de "+ año);
            }
        }
    }

    // EJERCICIO 10
    static int sumatoria(int n){
        int suma=0;
        for (int i = 0 ; i<=n ; i++){
            suma+=i;
        }
        return suma;
    }

    // EJERCICIO 11
    static int sumatoriaPares(int n){
        int suma=0;
        for (int i = 0 ; i<=n ; i++){
            if (i%2==0) {
                suma += i;
            }
        }
        return suma;
    }


    //EJERCiCIO 12

    static double potencia(double x, int a){
        return Math.pow(x,a);
    }



    // EJERCICIO 13
    static double factorial(int n){
        double resultado = 1;
        for (int i = n ; i>=0 ; i--){
            if (i==0){
                return resultado*=1;
            }
            else {
              resultado *=i;
            }
        }
        return resultado;
    }


    // EJERCICIO 14
    static int cantCifras(int n){
        int cantidad=0;
        int numero = n;
        if (numero ==0){
            return 1;
        }
        else {
            while (numero>0){
                cantidad++;
                numero/=10;
            }
        }
        return cantidad;
    }


    //EJERCICIO 15
    static boolean esDivisible(int n, int m){
        if (n%m ==0){
            return true;
        }
        else {
            return false;
        }
    }


}
