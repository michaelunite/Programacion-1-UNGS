> Explicación: [[ConversionDeDatos_apuntes]]

## <span style="color:#ef6c00">Código</span>

```java
public class ConversionDeDatos {
    public static void main (String[] args){

        // aqui veremos como convertir de un dato a otro dato

        // pasemos un numero entero a un string
        // para poder pasar  de un numero a un string se puede hacer de diferentes maneras que son
        // 1: usando el comando "String.valueOf()"
        int num = 3;
        String texto1 = String.valueOf(num);
        System.out.println(texto1);
        // 2: usando el comando "Integer.ToString("nuestra variable")"
        int num2 = 4;
        String texto2 = Integer.toString(num2);
        System.out.println(texto2);
        // 3: creando un variable de tipo string y haciendo lo siguiente , "el nombre variable" + ""
        int num3 = 5;
        String texto3 = num3 + "";
        System.out.println(texto3);

        // lo mismo se puede hacer con los demas tipos de datos que utilizen numeros



        // Pasar de un string(que sea solo numero) a un tipo de dato numerico

        // para poder pasar de un string a numero de utiliza el siguente comando
        // 1: Integer.parseInt(nuestro string), esto pasa de texto a numeros enteros
        // 2: Double.parseDouble(nuestro string), esto pasa de texto a numero double

        String cadena1="123";
        int numero1= Integer.parseInt(cadena1);
        System.out.println(numero1);

        String cadena2= "3221";
        double numero2= Double.parseDouble(cadena2);
        System.out.println(numero2);


        //Pasar de un double a un entero

        double num1=12.00;
        int entero = (int) num1;
        System.out.println(entero);

        //viceversa
        int entero2 = 12;
        double double1 = entero2;
        System.out.println(double1);

    }
}
```