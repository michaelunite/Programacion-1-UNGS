# <span style="color:#0d47a1">Complejidad Algorítmica y Ordenamiento (Semanas 7-8)</span>

> Volver a [[Ruta de Aprendizaje - Programacion 1|Ruta de Aprendizaje]]

## ¿Qué es?
Es la primera vez que la materia te pide **medir** un algoritmo, no solo escribirlo. La pregunta pasa de "¿funciona?" a "¿qué tan rápido funciona a medida que crecen los datos?". La notación **O()** (Big O) no es código Java — es una forma de escribir, en papel o comentario, cuánto crece el tiempo de ejecución.

## Lo que ya sabés y se reutiliza
- Loops `for` y `while`
- Arrays
- Swap con variable temporal
- Recursión (para Quicksort y Mergesort)

## Lo nuevo: la notación Big O
No es sintaxis de Java, es teoría que se aplica a código que ya sabés escribir:

| Notación | Se lee | Ejemplo |
|---|---|---|
| `O(1)` | Constante | Acceder a `array[5]` |
| `O(log n)` | Logarítmica | Búsqueda binaria |
| `O(n)` | Lineal | Recorrer un array una vez |
| `O(n log n)` | Cuasi-lineal | MergeSort, Quicksort |
| `O(n²)` | Cuadrática | Loops anidados (Selección, Burbujeo) |

**Cómo estimarla mirando el código**: contá cuántos loops están anidados uno dentro de otro sobre el mismo tamaño de dato `n`. Un loop simple → `O(n)`. Un loop dentro de otro → `O(n²)`. Si en cada paso recursivo el problema se divide a la mitad → `O(log n)`.

## Algoritmos de búsqueda

### Búsqueda lineal (ya la conocés, aunque no con este nombre)
```java
static boolean buscarLineal(int[] a, int buscado) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == buscado) return true;
    }
    return false;
}
// Complejidad: O(n) — en el peor caso recorre TODO el array
```

### Búsqueda binaria (nueva) — requiere array ORDENADO
```java
static boolean busquedaBinaria(int[] a, int buscado) {
    int izq = 0, der = a.length - 1;
    while (izq <= der) {
        int medio = (izq + der) / 2;
        if (a[medio] == buscado) {
            return true;                  // lo encontré
        } else if (a[medio] < buscado) {
            izq = medio + 1;              // descarto la mitad izquierda
        } else {
            der = medio - 1;              // descarto la mitad derecha
        }
    }
    return false; // agoté el rango sin encontrarlo
}
// Complejidad: O(log n) — en cada vuelta descarta la MITAD de lo que queda
```
**Por qué es más rápida**: con un array de 1.000.000 elementos, la búsqueda lineal puede tardar hasta 1.000.000 de pasos; la binaria tarda como máximo ~20 pasos (log₂ de un millón). El costo es que **exige que el array esté ordenado primero**.

## Algoritmos de ordenamiento

### Selección — `O(n²)`
Busca el mínimo restante en cada vuelta y lo manda al frente.
```java
static void seleccion(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[minIdx]) minIdx = j;
        }
        int temp = a[i];
        a[i] = a[minIdx];
        a[minIdx] = temp;
    }
}
```

### Burbujeo (Bubble sort) — `O(n²)`
Compara elementos adyacentes y los va "empujando" hacia su lugar.
```java
static void burbujeo(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
        for (int j = 0; j < a.length - 1 - i; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}
```

### Quicksort — recursivo, `O(n log n)` en promedio
Elige un "pivote", separa el array en menores/mayores al pivote, y ordena cada mitad recursivamente.
```java
static void quicksort(int[] a, int inicio, int fin) {
    if (inicio < fin) {                          // caso base implícito: rango de 1 elemento
        int pivotIdx = particionar(a, inicio, fin);
        quicksort(a, inicio, pivotIdx - 1);       // ordena la mitad izquierda
        quicksort(a, pivotIdx + 1, fin);          // ordena la mitad derecha
    }
}

static int particionar(int[] a, int inicio, int fin) {
    int pivote = a[fin];
    int i = inicio - 1;
    for (int j = inicio; j < fin; j++) {
        if (a[j] < pivote) {
            i++;
            int temp = a[i]; a[i] = a[j]; a[j] = temp;
        }
    }
    int temp = a[i + 1]; a[i + 1] = a[fin]; a[fin] = temp;
    return i + 1;
}
```

### Mergesort — recursivo, `O(n log n)` siempre
Divide el array a la mitad recursivamente hasta tener partes de 1 elemento, y las va "mezclando" ordenadas.
```java
static void mergesort(int[] a, int inicio, int fin) {
    if (inicio < fin) {
        int medio = (inicio + fin) / 2;
        mergesort(a, inicio, medio);       // ordena la mitad izquierda
        mergesort(a, medio + 1, fin);      // ordena la mitad derecha
        merge(a, inicio, medio, fin);      // mezcla ambas mitades ya ordenadas
    }
}
```
(El método `merge` que combina las dos mitades suele darse ya hecho, similar al patrón `resto()` de recursión — enfocate en entender qué hace `mergesort` arriba, no en memorizar `merge`.)

## Funcionalidades / comparación rápida
| Algoritmo | Complejidad | ¿Recursivo? | Idea clave |
|---|---|---|---|
| Selección | O(n²) | No | Busca el mínimo y lo pone al frente |
| Burbujeo | O(n²) | No | Compara e intercambia adyacentes |
| Quicksort | O(n log n) prom. | Sí | Particiona alrededor de un pivote |
| Mergesort | O(n log n) | Sí | Divide a la mitad y mezcla ordenado |
| Búsqueda lineal | O(n) | No | Recorre todo |
| Búsqueda binaria | O(log n) | No (o recursiva) | Descarta la mitad en cada paso, requiere orden previo |

## Cómo podría aparecer en el parcial
- Dado un fragmento de código, identificar su complejidad (`O(n)`, `O(n²)`, etc.)
- Comparar dos implementaciones y decir cuál es más eficiente y por qué
- Trazar a mano una pasada de Selección o Burbujeo sobre un array chico

## <span style="color:#c62828">Errores comunes a evitar</span>
- Usar búsqueda binaria sobre un array que no está ordenado (el algoritmo "funciona" sin error pero da resultados incorrectos).
- Confundir "es más corto de código" con "es más eficiente" — Burbujeo es simple de escribir pero es `O(n²)`, igual que Selección.
- En Quicksort/Mergesort, olvidar el caso base (`inicio < fin`) — sin él, recursión infinita.
