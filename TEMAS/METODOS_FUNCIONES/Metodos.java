package TEMAS.METODOS_FUNCIONES;

public class Metodos {

    // En este archivo se vera sobre los metodos
    // que son, como funcionan, pasos a tener en cuenta y su precauciones

    // QUE ES UN METODO : Un método en Java es un bloque de código reutilizable diseñado para realizar
    // una tarea específica. En otros lenguajes de programación se los conoce comúnmente como funciones o procedimientos.

    // COMO FUNCIONAN :


    // EN UN METODO HAY DOS FORMAS DE DEVOLVER EL DATO Y SON:
    // 1: CON "System.out.printl(nuestro dato)", el normal que utilizamos para imprimir directo un dato
    // pero con este nuestro "tipo de retorno" tiene que ser "void (vacio)" si no va a funcionar

    // 2: CON "return ´nuestro dato´ ", con esta nesecitamos hacer un paso mas ala hora de llamarlo y es
    // usar en nuestra classe principal el "System.out.println(nuestro metodo (el dato)"

    public static void main(String[] args) {


        // METODO CON "SYSTEM.OUT.PRINTLN()"
        metodoSys(5);

        // METODO CON "RETURN"
        System.out.println(metodo1(5));


    }

    // PARA UTILIZAR E CREAR UN METODO NESECITAMOS 4 COSAS
    // 1: STATIC
    // 2 : TIPO DE RETORNO : ES DECIR LO QUE VA RETONAR, SEA UN INT , STRING , DOUBLE O ALGUN TIPO DE DATO
    // 3: EL NOMBRE DEL METODO
    // 4: EL PARAMETRO : ES LO QUE VA RECIBIR EL METODO CON EL TIPO DE DATO QUE ES Y EL NOMBRE DE LA VARIABLE

    // EL METODO SE COMPONE DE LA SIGUIENTE MANERA
    // STATIC <tipo de retorno> <nombre del metodo> (<parametro>){}

    static int metodo1 (int num){

        // en este caso nuestro tipo de retorno es "INT" un entero
        // el nombre de nuestro metodo es: "metodo1"
        // el parametro de nuestro metodo es: "(int num)"

        return num+2;
        // por ultimo retornamo nuestro dato ingresado como parametro y le sumamos "2"
    }

    static void metodoSys(int num){
        System.out.println(num+5);
    }


}
