> Explicación: [[While_apuntes]]

## <span style="color:#ef6c00">Código</span>

```java
package EJERCICIOS;

import java.util.Scanner;

public class Fortalecerwhile {

    public static void main(String[] args) {

        //Nivel 1 — Variaciones del patrón básico
        //Ejercicio 1: Números pares hasta un límite dinámico
        //
        //Objetivo: Dado int limite = 30;, imprimir todos los números pares desde 2 hasta ese límite (inclusive), usando while.
        //Qué usar: while, %, incremento de a 2 (no de a 1).


        int limite = 30;
        int incremento = 2;

        while (limite >= 2) {

            if (limite % 2 == 0) {
                System.out.println(limite);
            }
            limite--;

        }


        //Ejercicio 2: Tabla de multiplicar hasta que el resultado supere un límite
        //
        //Objetivo: Dado int numero = 6;, imprimir su tabla de multiplicar (6 x 1 = 6, 6 x 2 = 12, etc.) pero detenerse apenas el resultado supere 50, sin importar en qué multiplicador quedó.
        //Qué usar: while, acumulador de multiplicador.

        int acumulador = 0;
        int resultado = 0;

        while (resultado<=50){

            acumulador+=1;
            resultado=6 * acumulador;

            System.out.println(resultado + " "+ acumulador);
        }

        //Nivel 2 — While + Strings
        //Ejercicio 3: Contador de espacios
        //
        //Objetivo: Dado String frase = "el sol brilla fuerte hoy";, contar cuántos espacios tiene, usando while para recorrer carácter por carácter (sin usar for).
        //Qué usar: while, .charAt(), .length().

        String frase = "el sol brilla fuerte hoy ";
        int indice = 0;
        int espacioBlanco = 0;

        while (indice<frase.length()){

            if( frase.charAt(indice) == ' '){

                espacioBlanco+=1;
            }
            indice+=1;
        }

        System.out.println(espacioBlanco);


        // Nivel 3 — While con múltiples condiciones de corte
        //Ejercicio 5: Validador de PIN con intentos limitados
        //
        //Objetivo: Usando Scanner, el usuario tiene que adivinar un PIN fijo int pinCorrecto = 4321;, pero con un límite de 3 intentos. Si acierta antes, mostrar "Acceso concedido". Si se queda sin intentos sin acertar, mostrar "Cuenta bloqueada".
        //Qué usar: while con dos condiciones de corte combinadas (acertar, o agotar los intentos).


        // este si que me costo, yo usaba || en el loop y no &&, aun no llego a entender muy bien como funciona
        int pinCorrecto = 4321;
        int intentosDisponibles = 3;
        int datoIngresado = 0;
        Scanner scanner = new Scanner(System.in);
        while (datoIngresado!=pinCorrecto && intentosDisponibles!=0){

            System.out.println("ingrese el pin");
            System.out.println("intestos "+ intentosDisponibles);
            int datoUser = scanner.nextInt();

            datoIngresado=datoUser;
            intentosDisponibles-=1;

        }

        if (datoIngresado == pinCorrecto){
            System.out.println("acceso concedido");
        }
        else if(intentosDisponibles==0){
            System.out.println("Cuenta bloquead");
        }


        // Ejercicio integrador: "Cajero automático con reintentos" (combina todo)
        //
        //Suena a: un sistema bancario con seguridad real.
        //Es en realidad: while + condicionales + operadores lógicos, todo lo que ya hiciste, combinado.
        //
        //Objetivo:
        //Tenés int pinCorrecto = 1234; y double saldoCuenta = 5000;.
        //El usuario tiene 3 intentos para ingresar el PIN correcto.
        //Si falla los 3 intentos, mostrar "Cuenta bloqueada" y terminar el programa ahí (sin pedir ningún retiro).
        //Si acierta el PIN, pedirle un monto a retirar. Si el monto es mayor al saldo, mostrar "Fondos insuficientes" y volver a pedir el monto repetidamente, hasta que ingrese uno válido.
        //Al final, mostrar el saldo actualizado.

        int pin = 1234;
        int saldoCuenta = 5000;
        int user2=0;
        int intentos = 3;
        int monto = 0;


        while (user2!=pin && intentos!=0){
            System.out.println("ingrese el pin");
            int user = scanner.nextInt();

            user2=user;
            intentos-=1;
        }

        if (user2 == pin){

            System.out.println("acceso permitido");
            while (monto< saldoCuenta && monto>saldoCuenta){
                System.out.println("ingrese el monto a retirar");
                int userMonto = scanner.nextInt();

                monto=userMonto;
                if (monto>saldoCuenta){
                    System.out.println("el monto ingresado " + monto + " es superior al saldo actual" + saldoCuenta);
                }
            }
        } else{

            System.out.println("cuenta bloqueado");
            
        }


    }
}
```
