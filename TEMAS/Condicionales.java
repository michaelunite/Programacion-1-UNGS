package TEMAS;

public class Condicionales {
    public static void main(String[] args){

        //if e else

        // COSAS A TENER EN CUENTA SOBRE COMO UTILIZAR IF E ELSE

        // 1: Saber construir expresiones booleanas: La condición dentro del paréntesis de un if (...) debe ser algo que resulte en verdadero o falso. Para ello se usan:
        //Operadores relacionales: == (igual), != (distinto), > (mayor), < (menor), >= (mayor o igual), <= (menor o igual).
        //Operadores lógicos: && (AND / Y lógico), || (OR / O lógico), ! (NOT / Negación).

        // 2: Ámbito o Scope de las variables:
        //Las variables declaradas dentro de un bloque if o else solo existen dentro de las llaves {} de dicho bloque.

        int numero = 4;
        if (5>numero){
            System.out.println("5 es mayor a: "+ numero);
        }


    }
}
