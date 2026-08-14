package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;
public class FundamentosVariablesTiposCasting {
    public static void main(String[] args){

        // Fundamentos (variables, tipos, casting)
        //Ejercicio 1: Calculadora de datos personales

        //Objetivo: Crear un programa que guarde tu nombre (String), tu edad (int) y tu altura en metros (double), y muestre en consola un mensaje tipo:
        //"Hola, me llamo Juan, tengo 25 años y mido 1.75m"
        //Qué usar: String, int, double, concatenación con +.


        // primero lo que tengo en cuanta es leer bien lo que nos piden
        // en este cado solo nos piden que guarde unos datos que ya tenemos lo que no hace falta que se lo pidamos al usuario
        // una vez ya sabiendo eso creamos nuestras variables tiendo en cuanta que tipo de datos son
        String nombre = "juan";
        int edad = 25;
        double altura = 1.70;

        System.out.println("hola, me llamo "+ nombre + ", tengo "+ edad + " años y mido " + altura +"m");



        //Ejercicio 2: Conversión de segundos

        //Objetivo: Dado un total de segundos (por ejemplo int totalSegundos = 3725;), calcular cuántas horas, minutos y segundos representa, e imprimirlo como "1h 2m 5s".
        //Qué usar: int, operadores aritméticos (/ y %, que no tenés en apuntes todavía pero son básicos: división entera y resto).


        // primero que tengo que tener en cuenta son la cantidad de segundos que hay tanto en una hora como un minuto
        // lo segundo tiendo en cuenta lo que no tengo anotado y lo que hace cada operador aritmetico
        // empiezo a pensar como resolverlo
        int TotalSegundos = 3725;
        int horaEnSegundos = 3600;
        int MinutosEnSegundos = 60;
        // primero divido el total de segundo por lo total de segundos que hay en una hora
        int hora = TotalSegundos/ horaEnSegundos;
        // luego el obtengo el resto del la division anterior
        int restoHora = TotalSegundos % horaEnSegundos;
        // y lo divido por los segundos que hay en un minuto
        int minutos = restoHora / MinutosEnSegundos;
        // y por ultimo obtengo la cantidad de segundos que quedan
        int restoSegundos = restoHora  % MinutosEnSegundos;

        System.out.println(hora +"h "+ minutos+"m "+ restoSegundos+"s");



        // Nivel 2 — Condicionales + operadores lógicos
        //Ejercicio 3: Validador de acceso

        //Objetivo: Tenés una edad y un boolean tienePermiso. La persona puede entrar a un evento si es mayor de 18 Y tiene permiso, O si es mayor de 21 (sin importar el permiso). Imprimir "Puede entrar" o "No puede entrar".
        //Qué usar: if/else, &&, ||, boolean.

        // primero declaro mis variables
        boolean tienePermiso = true;
        int EsMayor = 18;

        // segundo pienso y tengo en cuanta que hay una o otra condicion que tiene que ser true para que se cumpla la consigna
        if((EsMayor>=18 && tienePermiso) || (EsMayor>=21)){

            // como que la funcional de && que (and) ambas partes tanto la edad mayor a 18 y tiene permiso tiene que ser true para que se cumpla la condicion
            // como tambien la funcionalidad de || que es (or , o ) asi que o se cumple Esmayor y tiene permiso o se cumple que solo es mayor a 21 sin importar que tiene permiso sea true o false
            System.out.println("puede entrar");
        }
        else {
            System.out.println("no puede entrar");
        }


        // Ejercicio 4: Clasificador de notas
        //Objetivo: Dada una nota (double nota), clasificarla como:

        //>= 9 → "Excelente"
        //>= 7 → "Bueno"
        //>= 6 → "Aprobado"
        //resto → "Reprobado"

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la nota");
        double nota = scanner.nextDouble();
        if ( nota >= 9){
            System.out.println("exelente");
        } else if (nota >=7) {
            System.out.println("bueno");
        } else if (nota>=6) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("reprobado");
        }
        scanner.close();

        //Nivel 3 — Strings + condicionales
        //Ejercicio 5: Verificador de palabra
        //Objetivo: Dada una palabra (String palabra), revisar si el primer y el último carácter son iguales. Imprimir true o false.
        //Qué usar: .length(), .charAt(), == (para comparar char), if.

        String palabra = "ana";
        int longitud = palabra.length();
        char PrimeraLetra = palabra.charAt(0);
        char ultimaLetra = palabra.charAt(longitud-1);
        if (PrimeraLetra == ultimaLetra){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // Nivel 4 — Arrays
        //Ejercicio 6: Suma y promedio manual
        //Objetivo: Tenés un array int[] notas = {8, 6, 9, 5, 7};. Sin usar loops (todavía no los viste), calculá la suma total accediendo a cada posición manualmente, y después el promedio (double).

        int[] notas = {8, 6, 9, 5, 7};
        int sumaTotal = 0;
        sumaTotal+= notas[0];
        sumaTotal+=notas[1];
        sumaTotal+=notas[2];
        sumaTotal+=notas[3];
        sumaTotal+= notas[4];

        double promedio = sumaTotal / notas.length;
        System.out.println(promedio);



        // Ejercicio 7: Tablero de 3x3
        //Objetivo: Crear un array bidimensional int[][] tablero de 3x3, donde cada posición [fila][columna] contenga como valor fila + columna. Por ejemplo, tablero[1][2] debería valer 3.
        //Qué usar: Arrays multidimensionales, asignación índice por índice, Arrays.deepToString() para verificar el resultado.

        int[][] tablero = new int[3][3];
        tablero[0][0]=0;
        tablero[0][1]=1;
        tablero[0][2]=2;
        tablero[1][0]=1;
        tablero[1][1]=2;
        tablero[1][2]=3;
        tablero[2][0]=2;
        tablero[2][1]=3;
        tablero[2][2]=4;

        System.out.println(Arrays.deepToString(tablero));


    }
}
