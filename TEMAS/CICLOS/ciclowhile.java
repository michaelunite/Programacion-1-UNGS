package TEMAS.CICLOS;

import  java.util.Arrays;

public class ciclowhile {
    public static void main (String[] args){

        // en este archivo veremos sobre el cliclo white
        // su funcion es la misma que tiene el ciclo for pero con una diferencia muy grande
        // que es, que mientra la condicion que le ponemos sea true(verdadera) el cliclo seguira funcionando hasta que la condicion sea false

        // como se utiliza el ciclo while(mientras)
        // el ciclo while se utiliza solo con una condicion, es decir le damos solo una condicion
        // y ademas con una bandera ( es un dato que se ira cambiando hasta que el ciclo sea false)


        // cremos nuestra bandera
        int bandera = 0;

        // creamos nuestro ciclo while
        while (bandera < 6){
            //creamos nuestro ciclo con nuesta condicion que es que es , mientras bandera < 6

            System.out.println(bandera +" hola mundo");

            bandera+=1;
            // hacemos que nuestra bandera se incremente para que nuestro ciclo no sea infinito

        }

        int[] datos = {1,3,4,5,6};
        int bandera2 = 0;

        while (datos[bandera2]!=4){
            System.out.println("no es igual a 4");

            bandera2+=1;
        }
        System.out.println("se encontro "+ datos[bandera2] + " en la posicion " + bandera2);

        int[] array={1,2,4,5,6,67,8};
        int bandera3=0;

        while(bandera3<array.length){

            System.out.println(array[bandera3]);

            bandera3+=1;
        }

        System.out.println(Arrays.toString(array));


    }
}
