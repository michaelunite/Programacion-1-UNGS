package EJERCICIOS.RECURSIVIDAD;

import java.util.Locale;

public class EjerciciosRecusivos {


    // EJERCICIO 1 RECURSIVO
    static int sumahasta(int n){
        System.out.println("obtengo " + n);
        if (n==0){
            return 0;
        }
        return n + sumahasta(n - 1);
    }


    // EJERCICIOS 2 RECURSIVOS
    static int cantidadDigitos(int n){
        if (n<10){
            return 1;
        }
        else {
            return (1) + cantidadDigitos(n/10);
        }
    }


    //EJERCICIO 3 RECURSIVO

    static int potencia (int base, int exponente){
        if(exponente==0){
            return 1;

        }
        else {
            int Potencia = potencia(base , exponente-1);
            return base * Potencia;
        }
    }


    // EJERCICIO 4 RECURSIVO
    static int contarVocaler(String nombre){

        int contador = 0;
        if (nombre.length()==0){
            return 0;
        }
        char vocal = nombre.charAt(0);
        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o'|| vocal == 'u'){
            return (contador+1) + contarVocaler(nombre.substring(1));
        }
        return contarVocaler(nombre.substring(1));
    }


    // EJERCICIO 5
    static int sumaEntre(int n , int m){
        if (n>=m){
            return m;
        }
        else {
            int resultado = sumaEntre(n+1,m);
            return n + resultado;
        }
    }


    // EJERCICIO 6
    static boolean esDivisible(int n , int divisor){
        if(n==0){
            return true;
        } else if (n<0) {
            return false;
            
        }else {
            return esDivisible((n-divisor),divisor);
        }

    }


    // EJERCICIO 7
    static int contarApariciones(String palabra, char caracter){

        if (palabra.length()==0){
            return 0;
        }
        else {
            palabra = palabra.toLowerCase();
            char palabra2= palabra.charAt(0);
            if (palabra2 == caracter){
                int resultado = contarApariciones(palabra.substring(1),caracter);
                return 1 + resultado;
            }else {
                return contarApariciones(palabra.substring(1),caracter);
            }
        }
    }



    // 8

    static int mcd(int a, int b){
        if (b ==0){
            return a;
        }
        else {
            return mcd(b,(a%b));
        }
    }




    // METODO PRINCIPAL
    public static void main(String[] args){


        //Ejercicio 1 — Suma desde 1 hasta n

        //Objetivo: escribir static int sumaHasta(int n) que devuelva la suma de todos los números desde 1 hasta n. Por ejemplo, sumaHasta(4) debe devolver 10 (1+2+3+4).
        //Conceptos que necesitás: operador +, recursión con enteros (ya lo viste con factorial).
        //Guía paso a paso:
        //Pensá el caso base: ¿cuál es el n más chico posible donde ya sabés la respuesta sin sumar nada más?
        //Pensá el paso recursivo: sumaHasta(n) = n + ¿el resultado de qué llamada más chica?
        //Escribilo y agregá un println como el que vimos, para ver la bajada y la subida.


        int n = 4;
        int suma = sumahasta(n);
        System.out.println(suma);



        //Ejercicio 2 — Contar cuántos dígitos tiene un número
        //
        //Objetivo: escribir static int cantidadDigitos(int n) que devuelva cuántas cifras tiene n. Por ejemplo, cantidadDigitos(2034) debe devolver 4.
        //Pista para el caso base: pensá qué pasa cuando dividís n por 10 muchas veces (con división entera) — en algún momento vas a llegar a 0.
        //Guía paso a paso:
        //¿Cuándo n ya no tiene "más cifras para contar"? Ese es tu caso base.
        //En el paso recursivo, ¿qué hacés con n para achicarlo (pista: n / 10), y qué le sumás al resultado de esa llamada?



        int numeros = 25;
        int cantidad = cantidadDigitos(numeros);
        System.out.println(cantidad);




        // Ejercicio 3
        //Potencia sin usar Math.pow
        //Objetivo: escribir static int potencia(int base, int exp) que calcule base elevado a exp. Por ejemplo, potencia(2, 4) debe devolver 16.
        //Guía paso a paso:
        //Caso base: ¿cuánto vale cualquier número elevado a la 0?
        //Paso recursivo: potencia(base, exp) = base multiplicado por ¿qué llamada más chica?

        System.out.println(potencia(2,3));





        // Ejercicio 4 — Contar las vocales de un String (un poco más desafiante)
        //
        //Objetivo: escribir static int contarVocales(String s) que cuente cuántas vocales tiene s. Por ejemplo, contarVocales("hola") debe devolver 2.
        //Este te conviene resolverlo usando la función auxiliar resto(String s)
        //que ya tenés en tu repositorio (la que devuelve el string sin el primer carácter, sin usar recursión).


        String nombre = "hola";
        System.out.println(contarVocaler(nombre));




        // Ejercicio 5 — Suma entre dos números
        //
        //Objetivo: static int sumaEntre(int n, int m) que sume todos los enteros desde n hasta m (incluyendo ambos). Asumí que m >= n. Por ejemplo, sumaEntre(2, 5) debe devolver 14 (2+3+4+5).
        //
        //Pista: de los dos parámetros, uno de ellos tiene que "caminar" acercándose al otro. Pensá: ¿le sumo 1 a n, o le resto 1 a m? Cualquiera de las dos formas funciona, elegí una.


        int num1 = 2;
        int num2 = 5;

        int sumaTotal = sumaEntre(num1,num2);

        System.out.println("resultado de la suma de n hasta m es: "+sumaTotal);


        //Ejercicio 6 — Múltiplo más cercano (dos parámetros, uno fijo)
        //
        //Objetivo: static boolean esDivisible(int n, int divisor) que diga si n es divisible por divisor, usando resta en vez de % (para practicar bien qué parámetro camina). Por ejemplo, esDivisible(12, 3) debe devolver true.
        //
        //Pista: acá divisor es el dato fijo (Rol 2), y n es el que camina, restándole divisor en cada llamada.

        int nume3= 12;
        int divisor = 3;
        boolean divisible = esDivisible(nume3,divisor);
        System.out.println(divisible);



        // Ejercicio 7 — Contar apariciones de un carácter
        //
        //Objetivo: static int contarApariciones(String s, char c) que cuente cuántas veces aparece el carácter c dentro de s. Por ejemplo, contarApariciones("banana", 'a') debe devolver 3.
        //
        //Pista: es el mismo patrón que contarVocaler, pero en vez de comparar contra 5 vocales fijas, comparás contra el parámetro c (que queda fijo en todas las llamadas)

        String palabra = "bananaa";
        char caracter = 'a';
        System.out.println(contarApariciones(palabra,caracter));




        //8

        int a= 4;
        int b = 8;
        System.out.println(mcd(a,b));



    }
}
