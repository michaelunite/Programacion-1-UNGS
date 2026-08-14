package TEMAS.RECURSIVIDAD;

public class recursividad {
    public static void main(String[] args){
        // en este archivo se
        int resultado = factorial(4);
        System.out.println("RESULTADO FINAL: " + resultado);
    }

    static int factorial(int n) {
        System.out.println("--> ENTRO a factorial(" + n + "), todavia no se el resultado");

        if (n == 0) {
            System.out.println("    n=0, CASO BASE, devuelvo 1 sin llamar a nadie mas");
            return 1;
        }

        // ACA la ejecucion se CONGELA en esta linea hasta que factorial(n-1) termine
        int resultado = n * factorial(n - 1);

        System.out.println("<-- factorial(" + n + ") ya recibio la respuesta, calculo " + n + " * factorial(" + (n-1) + ") = " + resultado + ", y AHORA devuelvo " + resultado);
        return resultado;
    }
}
