package EJERCICIOS.variables_condicionales;

import java.util.Scanner;

public class condicionales {
    public static void main (String[] args){

        // Ejercicio 2: Acceso a la Montaña Rusa (Operadores Lógicos && y ||)

        //Contexto:
        //En un parque de atracciones se debe controlar quién puede subir a la montaña rusa extrema y cuánto debe pagar según su edad y estatura.
        //Reglas de negocio:
        //Constantes:
        //Estatura mínima: 140 (en cm).
        //Edad mínima: 12 (años).
        //si menor de edad acompañado por un mayor.
        //Precio de entrada estándar: 1500.0 (double).
        // es VIP?


        final int EstaturaMinima = 140;
        int edadMinima= 12;
        int Entrada = 1500;

        Scanner scanner = new Scanner (System.in);

        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println("ingrese la altura");
        int altura = scanner.nextInt();

        if (edad>=edadMinima && altura>=EstaturaMinima){
            System.out.println("Es vip");
            String vip = scanner.next();
            if (vip.equals("si")){
                System.out.println("puede pasar");
            }
            else {
                System.out.println("precio a pagar " + Entrada);
            }

        }else {
            System.out.println("no puede pasar");
        }


    }
}

