> Explicación: [[While_apuntes]]

## <span style="color:#ef6c00">Código</span>

```java
package EJERCICIOS;

import java.util.Scanner;

public class EjerciciosCiclowhile {
    public  static void main(String[] args){

        // EJERCICIOS DE CICLO WHILE

        // Nivel 1 — Entender la estructura
        //Ejercicio 1: Contador básico
        //
        //Objetivo: Imprimir los números del 1 al 10 usando while (mismo resultado que harías con un for, para sentir la diferencia de sintaxis).
        //Qué usar: while, una variable contador declarada antes del loop.

        int bandera = 1;
        while (bandera<=10){

            System.out.println(bandera);
            bandera+=1;
        }


        // Ejercicio 2: Cuenta regresiva con validación
        //
        //Objetivo: Igual que la cuenta regresiva que ya hiciste con for (del 10 al 1 + "¡Despegue!"), pero ahora con while.
        //Qué usar: while, incremento negativo.

        int regresiva = 10;
        while(regresiva>=1){

            System.out.println(regresiva);

            regresiva-=1;
        }
        System.out.println("Despegue");


        // Nivel 2 — Donde el while brilla: cantidad desconocida de repeticiones
        //Ejercicio 3: Suma hasta pasar un límite
        //
        //Objetivo: Sumar números empezando desde 1 (1, 2, 3, 4...) hasta que la suma acumulada supere 50, e imprimir cuántos números hiciste falta sumar y cuál fue la suma final.
        //Qué usar: while, acumulador, contador.

        int acumulador = 0;
        int contador = 1;

        while (acumulador<=50){

            acumulador+=contador;
            contador+=1;
        }

        System.out.println("cantidad de numeros hicieron falta para llegar a 50 son: " + contador
        + "\nsuma total " + acumulador);


        // Ejercicio 4: Contar cifras de un número
        //
        //Objetivo: Dado int numero = 48293;, contar cuántos dígitos tiene, sin usar .length() ni convertirlo a String — usando matemática pura (dividir por 10 repetidamente).
        //Qué usar: while, operador / (división entera).

        int numero = 48293;
        int cantidad = 0;

        while (numero>0){
            numero/=10;
            cantidad+=1;
        }
        System.out.println("la cantidad e digitos que tine 48293 son "+cantidad);

        // Ejercicio 6: Suma con valor centinela
        //
        //Objetivo: Pedile al usuario números uno por uno con Scanner y andá sumándolos, hasta que ingrese el número -1 (que actúa como señal de "terminé"). Al final, mostrá la suma total (sin contar el -1).
        //Qué usar: while, Scanner, acumulador.

        Scanner scanner = new Scanner(System.in);

        int acumulador2 = 0;
        int user1 = 0;

        while (user1!=-1){
            System.out.println("ingrese un numero");
            int user = scanner.nextInt();

            if (user == -1){
                acumulador2+=0;

            }else {
                acumulador2 += user;
            }
            user1=user;
        }
        System.out.println("suma total "+acumulador2);


        //Objetivo: Dado int[] numeros = {4, 8, 15, 16, 23, 42};, buscar si el número 15 está en el array, pero a diferencia de cómo lo harías con for (que revisa TODO el array siempre), usá while para que el loop se corte apenas lo encuentre, sin seguir revisando de más.
        //Qué usar: while, array, boolean como bandera de control.

        int[] numeros = {4,8,15,16,23,42};
        boolean encontrado = false;
        int i = 0;

        while (i<numeros.length && !encontrado){

            if (numeros[i]==15){
                encontrado=false;
            }else{
                i+=1;
            }

        }
        if (encontrado) {
            System.out.println(numeros[i] + " " + encontrado);
        }
        else {
            System.out.println("No se encontró el número");
        }

        //Tenés int numeroSecreto = 7; (fijo, no aleatorio, para simplificar).
        // Con Scanner, el usuario va ingresando intentos. El programa le dice "Muy alto", "Muy bajo" o "¡Acertaste!" en cada intento,
        // y se repite hasta que acierte. Al final, mostrá cuántos intentos le llevó.

        final int numeroSecreto = 7;
        int cantidadIntento = 0;
        int user2 = 0;
        System.out.println("adivine el numero que estoy pensadod, \npista es un numero entero");

        while (user2!=numeroSecreto){

            int numeroUser = scanner.nextInt();

            user2=numeroUser;
            cantidadIntento+=1;

            if (user2>numeroSecreto){
                System.out.println("el numero ingresado "+ user2 + " es muy alto");
            }else if (user2<numeroSecreto){
                System.out.println("el numero ingresando " + user2 + " es muy bajo");
            }
        }

        System.out.println("acertaste el numero \n" +
                "numero ingresado " + user2 + " El numero secreto era " + numeroSecreto +
                "\nte llevó " + cantidadIntento + " intentos");

    }
}
```
