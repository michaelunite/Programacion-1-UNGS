package TEMAS;

import java.util.Scanner;

public class PedirDatos {
    public static void main (String[] args){

        // En este archivo veremos la clase de "Scanner"
        // "Scanner" Permite que tus programas sean interactivos. En lugar de tener valores fijos
        // el programa puede pedirle al usuario su nombre, edad, precios, etc., y procesar esa información en tiempo de ejecución.

        // Cosas a tener en cuenta antes de utilizarlas

        // 1: Importar la clase: Como no está en el paquete por defecto (java.lang), debes importarla al inicio de tu archivo Java
        // se importa de la siguiente manera, arriba de todo al inicio de la clase se pone lo siguiente "import java.util.Scanner;"

        // 2: Crear e inicializar la instancia de Scanner: Debes instanciar un objeto Scanner pasándole la fuente de entrada
        // Para la consola de comandos se utiliza System.in, se hace de la siguiente manera
        // "Scanner scanner = new Scanner(System.in);"

        // 3: Tener claras las entradas esperadas: Debes saber qué tipo de dato vas a pedirle al usuario para usar el método de lectura correcto y evitar errores de conversión.
        // esto se vera mas adelante

        //ahora inicializemos nuestra instancia


        Scanner scanner = new Scanner(System.in);


        // fomar de utilizar la classe scanner


        // scanner.next()
        // este metodo Lee solo una palabra (se detiene al encontrar un espacio en blanco o salto de línea).

        String primeraPalabra = scanner.next();
        System.out.println(primeraPalabra);

        // scanner.nextline
        // Lee toda la línea completa hasta que el usuario presiona Enter.

        String cadenaCompleta = scanner.nextLine();
        System.out.println(cadenaCompleta);

        // scanner.nextInt
        // lee un valor de tipo int

        System.out.println("ingrese un numero");
        int entero = scanner.nextInt();
        System.out.println(entero);

        // tambien existem "nextByre()","nextShort()","nextLong()","nextDouble()","next.boolean()"


        // tambien si queremos mostrar datos que ya tenemos guardado en una variable
        // pues se hace de la siguiente manera:

        String  cadena1= "hola mundo todo bien";

        Scanner scanner1 = new Scanner(cadena1);
        // almacenamos nuestra variable dentro de nuestra inicializacion de scanner1
        // scanner.next()
        String unapalabra = scanner1.next();
        System.out.println(unapalabra);

        // scanner.nextline()
        String cadenaCompleta1 = scanner1.nextLine();
        System.out.println(cadenaCompleta1);


        scanner.close();

    }
}
