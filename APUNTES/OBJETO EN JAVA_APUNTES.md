# Apuntes: El Objeto en Java

## 1. ¿Qué es un Objeto?

Un objeto es una **instancia concreta** de una clase.

- **La Clase (`Ejercicio4`)**: Es el **plano**, el molde o la receta. Define _qué_ tiene el objeto (atributos) y _qué_ puede hacer (métodos). Por sí sola, la clase no hace nada en la memoria.
- **El Objeto (`sub`)**: Es el **producto real** fabricado a partir del plano. Es una entidad física en la memoria RAM que tiene valores propios y puede ejecutar acciones.

> **Analogía**: La clase es el plano de un coche. El objeto es el coche real que tienes en el garaje. Puedes tener 1, 10 o 100 coches (objetos) hechos del mismo plano (clase).

---

## 2. ¿Cómo se crea? (La Sintaxis)

La creación se hace en una sola línea con 4 partes clave:

java

Copiar

```
TipoDeClase nombreVariable = new TipoDeClase();
```

Desglose con tu ejemplo:

java

Copiar

```
Ejercicio4 sub = new Ejercicio4();
```

1. **`Ejercicio4` (Tipo)**: Le dice al compilador qué "molde" vamos a usar.
2. **`sub` (Referencia)**: Es el nombre que le das a esta copia específica. Es como tu "etiqueta" para llamarlo después.
3. **`new` (Operador)**: Es la orden al sistema operativo: _"¡Reserva memoria para un objeto nuevo!"_. Sin esto, no hay objeto, solo la definición.
4. **`Ejercicio4()` (Constructor)**: Es la "llave de encendido". Ejecuta el código inicial del objeto (como crear el `Scanner` o poner valores por defecto).

---

## 3. ¿Cómo funciona internamente?

Cuando haces `new Ejercicio4()`, ocurre esto en la memoria:

1. **Reserva de Memoria (Heap)**: Java busca espacio libre en la memoria y reserva un bloque para guardar los datos de tu objeto (ej. el valor de `b` y el `Scanner`).
2. **Inicialización**: Ejecuta el constructor. Si en tu clase tienes `Scanner dato = new Scanner(...)`, aquí es cuando realmente se crea ese lector.
3. **Referencia**: La variable `sub` (que vive en la pila o _Stack_) guarda la **dirección de memoria** (la ubicación exacta) donde está el objeto real.

**Visualización:**

`[ Variable 'sub' ]  ----(apunta a)---->  [ Objeto en Memoria ]          |                                      |          |                                      |-- int b = 0          |                                      |-- Scanner dato = ...          |                                      |-- Método subir()`

---

## 4. ¿Por qué es necesario? (La razón de ser)

### A. Separación de Estado

Si no usas objetos y haces todo `static`, todas las variables son compartidas por _todo_ el programa.

- **Con objetos**: Cada objeto tiene su **propio estado**.
    - `sub1.b` puede ser 5.
    - `sub2.b` puede ser 10.
    - No se mezclan.

### B. Reutilización

Puedes crear tantos objetos como necesites sin reescribir código.

java

Copiar

```
Ejercicio4 ascensorOficina = new Ejercicio4();
Ejercicio4 ascensorSótano = new Ejercicio4();
// Ambos son independientes.
```

### C. Encapsulamiento

Permite ocultar detalles internos. El mundo exterior solo sabe que `sub.subir()` funciona, no necesita saber cómo calcula el bucle `for` internamente.

---

## 5. Cuándo y Por qué utilizarlo

|Situación|¿Usar Objeto?|¿Por qué?|
|---|---|---|
|**Simulación de entidades reales** (Ascensores, Usuarios, Productos)|✅ **SÍ**|Porque cada uno tiene su propio estado (piso actual, saldo, precio).|
|**Cálculos matemáticos simples** (Sumar dos números)|❌ **NO**|Mejor usar métodos `static` simples. No necesitas un "objeto matemático".|
|**Programas con múltiples instancias** (Juego con 10 enemigos)|✅ **SÍ**|Necesitas 10 objetos independientes, cada uno con su vida y posición.|
|**Organizar código complejo**|✅ **SÍ**|Divide un problema grande en objetos pequeños que colaboran entre sí.|

---

## 6. Precauciones y Errores Comunes ⚠️

### 1. Olvidar `new`

java

Copiar

```
// ERROR: Esto solo declara una variable vacía, no crea el objeto.
Ejercicio4 sub; 
sub.subir(0); // ¡CRASH! (NullPointerException)
```

**Solución:** Siempre usa `sub = new Ejercicio4();`.

### 2. Confundir Clase con Objeto

java

Copiar

```
// ERROR: No puedes llamar a un método de instancia desde la clase directamente.
Ejercicio4.subir(0); // Solo funciona si subir() es static.
```

**Solución:** Debes usar la instancia: `sub.subir(0);`.

### 3. Crear objetos innecesarios

Crear un objeto solo para usarlo una vez y nunca más puede ser ineficiente si el objeto es muy pesado (ej. una conexión a base de datos).

- _Para tu ejercicio de ascensor:_ Es correcto crearlo en `main`.

### 4. Modificar el estado sin querer

Si pasas un objeto a otro método, ese método puede modificar los datos del objeto original.

java

Copiar

```
void modificarPiso(Ejercicio4 asc) {
    asc.b = 999; // ¡Cuidado! Esto cambia el objeto original 'sub'.
}
```

---

## 7. Resumen de Flujo de Trabajo

1. **Definir la Clase**: Escribir el código con atributos y métodos (`public class Ejercicio4 {...}`).
2. **Punto de Entrada**: En `main`, crear el objeto (`new`).
3. **Interacción**: Usar el nombre de la variable para invocar métodos (`sub.subir()`).
4. **Recuperar Datos**: Guardar los `return` en variables si necesitas usarlos después.

### Ejemplo de uso correcto en tu contexto:

java

Copiar

```
public static void main(String[] args) {
    // 1. Creación (Aquí nace el objeto)
    Ejercicio4 sub = new Ejercicio4(); 
    
    // 2. Uso (El objeto ejecuta su lógica e imprime)
    int pisoLlegada = sub.subir(0); 
    
    // 3. Uso del dato retornado (El objeto ya hizo su trabajo, ahora usamos su resultado)
    System.out.println("Operación finalizada. Llegamos al piso: " + pisoLlegada);
}
```