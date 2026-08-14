package EJERCICIOS.RECURSIVIDAD.recusirvidadYmetodosAxuliares;

public class recursividadYauxiliares {


    // EJERCICIO 1
    static int contarPasos (int n){
        if (n == 0){
            return 0;
        }
        else {
            int resultado = contarPasos(n-1);
            return 1 + resultado;
        }
    }


    // EJERCICIO 2
    static int sumaPares(int n){
        if (n<=0){
            return n;
        }
        else {
            int resultado = sumaPares(n-1);
            if (n%2==0){
                return n+resultado;
            }
            return resultado;
        }
    }



    //EJERCICIO 3

    static int multiplicar (int a, int veces){
        if (veces == 0){
            return 0;
        }else {
            int resultado = multiplicar(a, veces-1);
            return a + resultado;

        }
    }
    public static void main(String[] args){

        // EJERCICIO 1
        System.out.println(contarPasos(4));


        // EJERCICIO 2

        System.out.println(sumaPares(7));

        //EJERCICIO 3

        System.out.println(multiplicar(3,4));




    }

}
