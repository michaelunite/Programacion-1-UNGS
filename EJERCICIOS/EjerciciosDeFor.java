package EJERCICIOS;

import java.util.Arrays;

public class EjerciciosDeFor {
    public static void main (String[] args){

        // Nivel 1 — Entender el conteo
        //Ejercicio 1: Contador simple

        //Objetivo: Imprimir los números del 1 al 20, pero solo los pares.
        //Qué usar: for, % (módulo), if dentro del loop.
        //Cómo dividirlo:
        //Armá un for que recorra del 1 al 20.
        //Adentro, preguntate: ¿cómo sé si un número es par? (pista: pensá en el resto de dividir por 2)
        //Solo imprimí si cumple esa condición.

        for (int i = 1 ; i<=20 ; i++){
            if (i%2==0){
                System.out.println("es par "+ i);
            }
        }

        //Ejercicio 2
        // Cuenta regresiva

        //Objetivo: Imprimir una cuenta regresiva del 10 al 1, y al final imprimir "¡Despegue!".
        //Qué usar: for con incremento negativo (i--).
        //Cómo dividirlo:
        //Pensá: si quiero ir "para atrás", ¿cómo tiene que ser la inicialización, la condición y el incremento? (todo al revés de lo normal)
        //El mensaje final va fuera de las llaves del for, no adentro.

        for (int i=10; i>=1 ; i--){
            System.out.println(i);
        }
        System.out.println("despegue");


        //Nivel 2 — For + acumuladores
        //Ejercicio 3: Suma acumulada

        //Objetivo: Sumar todos los números del 1 al 100 usando un for, e imprimir el resultado total.
        //Qué usar: for, una variable acumuladora declarada antes del loop.
        //Cómo dividirlo:
        //Antes del for, creá una variable suma que arranque en 0.
        //Adentro del for, en cada vuelta sumale el valor actual del contador a suma.
        //Imprimí suma después de que termine el loop (fuera de las llaves).

        int suma = 0;

        for (int i =0 ; i<=100 ; i++){

            suma+=i;
        }
        System.out.println(suma);


        // Ejercicio 4: Tabla de multiplicar
        //Objetivo: Dado un número (por ejemplo int numero = 7;), imprimir su tabla de multiplicar del 1 al 10, con formato:
        //"7 x 1 = 7", "7 x 2 = 14", etc.
        //Qué usar: for, concatenación de Strings, operador *.

        for (int i = 0 ; i<=10 ; i++){

            System.out.println("7 x "+ i +" = " + (7*i));
        }

        // 🟠 Nivel 3 — For + Arrays (¡acá es donde todo conecta!)

        //Ejercicio 5: Recorrer un array con for
        //Objetivo: Tenés int[] notas = {8, 6, 9, 5, 7};. Usá un for para recorrerlo e imprimir cada elemento, uno por línea.
        //Qué usar: for, .length de un array (sin paréntesis, ojo, es distinto a .length() de String), acceso por índice notas[i].

        int[] lista = {8, 6, 9, 5, 7};

        for (int i = 0 ; i<lista.length ; i++){

            System.out.println(lista[i]);
        }

        // Ejercicio 6: Suma y promedio con for (versión mejorada del ejercicio que ya hiciste)
        //Objetivo: Recordás el ejercicio de sumar {8, 6, 9, 5, 7} a mano? Ahora hacelo con un for: sumá todos los elementos y calculá el promedio, sin importar cuántos elementos tenga el array.

        double sumaArrays = 0;
        for (int i = 0 ; i<lista.length ; i++){

            sumaArrays+=lista[i];
        }
        System.out.println(sumaArrays/lista.length);


        // Ejercicio 7: Buscar el máximo
        //Objetivo: Dado int[] numeros = {3, 7, 2, 9, 4, 1};, encontrar y mostrar el número más grande del array.
        //Qué usar: for, if, una variable que guarde "el máximo hasta ahora".

        int[] numeros = {3, 7, 2, 9, 4, 1};
        int maximo = 0;
        for (int i = 0 ; i<numeros.length ; i++){
            if (numeros[i]>=maximo){
                maximo=numeros[i];
            }
        }
        System.out.println(maximo);


        // Nivel 4 — For anidado (loop dentro de loop)

        //Ejercicio 8: El tablero 3x3, ahora sin trabajo manual
        //Objetivo: Recreá el ejercicio del tablero int[][] tablero = new int[3][3] donde cada posición vale fila + columna — pero esta vez usando dos for anidados en vez de escribir las 9 asignaciones a mano.
        //Qué usar: for dentro de otro for, arrays multidimensionales.

        int [][] tablero = new int[3][3];

        for (int i = 0 ; i<tablero.length ; i++){
            for (int l = 0 ; l<tablero[i].length ; l++){

                tablero[i][l]=i+l;
            }
        }
        System.out.println(Arrays.deepToString(tablero));


    }
}
