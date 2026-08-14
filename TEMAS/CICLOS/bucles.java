package TEMAS.CICLOS;

public class bucles {
    public static void main(String[] args){

        // en este archivos veremos los tipos de bucles que existen, como for y white

        // Primero que son los bucles:
        // son estructuras de control que permiten repetir un bloque de código varias veces sin
        // tener que escribirlo una y otra vez. Se repiten mientras se cumpla una condición determinada.

        // primero empezemos por el bucle "for"
        // el mas utilizdo de todos

        // como funciona y que tener en cuenta antes usarlo

        // "for" funciona para recorrer datos de un punto a otro,
        // ejemplo : recorrer un arrays que esta vacio y antes de poner dato por dato por separado con for pedomos indicar que de donde hasta donde y cuales datos seran guardado
        // los puntos a tener en cuenta ala hora usar for es que tiene que tener 3 condiciones que son:
        // 1: una inicializacion : es decir, un entero que inicie en 0
        // 2: un condicion, es decir, de donde hasta donde, ejemplo: 1<5
        // 3: un incremento/decremento, es decir, cuanto va a subir o bajar nuestra inicializacion

        // como se utiliza
        // creemos un arrays vacio

        int[] lista = new int[3];
        // sabiendo que un arrays de longitud de 3, utilizemos for para rellenar ese dato

        for (int i= 0; i<lista.length ; i++ ){

            lista[i]=i;

            System.out.println("en la posicion "+ i + " en el array se guardo el dato "+lista[i]);
        }

        // recorramos un arrays donde contiene numeros

        int[] listaNumeros = {1,2,3,4,5,6};
        for (int i = 0 ; i<listaNumeros.length; i++){

            System.out.println(listaNumeros[i]);

        }

        // y si queremos saber saber si en la lista hay un numero mayor



    }
}
