package EJERCICIOS.METODOS;

public class FortalecerMetodos {

    // METODOS

    // EJERCICIO A
    public static double calcularDescuento (double precio , int cantidad){

        double total = precio * cantidad;
        if (total>=1000) {
            double descuento = total - (total * 0.20);
            return descuento;
        }
        else {
            return total;
        }
    }

    static String mostrarCompra(double precio , int cantidad){

        FortalecerMetodos metodo = new FortalecerMetodos();
        double descuento = calcularDescuento(precio,cantidad);
        double total = precio*cantidad;
        if (total>=1000) {
            return "el descuento de 20% fue aplicado, \n" +
                    "el toal de su compra es de " + descuento;
        }else {
            return "sin descuento" + descuento;
        }
    }


    // EJERCICIO B
    static double promedio(int[] numeros){
        double total = numeros[0];
        for (int i = 1 ; i<numeros.length ; i++){
            total+=numeros[i];
        }
        return total/numeros.length;
    }

    static double valorMasAlto(int[] numeros){
        double masAlto = numeros[0];
        for (int i = 1; i<numeros.length ; i++){
            if (numeros[i]>masAlto){
                masAlto=numeros[i];
            }
        }
        return masAlto;
    }



    // EJERCICIO C

    static int contarPrimosMenoresA(int limite){
        int cantidadDePrimos=0;
        if (limite>=1){
            for (int i = 1 ; i<=limite ; i++){
                if (esPrimo(i)){
                    cantidadDePrimos+=1;
                }
            }
        }
        return cantidadDePrimos;
    }

    static boolean esPrimo(int n){
        int contador=0;
        for (int i = 1 ; i<=n ; i++){
            if (n%i == 0){
                contador+=1;
            }
        }
        if (contador==2){
            return true;
        }else {
            return false;
        }
    }



    // EJERCICIO D
    static String clasificarEdad (int edad){
        if (edad<18){
            return "niño";
        } else if (edad>=18 && edad<25){
            return "adolecente";
        } else if (edad>=25 && edad<50) {
            return "adulto";
        } else{
            return "adulto mayor";
        }
    }





    // METODO PRINCIPAL
    public static void main(String[] args){


        // Ejercicio A — Refactor con separación de responsabilidades
        //
        //Objetivo: escribir calcularDescuento(double precio, int cantidad)
        //que solo calcule y devuelva el total con el 20% de descuento aplicado (sin imprimir nada adentro),
        //y un método aparte mostrarCompra(...) que imprima el resultado usando lo que devolvió el primero.

        double precio = 300;
        int cantidad = 5;
        System.out.println(mostrarCompra(precio,cantidad));




        // Ejercicio B — Trabajar con arrays dentro de un método (repaso de tu punto débil)
        //
        //Objetivo: escribir promedio(int[] numeros) que devuelva el promedio como double,
        //y valorMasAlto(int[] numeros) que devuelva el máximo.

        int[] numeros = {1,2,4,7,1};
        FortalecerMetodos metodo2= new FortalecerMetodos();
        double promedio = metodo2.promedio(numeros);
        double maximo = metodo2.valorMasAlto(numeros);

        System.out.println("promedio "+ promedio);
        System.out.println("valor mas alto "+ maximo);




        // Ejercicio C — Método que llama a otro método (composición real)
        //
        //Objetivo: escribir esPrimo(int n) (boolean) y luego contarPrimosMenoresA(int limite) (int)
        //que use esPrimo adentro de un for para contar cuántos primos hay antes de limite.

        int limite = 5;
        int cantidadPrimos = contarPrimosMenoresA(limite);

        System.out.println("la cantidad de primos que hay en " + limite + " son "+ cantidadPrimos);



        //Ejercicio D — Clasificación con retorno limpio (sin "returns basura")
        //
        //Objetivo: escribir clasificarEdad(int edad) que devuelva un String
        //("niño", "adolescente", "adulto", "adulto mayor") según rangos, sin imprimir nada adentro,
        //y probarlo desde main con System.out.println(clasificarEdad(25)).


        int edad = 18;
        System.out.println(clasificarEdad(edad));
    }
}
