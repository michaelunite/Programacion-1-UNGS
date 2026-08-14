> Explicación: [[Recursividad_apuntes]]

## <span style="color:#ef6c00">Código</span>

```java
public class Demo {
    public static void main(String[] args) {
        int resultado = factorial(3);
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
```

### Salida esperada al ejecutarlo

```
--> ENTRO a factorial(3), todavia no se el resultado
--> ENTRO a factorial(2), todavia no se el resultado
--> ENTRO a factorial(1), todavia no se el resultado
--> ENTRO a factorial(0), todavia no se el resultado
    n=0, CASO BASE, devuelvo 1 sin llamar a nadie mas
<-- factorial(1) ya recibio la respuesta, calculo 1 * factorial(0) = 1, y AHORA devuelvo 1
<-- factorial(2) ya recibio la respuesta, calculo 2 * factorial(1) = 2, y AHORA devuelvo 2
<-- factorial(3) ya recibio la respuesta, calculo 3 * factorial(2) = 6, y AHORA devuelvo 6
RESULTADO FINAL: 6
```

> [!tip] Por qué sirve este código
> Los prints de "ENTRO" muestran la **bajada** (todos seguidos, antes de cualquier resultado).
> Los prints de "ya recibio la respuesta" muestran la **subida** (uno por uno, usando el resultado anterior).
