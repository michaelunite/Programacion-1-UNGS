package TEMAS;

public class variablesYconstante {

    public static void main(String[] args){

    //variable de tipo entero

    int entero = 2;
    System.out.println(entero);

    // indicamos primero que tipo de dato es la variable, es decir, nuestro tipo de dato que sera un entero que se le indicara a
    // nuestra variable llamada entero, luego le indicamo que tipo de dato es y le asignamos un valor, en este caso 2, luego imprimimos la variable entero con el metodo System.out.println(entero);
    
    //variable de tipo decimal

    double decimal = 2.5;
    System.out.println(decimal);

    // indicamos primero que tipo de dato es la variable, es decir, nuestro tipo de dato que sera un decimal que se le indicara a
    // nuestra variable llamada decimal, luego le indicamo que tipo de dato es y le asignamos un valor, en este caso 2.5, luego imprimimos la variable decimal con el metodo System.out.println(decimal);

    //variable de tipo cadena

    String cadena= "Hola mundo";
    System.out.println(cadena);

    // cambiar el valor de una variable llamandola y agregandole un nuevo valor
    cadena = "Hola mundo 2";
    System.out.println(cadena);

    // indicamos primero que tipo de dato es la variable, es decir, nuestro tipo de dato que sera una cadena que se le indicara a
    // nuestra variable llamada cadena, luego le indicamo que tipo de dato es y le asignamos un valor, en este caso "Hola mundo", luego imprimimos la variable cadena con el metodo System.out.println(cadena);


    // variable de tipo var
    var variable = "variable con var";
    System.out.println(variable);

    // con la palabra reservada var, Java infiere el tipo de dato de la variable en tiempo de compilación, lo que significa que no es necesario especificar explícitamente el tipo de dato. En este caso, hemos definido una variable llamada "variable" y le hemos asignado un valor de tipo String. Luego, imprimimos el valor de la variable utilizando System.out.println(variable).
    // lo que hace que la palabra servada var se declare como una variable 


    // CONSTANTE

    final String CONSTANTE = "Hola mundo 3";
    System.out.println(CONSTANTE);

    // Para definir una constante en Java, se utiliza la palabra clave "final" antes del tipo de dato. Esto indica que el valor de la variable no puede ser modificado después de su inicialización. En este caso, hemos definido una constante llamada "CONSTANTE" de tipo String con el valor "Hola mundo 3". Luego, imprimimos el valor de la constante utilizando System.out.println(CONSTANTE).

    // Una buena practica es utilizar letras mayúsculas para los nombres de las constantes, lo que ayuda a diferenciarlas de las variables regulares y hace que el código sea más legible.



    }
    
}
