public class EjerciciosVariablesyTiposDeDatos {
    public static void main(String[] args){
        
        // Ejercicio 1: Tu Perfil de Programador/a
        // Declara las siguientes variables asignándoles tus datos reales. Elige correctamente entre let (o tu equivalente para variables) y const (para constantes):
        // Tu nombre (String)
        // Tu edad (Number/Integer)
        // Si estás estudiando actualmente (Booleano)
        // Tu fecha de nacimiento (Constante - String o Number)

        final String nombre = "martin";

        int edad = 20;

        boolean estudiando = true;
        int fechaNaciemiento = 2004;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad :" + edad);
        System.out.println("Estudiando: " + estudiando);
        System.out.println("Fecha de nacimiento :" + fechaNaciemiento);

        
        // Ejercicio 2: El Carrito de Compras
        
        // Crea un script que calcule el total de una compra. Debes declarar:
        // Una constante para el DESCUENTO (por ejemplo, 0.15 que representa el 15%).
        //Una variable para el precioProducto1 (asigna un número decimal).
        //Una variable para el precioProducto2 (asigna otro número decimal).
        //Una variable precioTotal que sume ambos productos.
        // //Una variable precioFinal que reste el descuento al precioTotal.

        final double DESCUENTO = 0.15;
        double precioProducto1 = 100.50;
        double precioProducto2 = 50.25;
        double sumaTotal = precioProducto1 + precioProducto2;
        double precioFinal = sumaTotal - (sumaTotal * DESCUENTO);

        System.out.println("Descuento aplicado :" + precioFinal);


        // Ejercicio 3: Interruptor de Luz (Booleanos)
        // Declara una variable llamada estaPrendido y asígnale el valor false.
        // Imagina que el usuario presiona el interruptor: cambia el valor de la variable a su contrario (sin escribir true directamente, intenta usar el operador de negación !).
        // Muestra el estado actual en la consola.

        boolean estaPrendido = false;
        estaPrendido = !estaPrendido;
        System.out.println("El interruptor esta prendido: " + estaPrendido);


        // Ejercicio 4: Conversión de Moneda

        // Imagina que estás desarrollando una función para una app de viajes.
        // Debes definir el valor del tipo de cambio de dólares a tu moneda local (este valor no debería cambiar durante la ejecución del programa).
        // Define una cantidad fija de dólares que el usuario quiere cambiar.
        // Calcula cuánta moneda local recibirá el usuario tras la conversión.
        //Muestra el resultado final con un mensaje claro en la consola.

        double dolares = 5;
        double MonedaLocal = 1.500;
        double conversion = MonedaLocal * dolares;
        System.out.println("Resultado de la conversión: " + conversion);

        // Ejercicio 2: Rendimiento de Combustible

        //Estás calculando los gastos de un viaje en auto en base a la capacidad del tanque.
        //Define la capacidad total del tanque de combustible en litros.
        //Define los kilómetros totales que rinde el auto con el tanque lleno.
        //Calcula cuántos kilómetros puede recorrer el auto por cada litro de combustible.
        //Muestra el consumo por litro en la consola.

        int CapacidadTanque = 5;
        final double KLXLitro = 1.5;
        double tanquellenoKl = KLXLitro * CapacidadTanque;
        System.out.println("los kl por litro es de " + KLXLitro +"kl" + "\nEl total de kilometro con el tanque lleno es de "+ tanquellenoKl + "KL");

        // Ejercicio 3: Control de Inscripciones y Aforo

        //Estás armando el sistema de registro para un concierto en un club mediano.
        //Define el límite máximo de personas permitidas en el lugar (este valor es estricto y no cambia).
        //Define la cantidad de entradas que ya se vendieron.
        //Calcula la cantidad de entradas que quedan disponibles.
        //Define una variable que guarde un valor verdadero/falso (true/false) que indique si el evento ya está completamente agotado (pista: compáralas o piénsalo de forma lógica).

        final int LimiteDePersonas = 200;
        int EntradasVendidas = 150;
        int EntradasDisponible = LimiteDePersonas - EntradasVendidas;
        boolean Completo = true;
        if (EntradasDisponible == 0){
            System.out.println("Entradas agotadas"+Completo);
        }
        else{
         System.out.println("aun que dan entradas entradas?"+!Completo);
        };


        //Ejercicio 4: El Promedio del Estudiante

        //Un profesor necesita automatizar el cálculo de notas finales de su materia "Programación 1".
        //Registra el nombre del estudiante (texto).
        //Registra las notas de tres exámenes distintos (pueden tener decimales).
        //Calcula la nota promedio sumando las tres notas y dividiéndolas por la cantidad total de exámenes.
        //Muestra en consola el nombre del alumno junto a su promedio final.

        String NombreAlumno = "pablo";
        double examen1 = 6.5;
        int examan2 = 8;
        double examen3 = 7.5;
        double Promedio = (examen1+examan2+examen3)/3;
        System.out.println(Promedio);







    }
}