> Explicación: [[OperadoresLogicos_apuntes]]

## <span style="color:#ef6c00">Código</span>

```java
public class OperadoresLogicos {
    public static void main(String[] args) {

        // Operadores logicos

        // Operador logico Y (and)
        // se utiliza con el signo && (dos veces si no no funciona)

        // el operador logico "&&" funciona para comparar dos valores/dato entre si donde nos volvera un valor boolean, es decir, se compara dos valores entre
        // ejemplo : 2>3 && 2<0, esto nos volvera false ya que compara si 2 es mayor a 3 y 2 es menor a 0
        // se compara primero la primera parte que nos da false y luego se compara la segunda parte que tambien es false y como resultado nos da false esto es por la tabala de comparacion que es la siguiente:

        // false && false = false
        // false && true = false
        // true && false = false
        // true && true = true

        System.out.println(2>3 && 2<0);

        // Operador logico O (or)
        // Se utiliza con el signo "||" ( con dos lineas verticales )

        // el operador logico  "||" funciona de forma contraria a "&&"
        // es decir, volvera true solo cuando una de las condiciones sea true, ejemplo:
        // false || false = false
        // false || true = true
        // true || false = true
        // true || true = true

        System.out.println("false || false:" + (2>3 || 2<0));
        System.out.println("false || true:" + (2>3 || 2>0));
        System.out.println("true || false:" + (2<3 || 2<0));
        System.out.println("true || true:" + (2<3 || 2<0));


        // Operador logico NO (NEGACION)
        // se utiliza con el signo "!"
        // se utiliza para negar algo que es verdado o falso, ejemplo:
        // !true = false
        // !false = true

        System.out.println("!true: "+ !true);
        System.out.println("!false "+ !false);


        // Obtener la longitud de un string
        // esto se hace con comando ".length()"
        // ejemplo: "variable.length()"

        String name = "paco";
        System.out.println(name.length());

        // y si queremos obtener un caracter que este en cierta posicion
        // pues eso se hace con el comando ".charAt()" dentro del los parentesis se pone un numero que este dentro de la longitud del string,
        // teniendo en cuenta que la longitud total del caracter se le resta 1
        // ejemplo : "variable.charAT(3)"

        var cadena = "hola cadena";
        // obtengamos primero la longitud del la cadena de texto (esto no es totalmente obligatorio, se vera mas adelante por que);
        var longitud = cadena.length();
        System.out.println(longitud);
        // obtengamos un caracter que este en la posicion tres
        System.out.println(cadena.charAt(3));
        // veamos que pasa si utilizamos la longitud de "cadena"
        // System.out.println(cadena.charAt(longitud));
        // nos tira error esto es por que la longintud de la cadena sobrepasa la verdadera longitud de la cadena que en verdad es 10
        System.out.println(cadena.charAt(longitud-1));


        int numeros = 12345;
        String cadena1 = String.valueOf(numeros);
        System.out.println(cadena1);

    }
}
```