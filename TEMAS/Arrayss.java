package TEMAS;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {

        // En este archivo se vera sobre los arrays (listas)
        // que son y como se utilizan

        // Conceptos fundamentales a tener en cuenta sobre los arrays (listas)
        // 1. indices de base 0: el primer elemento siempre esta en la posicion 0, el segundo en la posicion 1 y asi sucesivamente,
        // es  decir, imaginemos que tenemos una lista de numeros {1,2,3,4}, el "1" se encuantra en la posicion 0 y el "2" en la 1
        // 2. tamaño fijo: cuando se crea un arrays y defines su tamaño no se puede modificar
        // 3. ultima posocion: si un arrays tiene un tamaño N, la ultima posicion valida siempre es N-1

        // formas de declarar un arrays

        // Arrays de numeros enteros

        // para declarar un arrays se utilza los siguiente "[]"

        int[] num = new int[3];
        // declaramos de cuanto va a hacer su longitud en "new int ´[5]´(longitud) "
        // si imprimimos el arrays tal cual esta nos dara como salida una direccion de memoria y no los numeros que queremos o contine

        // declaremos el contenido de cada indice que tendra el arrays
        num[0] = 1;
        // declaramos en la posocion 0 tendra como dato en numero 1
        num[1] = 2;
        num[2] = 3;

        // para poder imprimir el tipo de arrays que estamos utilizando se utiliza lo siguiente:
        //Arrays.toString("nombre del arrays")

        System.out.println(Arrays.toString(num));


        // declarar un arrays con contenido

        // para declarar un arrays con contenido adentro de utiliza "{}"
        int[] listaNumeros = {1, 2, 3, 4, 4};
        System.out.println(Arrays.toString(listaNumeros));

        // para cambiar el contenido de una posicion por otra es de la siguiente manera

        listaNumeros[2] = 5;
        System.out.println(Arrays.toString(listaNumeros));

        // Arrays con cadena

        String[] cadena = {"hola", "mundo", "fuck"};
        System.out.println(Arrays.toString(cadena));

        // guardar datos en un arrays vacio donde los datos los contenga variables

        int dato1 = 2;
        int dato2 = 3;
        int dato3 = 4;

        int[] TotalDatos = {dato1, dato2, dato3};
        System.out.println(Arrays.toString(TotalDatos));

        // y si quiero saber que tipo de dato hay en cierto indice

        int[] buqueda = {1, 3, 3, 4, 5};
        System.out.println(buqueda[2]);
        // agregamos el nombre del arrays mas la posicion con "[posocion]"

        // Arrays de multiples direcciones
        // que son los arrays de multiples direcciones, son arrays dentro de otro arrays,
        // es decir , en ves de ser una lista de elemtos de una sola fila, funciona como filas y columnas
        // y como funcione? de la siguiente manera

        // declaremos nuestro arrays de una fila y dos columnas
        int[][] multiples = new int[1][2];

        // asignemole un valor a nuestra fila y columna
        multiples[0][0] = 1;
        multiples[0][1] = 2;
        // el  primero declaramos nuestra posicion en la primera fila ,"[0]" , despues en nuestra columna ,"[0]"

        // para poder imprimir un arrays multiple se utiliza lo siguiente:
        // "Arrays.deepToString("nombre del arrays")"
        System.out.println(Arrays.deepToString(multiples));


        // y si queremos tener un arrays multiple con ya datos adentro, pues se hace de la siguiente manera


        int[][] tablero = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        // tres filas y tres columnas
        // imprimamos nuestro arrays 3x3
        System.out.println(Arrays.deepToString(tablero));


        int[][] lista2 = new int[3][2];

        System.out.println(lista2.length);

        for (int i = 0; i < lista2.length; i++) {
            for (int k = 0; k < lista2[i].length; k++) {
                lista2[i][k]=(k+1);
                System.out.println(lista2[i][k]);
            }
        }
        System.out.println(Arrays.deepToString(lista2));
    }
}
