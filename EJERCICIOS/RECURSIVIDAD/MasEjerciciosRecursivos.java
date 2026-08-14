package EJERCICIOS.RECURSIVIDAD;

import java.awt.desktop.SystemHotkey;

public class MasEjerciciosRecursivos {

    // METODOS

    // EJERCICIO 1 {

    static int sumaArrays(int[] arrays , int indice){
        if (indice == arrays.length){
            return 0;
        }
        else {
            int resultado = sumaArrays(arrays, indice+1);
            return arrays[indice] + resultado;
        }

    }



    // EJERCICIO 2

    static int maximoArray (int[] array , int indice){
        if (indice == (array.length)){
            return array[indice];
        }else{
            if (array[indice] > maximoArray(array,indice+1)){
                return array[indice];
            }
            else {
             return maximoArray(array, indice+1);
            }
        }
    }




    //EJERCICIO 3
    static boolean esPalindromo (String palabra , int inicio , int fin){
        if (inicio>=fin){
            return true;
        } else if (palabra.charAt(inicio)!=palabra.charAt(fin)) {
            return false;
        }
        else {
            if (palabra.charAt(inicio) == palabra.charAt(fin)){
                return esPalindromo(palabra , inicio+1 , fin-1);
            }
            else {
                return false;
            }
        }
    }


    //EJERCICIO 4
    static int sumaDigitos (int n){
        if(n==0){
            return n;
        }else {
            int resultado = sumaDigitos(n/10);
            return  (n%10) + resultado;
        }
    }

    static String mostrarsumadigitos(int n){
        return "suma de digtos " + n + " es: "+ sumaDigitos(n);
    }







    //EJERCICIO 5
    static boolean estaEnArray (int[] arrays , int valor , int indice){
        if (indice == arrays.length){
            return false;
        }
        else if (arrays[indice]== valor){
            return true;
        } else if (indice == arrays.length-1){
            return false;
        } else {
            boolean resultado = estaEnArray(arrays,valor,indice+1);
            return resultado;
        }
    }



    public static void main(String[] args){


        //Ejercicio 1 — Suma de un array, pero recursiva
        //
        //Objetivo: static int sumaArray(int[] a, int indice)
        //que sume todos los elementos del array desde indice hasta el final,
        //usando recursión (nada de for). Se llama así: sumaArray(numeros, 0).

        int[] arrays = {1,9,3,1,4};
        int indice = 0;
        int resultado = sumaArrays(arrays,indice);


        System.out.println(resultado);



        //Ejercicio 2 — Máximo de un array, recursivo (cuidado con tu error típico)
        //
        //Objetivo: static int maximoArray(int[] a, int indice) que devuelva el valor más alto del array,
        //desde indice hasta el final.


        int[] arrays2 = {1,2,8,2,4};
        int indice2 = 0;
        int resultado2= maximoArray(arrays2,indice2);
        System.out.println(resultado2);






        //Ejercicio 3 — ¿Es palíndromo? (String + recursión, con dos "extremos" que caminan)
        //
        //Objetivo: static boolean esPalindromo(String s, int inicio, int fin)
        //que devuelva true si s se lee igual al derecho y al revés,
        //comparando desde los dos extremos hacia el centro. Se llama así:
        // esPalindromo("reconocer", 0, s.length()-1).


        String palabra = "ppoopp";
        int inicio = 0;
        int fin = (palabra.length()-1);
        boolean resultado3 = esPalindromo(palabra,inicio,fin);
        System.out.println(resultado3);


        //Ejercicio 4 — Separación de responsabilidades + recursión (mezclando con lo de FortalecerMetodos)
        //
        //Objetivo: igual que hiciste con calcularDescuento / mostrarCompra, separá en dos métodos:
        //
        //static int sumaDigitos(int n) — recursivo, sin imprimir nada adentro, que sume los dígitos de un número (no la cantidad, la suma). Por ejemplo, sumaDigitos(234) = 2+3+4 = 9.
        //static void mostrarSumaDigitos(int n) — que llama a sumaDigitos(n) y arma el mensaje con System.out.println.

        int numero4 = 1234;
        String resultado4 = mostrarsumadigitos(numero4);
        System.out.println(resultado4);






        //Ejercicio 5 — Buscar un valor en un array (recursivo, devuelve boolean)
        //
        //Objetivo: static boolean estaEnArray(int[] a, int valor, int indice)
        //que devuelva true si valor aparece en algún lugar del array.


        int[] array5 ={1,2,3,4};
        int indice5 = 0;
        int valor = 8;
        boolean resultado5 = estaEnArray(array5,valor,indice5);
        System.out.println(resultado5);










    }


}
