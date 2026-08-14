# <span style="color:#0d47a1">Tipos Abstractos de Datos (Semana 12)</span>

> Volver a [[Ruta de Aprendizaje - Programacion 1|Ruta de Aprendizaje]]

## ¿Qué es?
Un Tipo Abstracto de Datos (TAD) es una forma de pensar una estructura de datos por **lo que hace** (sus operaciones) en vez de **cómo está implementada por dentro**. Hasta ahora programaste tus propias listas enlazadas "a mano"; en esta unidad empezás a usar las que Java ya trae hechas, con **genéricos**.

## Lo que ya sabés y se reutiliza
- Todo lo de listas enlazadas (conceptualmente, `LinkedList` de Java hace lo mismo que programaste vos)
- Arrays (conceptualmente, `ArrayList` es "como un array, pero de tamaño variable")

## Lo nuevo: `import java.util.*` y genéricos `<Tipo>`

### `ArrayList` — como un array, pero que crece solo
```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();
nombres.add("Ana");           // agrega al final
nombres.add("Beto");
nombres.get(0);                // "Ana" — acceso por índice, como un array
nombres.remove(0);             // elimina por índice
nombres.size();                 // cantidad de elementos (equivalente a .length en arrays)
```
El `<String>` es el **genérico**: le decís a Java qué tipo de datos va a guardar esa lista, y así el compilador te avisa si intentás meter algo que no corresponde.

### `LinkedList` — la lista enlazada que ya programaste, pero lista para usar
```java
import java.util.LinkedList;

LinkedList<Integer> numeros = new LinkedList<>();
numeros.add(10);
numeros.addFirst(5);   // inserta al principio — O(1), igual que tu implementación a mano
numeros.addLast(20);   // inserta al final
numeros.removeFirst();
```
Nota: con tipos primitivos (`int`) hay que usar la versión "envuelta" (`Integer`) porque los genéricos de Java no aceptan primitivos directamente.

### Pila (Stack) — LIFO: el último que entra es el primero que sale
```java
import java.util.Stack;

Stack<Integer> pila = new Stack<>();
pila.push(1);      // apila
pila.push(2);
pila.push(3);
pila.pop();         // saca y devuelve el 3 (el último que entró)
pila.peek();        // mira el tope (el 2) SIN sacarlo
pila.isEmpty();     // true/false
```
Pensalo como una pila de platos: solo podés sacar (o poner) por arriba.

### Cola (Queue) — FIFO: el primero que entra es el primero que sale
```java
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> cola = new LinkedList<>(); // LinkedList también implementa Queue
cola.add(1);        // encola
cola.add(2);
cola.add(3);
cola.poll();         // saca y devuelve el 1 (el primero que entró)
cola.peek();         // mira el primero SIN sacarlo
```
Pensalo como una fila de gente: el primero que llegó es el primero que se atiende.

## Comparación mental rápida
| Estructura | Orden de salida | Ejemplo de la vida real |
|---|---|---|
| Pila (Stack) | Último en entrar, primero en salir (LIFO) | Pila de platos |
| Cola (Queue) | Primero en entrar, primero en salir (FIFO) | Fila del banco |
| ArrayList | Por índice, como un array | Lista de compras numerada |
| LinkedList | Secuencial, con inserción rápida en extremos | Igual que tu `Nodo` a mano |

## Funcionalidades / métodos clave por estructura
| Estructura | Métodos principales |
|---|---|
| `ArrayList` | `.add()`, `.get(i)`, `.remove(i)`, `.size()`, `.contains()` |
| `LinkedList` | `.add()`, `.addFirst()`, `.addLast()`, `.removeFirst()`, `.removeLast()` |
| `Stack` | `.push()`, `.pop()`, `.peek()`, `.isEmpty()` |
| `Queue` | `.add()`, `.poll()`, `.peek()`, `.isEmpty()` |

## Cómo podría aparecer en el parcial
- Elegir qué estructura conviene usar según el problema (¿necesito acceso aleatorio? → `ArrayList`. ¿Necesito procesar en orden de llegada? → `Queue`. ¿Necesito deshacer la última acción? → `Stack`).
- Ejercicios de simulación: verificar paréntesis balanceados con una `Stack`, simular una cola de atención con `Queue`.

## <span style="color:#c62828">Errores comunes a evitar</span>
- Usar tipos primitivos directamente en el genérico (`ArrayList<int>` no compila — tiene que ser `ArrayList<Integer>`).
- Confundir `.remove(int index)` con `.remove(Object o)` en `ArrayList` — con `Integer`, `.remove(1)` borra el índice 1, no el valor 1 (para borrar por valor hay que usar `.remove(Integer.valueOf(1))`).
- Olvidar que `Stack` y `Queue` tienen un orden de salida FIJO — no se puede "espiar" ni sacar del medio como con un `ArrayList`.
