# <span style="color:#0d47a1">Recursión (Semanas 2-3)</span>

> Volver a [[Ruta de Aprendizaje - Programacion 1|Ruta de Aprendizaje]]

## ¿Qué es?
Un método recursivo es un método que se llama **a sí mismo**, con un problema cada vez "más chico", hasta llegar a un punto donde ya no hace falta llamarse de nuevo (el **caso base**). No hay sintaxis nueva de Java para esto — es un cambio de *modelo mental*, no de vocabulario.

## Lo que ya sabés y se reutiliza
- Métodos con parámetros y `return`
- Condicionales (`if`)
- Todo lo de `String` (`charAt`, `substring`, `length`)

## Lo nuevo: el modelo mental
Todo método recursivo tiene dos partes obligatorias:

1. **Caso base**: la condición que corta la recursión, sin volver a llamarse. Sin esto, el programa nunca termina (`StackOverflowError`).
2. **Caso recursivo**: la llamada al mismo método, pero con un parámetro "más cerca" del caso base.

```java
static int factorial(int n) {
    if (n == 0) return 1;          // 1. CASO BASE — no vuelve a llamarse
    return n * factorial(n - 1);   // 2. CASO RECURSIVO — se acerca al caso base
}
```

**Truco para no perderte**: preguntate siempre *"¿cuál es el caso más chico posible que puedo resolver directamente, sin llamar de nuevo a la función?"* — string vacío, `n == 0`, array de tamaño 1. Ese es tu caso base.

## Cómo pensar la pila de llamadas
Para `factorial(3)`:

```
factorial(3) = 3 * factorial(2)
                     = 3 * (2 * factorial(1))
                            = 3 * (2 * (1 * factorial(0)))
                                          = 3 * (2 * (1 * 1))     <- caso base devuelve 1
                     = 3 * (2 * 1) = 6
```

Cada llamada queda "esperando" el resultado de la siguiente hasta que el caso base devuelve un valor concreto; ahí empieza a "subir" resolviendo las multiplicaciones pendientes.

## Ejemplos de código explicados

### Recursión sobre enteros
```java
static int sumatoriaRec(int n) {
    if (n == 0) return 0;                  // caso base: no queda nada que sumar
    return n + sumatoriaRec(n - 1);        // sumo n, y le pido al resto (n-1) que se sume solo
}
```

### Recursión sobre Strings con función auxiliar `resto()`
Este es el patrón que aparece **repetido en todos los parciales**: te dan gratis una función que devuelve el string sin su primer carácter.

```java
static String resto(String s) {
    return s.substring(1); // todo menos el primer carácter
}

// Cuenta cuántas veces aparece un carácter c en el string s
static int contar(String s, char c) {
    if (s.length() == 0) {
        return 0; // caso base: string vacío, no hay nada que contar
    }
    if (s.charAt(0) == c) {
        return 1 + contar(resto(s), c); // el primero cuenta + lo que cuente el resto
    }
    return contar(resto(s), c); // el primero no cuenta, seguimos con el resto
}
```

### Recursión que "arma" un nuevo String (patrón `estaPrimera`/`rotacion` de la Práctica 0)
```java
static String reverso(String s) {
    if (s.length() <= 1) return s;              // caso base: 0 o 1 caracter, ya está invertido
    return reverso(resto(s)) + s.charAt(0);      // invierto el resto, y pego el primero AL FINAL
}
```
Fijate el patrón: `reverso(resto(s))` resuelve el problema más chico primero, y recién cuando ese resultado "vuelve", se le agrega el carácter actual — por eso el primer carácter termina al final.

## Funcionalidades / métodos de `String` que se combinan con recursión
| Método | Qué hace |
|---|---|
| `s.length()` | Longitud del string — típico caso base (`== 0` o `<= 1`) |
| `s.charAt(0)` | Primer carácter — el que se "procesa" en cada llamada |
| `s.substring(1)` | Equivalente a lo que hace `resto(s)` a mano |
| `s.substring(0, s.length()-1)` | Todo MENOS el último carácter (útil si el patrón recorre de atrás para adelante) |

## Cómo podría aparecer en el parcial
- Te dan `resto(String s)` como función ya hecha (no hay que programarla) y piden construir algo encima: contar, invertir, verificar un patrón, comparar dos strings letra a letra.
- A veces piden la versión recursiva de un método que ya escribiste con `for` (sumatoria, potencia, factorial) — la lógica es la misma, solo cambia la herramienta.

## <span style="color:#c62828">Errores comunes a evitar</span>
- Olvidarse del caso base → recursión infinita.
- Caso base que no se alcanza nunca (ej: restar de a 2 en vez de 1 cuando el número puede ser impar).
- Mezclar `print` con `return` dentro de la misma rama de forma confusa — separar bien qué hace cada línea.
