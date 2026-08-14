# <span style="color:#0d47a1">📅 Fechas 2026 y Análisis Cruzado de Parciales</span>

> Volver a [[Ruta de Aprendizaje - Programacion 1|Ruta de Aprendizaje]]
> Basado en el análisis línea por línea de los 5 modelos reales en `MODELOS DE PARCIALES/`: Parcial 2023, Parcial 2025 (turno tarde, dos partes) y los dos Parcialitos de Invariante 2024 (Tema 1 y Tema 2).

## <span style="color:#c62828">Fechas oficiales</span>

| Instancia                   | Fecha      | Temas según tu cátedra                                            |
| --------------------------- | ---------- | ----------------------------------------------------------------- |
| **Primer Parcial**          | 30/09/2026 | Teoría, Recursión, Invariante de Representación (IREP), Objetos 1 |
| **TP — Presentación**       | 05/10/2026 | —                                                                 |
| **TP — Entrega y Coloquio** | 26/10/2026 | —                                                                 |
| **Segundo Parcial**         | 11/11/2026 | Teoría, Objetos 2, Complejidad, Listas                            |

Esto **encaja casi exacto** con la estructura real que encontré en los modelos: el Parcial 2025 que tenés en dos archivos (`Parcial_Programacion_I_2025.pdf` + `_Parte2.pdf`) es en realidad **un solo examen de 4 ejercicios**, y el ejercicio 4 (Listas + Complejidad con requisito de O(n) explícito) es *casi calcado* de lo que tu Segundo Parcial promete. Es decir, probablemente tu Primer Parcial se parezca a los ejercicios 1-3 de ese modelo, y tu Segundo Parcial incorpore algo como el ejercicio 4.

---

## <span style="color:#0d47a1">Estructura ejercicio por ejercicio (comparando los 3 parciales completos)</span>

### Ejercicio 1 — Teoría V/F (siempre 15 pts, 3 ítems de 5 pts c/u)
Formato fijo en los 2 parciales completos: 3 afirmaciones para justificar verdadero/falso.

**Ejemplos reales que tomaron:**
- *2023*: "Para recorrer una lista simplemente enlazada se debe crear el iterador como copia idéntica del último nodo" (FALSO — se arranca desde la cabeza, no desde el último) / "MergeSort tiene complejidad de orden MENOR a Selección" (VERDADERO — `O(n log n)` < `O(n²)`) / "Búsqueda binaria es logarítmica si el array está ordenado, lineal si no" (la trampa: si no está ordenado, la búsqueda binaria simplemente **no funciona correctamente**, no es que sea "lineal")
- *2025*: "Para redimensionar un array se usa `redimension(int n)`" (FALSO — en Java **no existe** ese método; los arrays son de tamaño fijo, hay que crear uno nuevo y copiar) / operador ternario y si `condicion` devuelve `int` en vez de `boolean` (correcto: **no compila**, es un error de tipos, no una excepción en tiempo de ejecución) / "una lista simplemente enlazada no puede tener más de un nodo con `siguiente == null`" (VERDADERO — solo el último nodo apunta a `null`)

**Patrón clave**: mezclan un ítem de **Listas Enlazadas**, uno de **Complejidad/Ordenamiento**, y uno de **sintaxis básica de Java** (arrays, operadores) que parece "fácil" pero tiene una trampa conceptual.

### Ejercicio 2 — Recursión sobre Strings (20-25 pts)
**Siempre** con la función `resto(String s)` dada gratis, y a veces también `esVocal(char c)`.

- *2023*: `invertirEnSubstring(String s, int p)` — invierte el string a partir de la posición `p`
- *2025*: `cambiarConsonante(String s, char r)` — reemplaza consonantes consecutivas por un carácter dado

**Patrón clave**: no es "recursión pura" aislada — combina recursión con lógica de comparación carácter por carácter (mayúsculas, vocal/consonante, posición) que ya practicaste en la Práctica 0.

### Ejercicio 3 — Composición de objetos (35 pts: 15 + 20)
El de mayor puntaje en los dos exámenes completos. Estructura idéntica: te dan 4-6 clases relacionadas por composición (arrays de objetos dentro de objetos), con dos ítems:
- **Ítem a (15 pts)**: algo más simple — buscar, contar, verificar una condición booleana
- **Ítem b (20 pts)**: algo más elaborado — a veces **devolver una colección** en vez de un valor simple

**Ejemplos reales:**
- *2023*: `Notflix` → `Plan[]` → `Subscriptor[]`, y `Serie` → `Episodio[]`
- *2025*: `EmpresaDeRepartos` → `Repartidor[]` → `Pedido[]` → `Paquete[]`, con:
  - a) `boolean pedidoMismoTipo(String tipo)` — ¿existe un pedido con todos los paquetes del mismo tipo?
  - b) `LinkedList<Vehiculo> vehiculosQueVanLlenos()` — devuelve, **sin repetidos**, los vehículos que usan más del 90% de su capacidad

**⚠️ Dato importante**: el ítem b) de 2025 usa `LinkedList<Vehiculo>` como tipo de retorno — es decir, **mezclan Objetos (composición) con TAD (colecciones de `java.util`)** en un mismo ejercicio. No asumas que cada tema se evalúa por separado y aislado.

### Ejercicio 4 (solo aparece en el modelo 2025, 30 pts: 10 + 20) — Listas propias + Complejidad
Clases `NodoInt`/`ListaInt` (tu propia lista enlazada, no la de Java) con dos métodos:
- a) `double promedioPares()` — recorrer la lista y calcular un promedio de los pares
- b) `ListaInt obtenerMenoresAlPromedioPares()` — devolver una **nueva lista** con ciertos elementos, sin modificar la original

**Requisito extra explícito**: *"Se pide además que los métodos implementados sean de orden lineal, es decir, O(n)... Justificar la complejidad de los mismos."*

**Esto es oro para tu Segundo Parcial**: no solo van a pedirte programar sobre listas enlazadas, sino **justificar por escrito la complejidad** de tu propia solución. Es la combinación literal de "Objetos 2, Complejidad, Listas" que tenés anotada.

### Parcialito de Invariante (aparte, sin nota — cuestionario corto)
Confirmé que hay **2 versiones (Tema 1 y Tema 2)** del mismo parcialito, ambas de 2024, mismo formato en 2 partes:

**Parte 1 — Verdadero/Falso sobre una clase dada** (`Delivery`/`Pedido`, sistema de entregas): 5 afirmaciones para marcar cuáles SÍ son invariante:
- ✅ *Correcto como invariante*: "la hora de salida es más tarde que la hora en que se hizo el pedido" (regla física, siempre debe cumplirse)
- ❌ *NO es invariante*: "el arreglo de pedidos está ordenado según fueron solicitados" (podría pasar, pero no es una regla obligatoria del sistema)
- La trampa repetida en ambos temas: diferenciar una regla **necesaria** de un dato que simplemente **describe un estado posible**.

**Parte 2 — Escribir vos el invariante** para un par de clases nuevas (en 2024: `Premiacion`/`Pelicula` en un Tema, `Partido`/`Entrada` en el otro) — completamente abierto, se puede responder en lenguaje lógico, Java o castellano.

---

## <span style="color:#2e7d32">🏆 Temas que MÁS se repiten (ranking real)</span>

1. **Composición de objetos con arrays de objetos** — aparece en el ejercicio de mayor puntaje en el 100% de los parciales completos que tengo. Es lo más rentable para estudiar a fondo.
2. **Recursión sobre Strings con `resto()` dado** — aparece siempre como Ejercicio 2, mismo formato exacto.
3. **Listas simplemente enlazadas** — aparece tanto en la teoría V/F como en un ejercicio de código completo (2025). Es más central de lo que parece a simple vista.
4. **Invariante de representación** — tiene su propia instancia de evaluación aparte (el "parcialito"), separada del parcial grande.
5. **Complejidad de ordenamiento (Selección vs. MergeSort) y búsqueda binaria** — siempre aparecen como ítems de teoría V/F, no como para programar de cero.

## <span style="color:#c62828">Cosas a tener en cuenta</span>
- **Puntaje mínimo por ejercicio, no solo total**: en ambos parciales completos, para aprobar hace falta 40 pts totales **Y ADEMÁS** un mínimo específico en ciertos ejercicios (10 pts en el de listas/objetos según el año). No alcanza con "salvarte" en uno solo.
- **Se resuelve en tinta**, hoja por ejercicio — como en cualquier examen en papel, prestar atención a la letra clara y no usar rojo.
- **Piden justificar**, no solo responder V/F — en el Ejercicio 1 y en la complejidad del Ejercicio 4, la justificación vale tanto como la respuesta.
- **Casi siempre te dan funciones auxiliares gratis** (`resto()`, `esVocal()`, `equals()`) — no pierdas tiempo reinventándolas, tu trabajo es usarlas bien.

## <span style="color:#ef6c00">🔎 Cosas que parecen "no entrarían" pero SÍ podrían entrar</span>

- **Mezclar TAD (`LinkedList<T>` de Java) dentro de un ejercicio de composición de objetos** — como viste en 2025, no es "o composición o colecciones", pueden pedirte devolver una `LinkedList` como resultado de recorrer una estructura de objetos compuesta. No estudies TAD como un compartimento aislado de POO.
- **Justificar complejidad de un código que VOS escribiste**, no solo de algoritmos clásicos ya dados (Selección, MergeSort) — en 2025 piden explícitamente que tu propia implementación sobre `ListaInt` sea `O(n)` y que lo justifiques.
- **Preguntas de teoría sobre errores de compilación vs. errores en tiempo de ejecución** (el caso del operador ternario con tipo `int` en la condición) — no asumas que la teoría es solo sobre listas/complejidad; también evalúan reglas finas del lenguaje Java en sí.
- **Que la "misma" pregunta de invariante tenga dos variantes (Tema 1 / Tema 2)** con la clase pedida invertida (`Pedido` en un tema, `Delivery` en el otro) — repasar el invariante de **todas** las clases del enunciado, no solo la que "parece" la protagonista.
- **Que un ítem "b" del ejercicio de mayor puntaje pida algo bastante más elaborado que el "a"** (una colección filtrada y sin repetidos, en vez de un booleano simple) — no asumas que dominando la lógica básica de recorrer objetos alcanza; practicá también construir/devolver estructuras nuevas a partir del recorrido.

## <span style="color:#455a64">📌 Cómo estudiar con esto</span>
Dado que **Primer Parcial = Teoría + Recursión + IREP + Objetos 1**, enfocá tu repaso pre-30/09 en: Ejercicio 1 (teoría, con foco en listas y sintaxis básica), Ejercicio 2 (recursión con `resto()`), el parcialito de invariante, y la parte de composición de objetos SIN mezclar todavía TAD/complejidad avanzada.

Para el **Segundo Parcial (11/11) = Teoría + Objetos 2 + Complejidad + Listas**, el modelo 2025 completo es tu mejor simulacro: mezcla composición de objetos con `LinkedList` de Java, y un ejercicio de lista propia con justificación de complejidad explícita.
