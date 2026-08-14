# <span style="color:#0d47a1">🗺️ Ruta de Aprendizaje — Programación I</span>

> Nota viva: cada vez que cerremos un tema, tildá el checkbox correspondiente y completá la sección "Para mejorar" con lo que te haya costado. Así esta nota queda como tu propio historial de progreso.

---

## <span style="color:#2e7d32">✅ ETAPA 1 — Fundamentos (ya cubierta)</span>

- [x] Variables y constantes (`int`, `double`, `String`, `var`, `final`)
- [x] Tipos de datos primitivos (`int`, `double`, `boolean`, `char`)
- [x] Casting / Conversión de datos
- [x] Operadores lógicos y relacionales (`&&`, `||`, `!`, `==`, `>`, etc.)
- [x] Strings básicos (`.length()`, `.charAt()`)
- [x] Condicionales (`if / else if / else`)
- [x] Arrays simples y multidimensionales
- [x] Loops (`for`)

**¿Qué son y cómo funcionan?** Ver los apuntes ya existentes: [[variables Y constante - APUNTES]], [[Tipos De Datos Primitivos_apuntes]], [[ConversionDeDatos_apuntes]], [[OperadoresLogicos_apuntes]], [[Condicionales_apuntes]], [[Arrayss_apuntes]].

### <span style="color:#c62828">Para mejorar</span>
- Off-by-one: arrancar loops en `i=0` cuando el enunciado pide desde el primer elemento, no en `i=1` (a menos que el problema lo pida explícitamente).
- Inicializar `maximo`/`minimo` siempre con `numeros[0]`, nunca con `0` — falla con arrays de solo negativos.
- Evitar `l` como nombre de variable de loop (se confunde con `1`). Usar `i`, `j`, `k`.

---

## <span style="color:#ef6c00">🔜 ETAPA 2 — Métodos (funciones)</span>

- [ ] Declarar métodos `static` con parámetros y tipo de retorno
- [ ] Diferenciar `void` (no devuelve nada) de métodos que sí devuelven un valor
- [ ] Entender el *scope* de variables dentro de un método
- [ ] Combinar métodos con arrays y loops (pasar arrays como parámetro)

### ¿Qué es y cómo funciona?
Un método es una "caja": entran datos (parámetros), pasa algo adentro, y opcionalmente sale un resultado (`return`). Ya los venís usando sin saberlo en tus ejercicios del repo:

```java
static int maximo(int[] numeros) {
    int max = numeros[0];
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] > max) {
            max = numeros[i];
        }
    }
    return max;
}
```

- `static`: el método pertenece a la clase, no a un objeto (todavía no viste objetos, por eso todo es `static`).
- `int` antes del nombre: el tipo de dato que va a devolver.
- `return`: corta la ejecución del método y entrega ese valor a quien lo llamó.

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#ef6c00">🔜 ETAPA 3 — Recursión</span>

- [ ] Recursión sobre enteros (factorial, sumatorias, potencia)
- [ ] Recursión sobre Strings usando función auxiliar `resto(String s)`
- [ ] Identificar siempre **caso base** antes que caso recursivo
- [ ] Dibujar la pila de llamadas a mano antes de programar

### ¿Qué es y cómo funciona?
Un método recursivo es un método que se llama a sí mismo con un problema "más chico" cada vez, hasta llegar a un **caso base** que corta la recursión. En los parciales aparece un patrón fijo: te dan gratis una función `resto(String s)` que devuelve el string sin el primer carácter, y tenés que armar la recursión sobre eso:

```java
// resto("hola") devuelve "ola"
static String resto(String s) {
    return s.substring(1);
}

// Ejemplo: contar cuántas veces aparece un carácter en un string
static int contar(String s, char c) {
    if (s.length() == 0) {
        return 0; // caso base
    }
    if (s.charAt(0) == c) {
        return 1 + contar(resto(s), c); // caso recursivo
    }
    return contar(resto(s), c);
}
```

**Truco para no perderte**: preguntate siempre "¿cuál es el caso más chico posible que puedo resolver sin llamar de nuevo a la función?" (string vacío, n=0, etc.) — ese es tu caso base.

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#ef6c00">🔜 ETAPA 4 — POO: Clases y Composición de Objetos</span>

- [ ] Crear clases propias con atributos y constructor
- [ ] Diferenciar método de instancia vs. `static`
- [ ] Composición: una clase que contiene arrays de otra clase
- [ ] Recorrer estructuras de objetos anidados (objeto → array de objetos → array de objetos)

### ¿Qué es y cómo funciona?
Una clase es un molde: define **atributos** (el estado) y **métodos** (el comportamiento). La composición es cuando una clase contiene *otros objetos* adentro — y en los parciales esto es lo que más puntaje vale. Ejemplo real de un parcial:

```java
public class EmpresaDeRepartos {
    Repartidor[] repartidores;
}

public class Repartidor {
    String nombre;
    String zona;
    Vehiculo vehiculo;
    Pedido[] pedidosAsignados;
}

public class Pedido {
    String codigo;
    Paquete[] paquetes;
    Cliente cliente;
    String estado; // "pendiente", "en camino", "entregado"
}
```

Para trabajar con esto, tenés que recorrer en cadena: por cada `Repartidor`, recorrer su array de `Pedido`, y por cada `Pedido`, recorrer su array de `Paquete`. Es "arrays dentro de arrays", pero con objetos en vez de números — el mismo tipo de lógica que ya dominás con arrays multidimensionales, aplicada a objetos.

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#ef6c00">🔜 ETAPA 5 — Invariante de Representación</span>

- [ ] Entender qué es un invariante de representación
- [ ] Distinguir una regla que SIEMPRE debe cumplirse de un dato que simplemente puede ser cierto
- [ ] Escribir invariantes en lenguaje lógico, Java o castellano

### ¿Qué es y cómo funciona?
El invariante de representación es la o las condiciones que **siempre** deben ser verdaderas para que un objeto de una clase esté en un estado válido. No es sobre lo que el objeto *podría* tener, sino sobre lo que *nunca puede romperse*. Ejemplo real de un parcial:

> Un `Pedido` tiene hora en que el cliente lo hizo y hora en que salió de la empresa.
> **Invariante correcto**: la hora de salida siempre es posterior (o igual) a la hora en que se hizo el pedido — esto es una regla física que no puede violarse nunca.
> **NO es invariante**: "el arreglo de pedidos está ordenado según fueron solicitados por los clientes" — esto podría ser cierto en un caso particular, pero no es una regla que el sistema *deba* garantizar siempre.

En Java, un invariante se suele expresar como una condición booleana que, si la escribieras como método, siempre debería devolver `true` para cualquier objeto válido:

```java
// Invariante: horaSalida >= horaPedido
```

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#455a64">📅 ETAPA 6 — Estructuras avanzadas (más adelante en la cursada)</span>

- [ ] Listas simplemente enlazadas (nodos, recorrido, `null` como fin de lista)
- [ ] Complejidad algorítmica (notación Big O, intuición de "cuánto crece" un algoritmo)
- [ ] Algoritmos de ordenamiento: Selección vs. MergeSort (y por qué uno es más eficiente)
- [ ] Búsqueda binaria (y por qué requiere array ordenado)

### ¿Qué es y cómo funciona? (adelanto)
- **Lista enlazada**: en vez de un array de tamaño fijo, cada elemento ("nodo") tiene un dato y una referencia al "siguiente" nodo. El último nodo apunta a `null`.
- **Complejidad**: mide cómo crece el tiempo de ejecución a medida que crecen los datos. Por ejemplo, buscar en un array desordenado es lineal (`O(n)`), pero búsqueda binaria en uno ordenado es logarítmica (`O(log n)`) — mucho más rápida cuando hay muchos datos.
- **MergeSort vs. Selección**: Selección es más simple pero más lento (`O(n²)`); MergeSort es más complejo de escribir pero mucho más rápido (`O(n log n)`) con muchos datos.

### <span style="color:#c62828">Para mejorar</span>
_(todavía no iniciado — no aplica)_

---

## <span style="color:#1565c0">📌 Cómo usar esta nota</span>
- Tildá el `[ ]` → `[x]` en Obsidian con un click cuando cerremos un tema.
- Completá la sección "Para mejorar" de cada etapa apenas detectemos un error recurrente (igual que hicimos con el off-by-one y el `maximo=0`).
- El orden de las etapas es el orden recomendado — no es obligatorio pero sí lo más lógico según cómo se construye cada tema sobre el anterior.
