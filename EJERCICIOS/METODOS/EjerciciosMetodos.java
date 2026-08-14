package EJERCICIOS.METODOS;

import java.sql.SQLOutput;

public class EjerciciosMetodos {
    public static void main(String[] args){


        // EJERCICIO 1.- Crear un método que muestre los datos
        // (nombre, apellido y la edad) de un usuario.

        Metodo1("juan", "pepo" , 33);


        // EJERCICIO 2.- Diseñe un método que imprima los datos de una persona
        // e indicar si es mayor o menor de edad.

        String nombre = "mateo";
        String apellido = "lolo";
        int edad = 12;
        if (Metodo2(edad)){
            System.out.println("la persona es mayor de edad \n" +
                    "eded de, "+ nombre + " es "+ edad);
        }
        else {
            System.out.println("la persona es menor de edad \n" +
                    "eded de, "+ nombre + " es "+ edad);
        }

        // EJERCICIO 3.- En un método mostrar la tabla de multiplicar de cualquier numero.

        int numero = 2;
        for (int i = 0; i<=10 ; i++){
           System.out.println( numero + " * " + i + " = " + Metodo3(numero,i));
        }


        // EJERCICIO 4.-Elabore un método que simule el proceso de subir a un piso en un ascensor, donde el numero de piso es ingresado por teclado

        int piso = 6;

        // llamamos a nuestra classe principal para poder guardarla en una variable
        EjerciciosMetodos Metodos = new EjerciciosMetodos();
        // para despues llamarla en una nueva variable y asi poder llamar a mis metodos sin escribir todo el nombre del metodo dentro de System
        int pisos = Metodos.Metodo4(6); // a esto se le llama objeto





        // EJERCICIO 5
        // En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000 en las áreas de frutas, verduras y abarrotes.
        // ¿ Cual sera el total que pagara una persona por su compra ?,
        // se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar….

        int precio = 500;
        int cantidad = 3;
        int precioTotal = precio * cantidad;

        EjerciciosMetodos supermercado = new EjerciciosMetodos();

        if (precioTotal>=1000){
            double DescuentoAplicado = supermercado.Metodo5(cantidad,precio);
        }



        // EJERCICIO 6.- Crea un método que al ingresar por teclado un número cualquiera, muestre la cantidad de  números pares a partir del 2,
        // por ejemplo: si se  introduce 7, entonces se imprimirá, 2, 4, 6, 8, 10, 12,14 o si se introduce 10 = 2, 4, 6, 8, 10, 12, 14, 16, 18, 20.

        EjerciciosMetodos numeros = new EjerciciosMetodos();

        int pares = numeros.Metodo6(10);



        // EJERCICIO 7.- Diseñe un método que al ingresar por teclado un numero, si es par mostrar el doble, si es impar mostrar el triple.

        EjerciciosMetodos numero2 = new EjerciciosMetodos();
        int dato = numero2.Metodo7(2);



        // EJERCICIO 8.- En este ejercicio se debe mostrar el mensaje «Ha ingresado un numero de un dígito»,
        // si el numero ingresado esta en el rango del 1 al 9, si ingresa un numero de 2 dígitos mostrar el mensaje; «Ha ingresado un numero de dos dígitos»,
        // de la misma manera si es de 3 dígitos.


        EjerciciosMetodos metodos2 = new EjerciciosMetodos();
        int ingresado = metodos2.Metodo8(9);



    }



    // METODO EJERCICIO 1
    static void Metodo1 (String nombre, String apellido , int edad){

        System.out.println(
                "nombre: "+ nombre + "\napellido:  " + apellido + "\nedad: "+ edad);
    }


    // METODO 2 EJERCICIO 2
    static boolean Metodo2 (int edad){
        if (edad>=18){
            return true;
        }
        else {
            return false;
        }
    }


    // METODO 3 EJERCICIO 3
    static int Metodo3 (int numero, int num){
        return numero * num;

    }


    // METODO 4 EJERCICIO 4
    static int Metodo4 (int Piso){
        for (int i = 0 ; i<=Piso ; i++){
            System.out.println("pisdo " + i);
        }
        return Piso;
    }


    // METODO 5 EJERCICIO 5
    static double Metodo5 (int cantidad, int precio){

        double precioTotal = precio * cantidad;

        if (precioTotal>=1000){

            precioTotal = precioTotal - (precioTotal * 0.20);

            System.out.println("el descuento del 20% en el total de su compra es de: "+precioTotal);
        }
        return 1;
    }



    // METODO 6 EJERCICICO 6

    static int Metodo6 (int numero){

        if (numero>=2) {
            int pares = 2 * numero;
            for (int i = 2; i <= pares; i++) {

                System.out.println("pares " + i);
            }
        }
        else {
            System.out.println("error");
            }
        return 1;

    }


    // METODO 7 EJERCICIO 7
    static int Metodo7 (int numero){
        if(numero % 2 ==0){
            System.out.println("es par " + numero * numero);
        }
        else {
            System.out.println("es impar " + numero*numero*numero);
        }
        return 1;
    }


    // METODO 8 EJERCICIO 9

    static int Metodo8 (int numero){

        if (numero>=1 && numero<=9){
            System.out.println("has ingresado un numero de un digito");
        }
        else if (numero>=10 && numero<=99){
            System.out.println("has ingresado un numero de dos digito");
        } else if (numero>=100 && numero<=999){
            System.out.println("has ingresado un numero de tres digito");
        }
        return 1;

    }



}
