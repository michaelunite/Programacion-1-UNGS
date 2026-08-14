# <span style="color:#0d47a1">🗺️ Ruta de Aprendizaje — Programación I</span>

> Nota viva: cada vez que cerremos un tema, tildá el checkbox correspondiente (click en el `[ ]` lo convierte en `[x]`) y completá la sección **"Para mejorar"** con lo que te haya costado. Así esta nota queda como tu propio historial de progreso a lo largo de la cursada.
>
> Basado en: tus apuntes en `APUNTES/`, tus ejercicios resueltos en `EJERCICIOS/`, tu repo viejo de práctica, los parciales/parcialitos reales en `MODELOS DE PARCIALES/` y `PDF-PRACTICAS/`, el **programa oficial de la cátedra** (Dra. Verónica Moyano, UNGS, 2do sem. 2022) y el **cronograma semanal** de la materia.
>
> Cada tema tiene su desarrollo completo (ejemplos de código, sintaxis nueva, funcionalidades) en la carpeta [[Temas Detallados]].

---

## <span style="color:#0d47a1">📅 Cronograma oficial (16 semanas)</span>

| Semanas | Tema | Detalle | Nota completa |
|---|---|---|---|
| 1 | Introducción a Java | Java y Eclipse, variables, tipos, funciones, strings y arreglos | Ver [[APUNTES]] existentes |
| 2 a 3 | Funciones recursivas | Recursión básica, con enteros, con strings, con funciones auxiliares | [[01 - Recursion]] |
| 3 a 6 | Introducción a POO | Objetos, referencias, clases propias, **invariante de representación**, arreglos de objetos | [[02 - POO - Objetos y Clases]] |
| 7 a 8 | Complejidad algorítmica y ordenamiento | Complejidad computacional, algoritmos de búsqueda, algoritmos de ordenamiento | [[03 - Complejidad y Ordenamiento]] |
| 9 a 11 | Listas enlazadas | **Trabajo Práctico** (se asigna acá), listas enlazadas, iteración, listas doblemente enlazadas | [[04 - Listas Enlazadas]] |
| 12 | Tipos Abstractos de Datos | TAD, `LinkedList`, `ArrayList`, Pila, Cola | [[05 - Tipos Abstractos de Datos]] |
| 13 a 16 | Parcial y cierre | Coloquio del TP, parcial, recuperatorio, cierre de notas | — |

> ⚠️ El programa oficial menciona además Conjunto, Diccionario, Árbol binario balanceado y Tabla de Hash (Unidad 4), pero el cronograma semanal real de este cuatrimestre solo llega hasta `LinkedList`/`ArrayList`/Pila/Cola en la semana 12. Es decir, esos temas más avanzados **probablemente no se dan a fondo este cuatrimestre** — no te generes ansiedad extra por ellos todavía.

### Régimen de aprobación (de la cátedra)
Para regularizar hay que aprobar 4 instancias:
- (a) Cuestionario corto sobre **Invariante de representación** (sin nota)
- (b) Cuestionario corto sobre **Complejidad computacional** (sin nota)
- (c) **Trabajo práctico integrador** en grupos (con nota)
- (d) **Examen parcial** o su recuperatorio (con nota)

La nota final sale de promediar (c) y (d). Si el promedio es ≥7 y cada nota es ≥6, se aprueba directo. Si el promedio es ≥4, hay que rendir final (≥4 para aprobar).

### Bibliografía obligatoria
Allen B. Downey — *"Pensando la computación como un Científico (con Java)"* (Editorial UNGS, 2012) — **ya la tenés completa con ejercicios en tu repo**, en `Ejercicios libro - Pensando la computacion como un cientifico/`.

### 📌 Fechas 2026 y análisis de parciales
- **Primer Parcial**: 30/09/2026 — Teoría, Recursión, Invariante de Representación, Objetos 1
- **TP**: Presentación 05/10/2026 · Entrega y Coloquio 26/10/2026
- **Segundo Parcial**: 11/11/2026 — Teoría, Objetos 2, Complejidad, Listas

Comparación cruzada completa de los 5 modelos reales de parcial (qué temas se repiten más, qué podría "sorprender") en [[Fechas y Analisis Cruzado de Parciales 2026]].

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

### ¿Qué son y cómo funcionan?
Ver los apuntes ya existentes: [[variables Y constante - APUNTES]], [[Tipos De Datos Primitivos_apuntes]], [[ConversionDeDatos_apuntes]], [[OperadoresLogicos_apuntes]], [[Condicionales_apuntes]], [[Arrayss_apuntes]].

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
Un método es una "caja": entran datos (parámetros), pasa algo adentro, y opcionalmente sale un resultado (`return`). Ya los venís usando sin saberlo en tus ejercicios:

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

## <span style="color:#ef6c00">🔜 ETAPA 3 — Recursión</span> · semanas 2-3 · [[01 - Recursion|ver desarrollo completo]]

- [ ] Recursión sobre enteros (factorial, sumatorias, potencia)
- [ ] Recursión sobre Strings usando función auxiliar `resto(String s)`
- [ ] Identificar siempre **caso base** antes que caso recursivo
- [ ] Dibujar la pila de llamadas a mano antes de programar

### ¿Qué es y cómo funciona?
Un método recursivo es un método que se llama a sí mismo con un problema "más chico" cada vez, hasta llegar a un **caso base** que corta la recursión. En los parciales aparece un patrón fijo: te dan gratis una función `resto(String s)` que devuelve el string sin el primer carácter, y tenés que armar la recursión sobre eso. Desarrollo completo con más ejemplos en [[01 - Recursion]].

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#ef6c00">🔜 ETAPA 4 — POO: Clases y Composición de Objetos</span> · semanas 3-6 · [[02 - POO - Objetos y Clases|ver desarrollo completo]]

- [ ] Crear clases propias con atributos y constructor
- [ ] Diferenciar método de instancia vs. `static`
- [ ] Composición: una clase que contiene arrays de otra clase
- [ ] Recorrer estructuras de objetos anidados (objeto → array de objetos → array de objetos)

### ¿Qué es y cómo funciona?
Una clase es un molde: define **atributos** (el estado) y **métodos** (el comportamiento). La composición es cuando una clase contiene *otros objetos* adentro — y en los parciales esto es lo que más puntaje vale (30-35 pts sobre 100). Sintaxis nueva (`class`, `new`, `this`, constructores) y ejemplos completos en [[02 - POO - Objetos y Clases]].

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#ef6c00">🔜 ETAPA 5 — Invariante de Representación</span> · dentro de semanas 3-6 · [[02 - POO - Objetos y Clases|ver desarrollo completo]]

- [ ] Entender qué es un invariante de representación
- [ ] Distinguir una regla que SIEMPRE debe cumplirse de un dato que simplemente puede ser cierto
- [ ] Escribir invariantes en lenguaje lógico, Java o castellano

### ¿Qué es y cómo funciona?
El invariante de representación es la o las condiciones que **siempre** deben ser verdaderas para que un objeto de una clase esté en un estado válido. No es sobre lo que el objeto *podría* tener, sino sobre lo que *nunca puede romperse*. Es una de las 4 instancias de evaluación obligatorias de la cátedra (cuestionario sin nota). Ejemplos completos en [[02 - POO - Objetos y Clases]].

### <span style="color:#c62828">Para mejorar</span>
_(completar después de practicar)_

---

## <span style="color:#455a64">📅 ETAPA 6 — Complejidad y Ordenamiento</span> · semanas 7-8 · [[03 - Complejidad y Ordenamiento|ver desarrollo completo]]

- [ ] Complejidad algorítmica (notación Big O)
- [ ] Algoritmos de búsqueda: lineal y binaria
- [ ] Algoritmos de ordenamiento: inserción, selección, burbujeo, quicksort, mergesort

### ¿Qué es y cómo funciona? (adelanto)
Mide cómo crece el tiempo de ejecución a medida que crecen los datos. Buscar en un array desordenado es lineal (`O(n)`), búsqueda binaria en uno ordenado es logarítmica (`O(log n)`). Selección es `O(n²)`; MergeSort y Quicksort son más eficientes (`O(n log n)`) pero recursivos. Desarrollo completo con código de cada algoritmo en [[03 - Complejidad y Ordenamiento]].

### <span style="color:#c62828">Para mejorar</span>
_(todavía no iniciado — no aplica)_

---

## <span style="color:#455a64">📅 ETAPA 7 — Listas Enlazadas</span> · semanas 9-11 · [[04 - Listas Enlazadas|ver desarrollo completo]]

- [ ] Nodo autoreferenciado (`Nodo siguiente`)
- [ ] Recorrido con `while` y `null` como fin de lista
- [ ] Inserción y eliminación de nodos
- [ ] Listas doblemente enlazadas
- [ ] Trabajo Práctico integrador (se asigna en esta franja)

### ¿Qué es y cómo funciona? (adelanto)
En vez de un array de tamaño fijo, cada elemento ("nodo") tiene un dato y una referencia al "siguiente" nodo. El último nodo apunta a `null`. Es la sintaxis más nueva de toda la materia hasta acá: una clase que se contiene a sí misma. Desarrollo completo en [[04 - Listas Enlazadas]].

### <span style="color:#c62828">Para mejorar</span>
_(todavía no iniciado — no aplica)_

---

## <span style="color:#455a64">📅 ETAPA 8 — Tipos Abstractos de Datos</span> · semana 12 · [[05 - Tipos Abstractos de Datos|ver desarrollo completo]]

- [ ] Concepto de TAD (Tipo Abstracto de Datos)
- [ ] `LinkedList` y `ArrayList` de `java.util`
- [ ] Pila (Stack) y Cola (Queue)
- [ ] Genéricos (`<Tipo>`)

### ¿Qué es y cómo funciona? (adelanto)
Acá dejás de programar tus propias listas a mano y empezás a usar las colecciones que ya trae Java, con genéricos. Desarrollo completo en [[05 - Tipos Abstractos de Datos]].

### <span style="color:#c62828">Para mejorar</span>
_(todavía no iniciado — no aplica)_

---

## <span style="color:#1565c0">📌 Cómo usar esta nota</span>
- Tildá el `[ ]` → `[x]` en Obsidian con un click cuando cerremos un tema.
- Completá la sección "Para mejorar" de cada etapa apenas detectemos un error recurrente (igual que hicimos con el off-by-one y el `maximo=0`).
- El orden de las etapas sigue el cronograma real de la cátedra semana a semana.
- Cada etapa desde la 3 en adelante tiene su propio archivo detallado en [[Temas Detallados]] con ejemplos de código explicados línea por línea, sintaxis nueva vs. reutilizada, y cómo podría aparecer en el parcial.
- El desglose de fechas 2026 y el análisis cruzado de qué temas se repiten en los parciales reales está en [[Fechas y Analisis Cruzado de Parciales 2026]].
