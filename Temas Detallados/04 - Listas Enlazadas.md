# <span style="color:#0d47a1">Listas Enlazadas (Semanas 9-11)</span>

> Volver a [[Ruta de Aprendizaje - Programacion 1|Ruta de Aprendizaje]]

## ¿Qué es?
Es la sintaxis más nueva de toda la materia hasta este punto: una clase `Nodo` que se **referencia a sí misma**. En vez de un array de tamaño fijo, una lista enlazada es una cadena de nodos donde cada uno apunta al siguiente, y el último apunta a `null`.

## Lo que ya sabés y se reutiliza
- Clases, atributos, constructores (de la unidad de POO)
- Recursión (muchas operaciones sobre listas se pueden hacer recursivas)
- `null` ya lo conocés como concepto, ahora lo usás activamente como condición de corte

## Lo nuevo: el `Nodo` autoreferenciado
```java
public class Nodo {
    int dato;
    Nodo siguiente; // ¡una clase Nodo que contiene una referencia a OTRO Nodo!

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null; // por defecto no apunta a nada
    }
}
```
La "lista" en sí no es una clase separada obligatoriamente — muchas veces simplemente se guarda una referencia al primer nodo (la "cabeza"):
```java
Nodo cabeza = new Nodo(10);
cabeza.siguiente = new Nodo(20);
cabeza.siguiente.siguiente = new Nodo(30);
// cabeza -> [10] -> [20] -> [30] -> null
```

## Recorrer una lista (patrón nuevo — no es un `for` con índice)
```java
static void imprimirLista(Nodo cabeza) {
    Nodo actual = cabeza;
    while (actual != null) {            // corta cuando ya no hay más nodos
        System.out.println(actual.dato);
        actual = actual.siguiente;      // avanza al próximo nodo
    }
}
```
**Idea clave**: nunca "saltás" a una posición como con `array[i]` — tenés que caminar nodo por nodo desde el principio.

## Contar elementos
```java
static int contarNodos(Nodo cabeza) {
    int cont = 0;
    Nodo actual = cabeza;
    while (actual != null) {
        cont++;
        actual = actual.siguiente;
    }
    return cont;
}
```

## Buscar un valor
```java
static boolean contiene(Nodo cabeza, int valor) {
    Nodo actual = cabeza;
    while (actual != null) {
        if (actual.dato == valor) return true;
        actual = actual.siguiente;
    }
    return false;
}
```

## Insertar al principio (la operación más simple)
```java
static Nodo insertarAlPrincipio(Nodo cabeza, int valor) {
    Nodo nuevo = new Nodo(valor);
    nuevo.siguiente = cabeza;  // el nuevo nodo apunta a lo que antes era el primero
    return nuevo;              // el nuevo nodo pasa a ser la cabeza
}
```

## Insertar al final
```java
static Nodo insertarAlFinal(Nodo cabeza, int valor) {
    Nodo nuevo = new Nodo(valor);
    if (cabeza == null) return nuevo;       // lista vacía: el nuevo nodo ES la lista

    Nodo actual = cabeza;
    while (actual.siguiente != null) {      // caminar hasta el ÚLTIMO nodo
        actual = actual.siguiente;
    }
    actual.siguiente = nuevo;               // el último ahora apunta al nuevo
    return cabeza;                          // la cabeza no cambió
}
```

## Eliminar un valor
```java
static Nodo eliminar(Nodo cabeza, int valor) {
    if (cabeza == null) return null;
    if (cabeza.dato == valor) return cabeza.siguiente; // el que se va es la cabeza

    Nodo actual = cabeza;
    while (actual.siguiente != null && actual.siguiente.dato != valor) {
        actual = actual.siguiente;
    }
    if (actual.siguiente != null) {
        actual.siguiente = actual.siguiente.siguiente; // "salteo" el nodo a eliminar
    }
    return cabeza;
}
```
**Idea clave de eliminar/insertar en el medio**: no hace falta "borrar" nada de memoria manualmente — alcanza con redirigir el `siguiente` del nodo anterior para que "salte" al nodo que querés sacar.

## Versión recursiva de las mismas operaciones (para conectar con lo ya visto)
```java
static int contarNodosRec(Nodo actual) {
    if (actual == null) return 0;              // caso base
    return 1 + contarNodosRec(actual.siguiente); // caso recursivo
}
```

## Listas doblemente enlazadas
Cada nodo agrega una referencia hacia atrás también, permitiendo recorrer en ambos sentidos:
```java
public class NodoDoble {
    int dato;
    NodoDoble siguiente;
    NodoDoble anterior; // lo nuevo respecto a la lista simple

    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
```

## Funcionalidades / operaciones clave
| Operación | Complejidad | Idea |
|---|---|---|
| Acceder al primero | O(1) | Es directamente `cabeza` |
| Acceder al último / a una posición N | O(n) | Hay que caminar desde el principio |
| Insertar al principio | O(1) | Solo reacomoda 1 referencia |
| Insertar al final | O(n) | Hay que llegar hasta el último nodo primero |
| Buscar un valor | O(n) | Recorrido completo en el peor caso |

## Cómo podría aparecer en el parcial / TP
- El Trabajo Práctico integrador se asigna en esta franja (semanas 9-11), sobre el motor de videojuego de la materia — probablemente vas a necesitar listas para manejar colecciones dinámicas de elementos del juego (enemigos, ítems, etc.)
- Ejercicios típicos: insertar ordenado, invertir la lista, eliminar duplicados, unir dos listas.

## <span style="color:#c62828">Errores comunes a evitar</span>
- Olvidarse de actualizar `cabeza` cuando insertás/eliminás el primer nodo (por eso muchos métodos devuelven `Nodo` y hay que reasignar: `cabeza = insertarAlPrincipio(cabeza, 5);`).
- Perder la referencia a la lista por avanzar el propio puntero `cabeza` en vez de usar una variable auxiliar (`actual`) para recorrer.
- Condición de corte al revés: `while (actual.siguiente != null)` te deja parado en el ÚLTIMO nodo, no en `null` — usarla a propósito solo cuando necesitás el último nodo, no para recorrer todo.
