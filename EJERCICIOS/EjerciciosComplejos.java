package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosComplejos {

    public static void main (String[] args){

        // en este archivo haremos ejercicios que parecen complejo pero en realidad son faciles al realizarlo

        // Ejercicio 1: "Sistema de validación de contraseña"
        //Suena a: seguridad, validación compleja de un sistema real.

        //Es en realidad: un if con varias condiciones lógicas encadenadas.
        //Objetivo: Dado String password = "Clave123";, verificar que cumpla TODAS estas reglas y mostrar "Contraseña válida" o "Contraseña inválida":
        //Tiene al menos 8 caracteres.
        //El primer carácter es una letra mayúscula (pista: en Java, comparar si un char está entre 'A' y 'Z' usando >= y <= funciona, porque los caracteres se pueden comparar como si fueran números).
        //El último carácter es un número (mismo truco, pero comparando con '0' y '9').


        String password = "Dnjkbhj9";

        if (password.length()>=8){
            if (password.charAt(0)>='A' && password.charAt(0)<='Z'){
                if (password.charAt(password.length()-1)>='0' && password.charAt(password.length()-1)<='9'){

                    System.out.println("contraseña valida");

                }
                else {
                    System.out.println("contraseña invalida");
                }

            }
            else {
                System.out.println("contraseña invalida");
            }


        }
        else {
            System.out.println("contraseña invalida");
        }


        //Ejercicio 2: "Detector de triángulo válido"
        //Suena a: geometría, matemática compleja.

        //Es en realidad: 3 comparaciones con if y operadores lógicos.
        //Objetivo: Dados 3 números (double lado1, lado2, lado3), determinar si pueden formar un triángulo válido. La regla matemática (ya te la doy, no hace falta que investigues geometría) es: la suma de cualquier par de lados debe ser mayor al tercer lado. Imprimir "Es un triángulo válido" o "No es un triángulo válido".
        //Cómo dividirlo:
        //Son 3 condiciones (una por cada combinación de "dos lados vs el tercero").
        //Las 3 condiciones tienen que cumplirse a la vez — pensá qué operador lógico usás para eso.
        //Probalo con {3, 4, 5} (válido) y con {1, 2, 10} (inválido).

        double[] lados = {1,2,10};

        if ((lados[0]+lados[1])>lados[2] && (lados[2]+lados[1])>lados[0]){
            System.out.println("es un triangulo");
        }
        else {
            System.out.println("no es un triangulo");
        }


        // Ejercicio 3: "Analizador de texto"
        //Suena a: procesamiento de lenguaje, algo de "inteligencia artificial".

        //Es en realidad: un for que recorre un String carácter por carácter contando cosas con if.
        //Objetivo: Dado String texto = "Hola Mundo 123";, contar cuántas vocales (a, e, i, o, u, sin importar mayúscula/minúscula) tiene, y mostrar el resultado.
        //Cómo dividirlo:
        //
        //Un for que recorra el string usando .charAt(i) desde 0 hasta .length().
        //En cada vuelta, preguntate: ¿este carácter es una vocal? (vas a necesitar comparar contra 'a', 'e', 'i', 'o', 'u' — pensá cómo combinar esas comparaciones con ||)
        //Un acumulador (int contador) que sume 1 cada vez que encuentre una voca


        String texto = "hola mundo 123";

        texto = texto.toLowerCase();

        int contador = 0;

        for (int i = 0 ; i<texto.length() ; i++){

            if (texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u'){
                contador++;

            }

        }

        System.out.println("cantidad que aparecen una vocal en "+ texto + " son "+ contador);


        //Ejercicio 4: "Simulador de cajero automático"
        //Suena a: sistema bancario real.
        //Es en realidad: condicionales anidados + operadores relacionales.

        //Objetivo: Tenés double saldoCuenta = 5000; y un double montoRetiro que el "usuario" pide retirar (probá con distintos valores, por ejemplo 1200). Las reglas:
        //Si el monto es mayor al saldo disponible → "Fondos insuficientes".
        //Si el monto es negativo o cero → "Monto inválido".
        //Si el monto no es múltiplo de 100 → "El monto debe ser múltiplo de 100".
        //Si pasa todas las validaciones → "Retiro exitoso de: $" + montoRetiro y mostrá el nuevo saldo restante.

        Scanner scanner = new Scanner(System.in);
        double saldoCuenta = 5000;
        System.out.println("saldo en cuenta "+ saldoCuenta +
                          "\ningrese el monto a retirar");

        double montoRetiro = scanner.nextDouble();

        if (montoRetiro>0){
            if (montoRetiro%100 == 0){
                if (montoRetiro>=100 && montoRetiro<= saldoCuenta ){

                    System.out.println("retiro exitoso de "+ montoRetiro);
                    saldoCuenta-=montoRetiro;
                    System.out.println("saldo en cuenta "+ saldoCuenta);


                }
                else {
                    System.out.println("fondos insuficientes");
                }
            }
            else {
                System.out.println("el monto debe ser multiplo de 100");
            }

        }
        else {

            System.out.println("monto invalido");
        }
        scanner.close();

        // Ejercicio 5: "Matriz de temperaturas semanales"
        //Suena a: análisis de datos climáticos.

        //Es en realidad: un array 2D + for anidado + un acumulador, todo lo que ya hiciste en el ejercicio del tablero.
        //Objetivo: Tenés una matriz double[][] temperaturas = new double[4][7]; que representa 4 semanas x 7 días. Llenala con datos de ejemplo (los que quieras, o generalos con una fórmula tipo semana + dia), y después:
        //Calculá y mostrá el promedio general de todas las temperaturas.
        //Encontrá y mostrá la temperatura más alta registrada.


        int [][] temperatura = new int[4][7];
        double max = 0;
        double suma = 0;

        for (int i = 0 ; i<temperatura.length ; i++){
            for (int k = 0 ; k < temperatura[i].length; k++){


                temperatura[i][k]= k;
                suma+=temperatura[i][k];

                System.out.println(temperatura[i][k]);


                if (temperatura[i][k]>max){
                    max=temperatura[i][k];
                }

            }

        }
        System.out.println(Arrays.deepToString(temperatura));
        System.out.println(max);
        System.out.println("promedio " + suma/(temperatura.length * temperatura[0].length));


        // Ejercicio integrador: "Sistema de inventario de tienda"

        //Suena a: un sistema completo de gestión.
        //Es en realidad: todo lo que ya sabés, combinado en capas.
        //Objetivo:
        //Creá un array String[] productos = {"Camisa", "Pantalón", "Zapatos"}; y un array paralelo double[] precios = {1500, 3000, 4500}; (la posición i de un array corresponde al mismo producto que la posición i del otro).
        //Con un for, recorré ambos arrays a la vez e imprimí una lista tipo:
        //"1. Camisa - $1500", "2. Pantalón - $3000", etc.
        //Calculá el precio total del inventario (suma de todos los precios).
        //Si el precio total supera los $8000, mostrá "Inventario de alto valor", sino "Inventario estándar".
        //Buscá y mostrá cuál es el producto más caro (usando el mismo patrón del ejercicio del máximo, pero ahora tenés que guardar tanto el precio máximo como el nombre del producto en esa posición).

        String[] productos = {"camisa","pantalon","zapatos"};
        double[] precios = {1500, 3000, 4500};
        double costoInventario = 0;
        double productoCaro = precios[0];
        int posicion = 0;

        for (int i = 0 ; i<productos.length ; i++){

            if (precios[i]>productoCaro){
                productoCaro = precios[i];
                posicion = i;
            }
            costoInventario+= precios[i];
            System.out.println((i+1) + " " + productos[i] + " - " + precios[i]);


        }
        if(costoInventario>8000){
            System.out.println("inventario de alto valor");
        }
        else {
            System.out.println("invetario estandar");
        }

        System.out.println("el producto mas caro es "+ productos[posicion] + " - "+ precios[posicion]);




    }
}
