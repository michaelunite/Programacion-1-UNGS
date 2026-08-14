# <span style="color:#0d47a1">POO: Objetos, Clases e Invariante de Representación (Semanas 3-6)</span>

> Volver a [[Ruta de Aprendizaje - Programacion 1|Ruta de Aprendizaje]]

## ¿Qué es?
Hasta ahora todo tu código vivía en una sola clase con métodos `static`. Acá aprendés a crear **tus propios tipos de datos**: clases que agrupan datos (atributos) y comportamiento (métodos) en un mismo molde, del cual se pueden crear múltiples copias (objetos/instancias).

## Lo que ya sabés y se reutiliza
- Métodos con parámetros y `return`
- Arrays (ahora vas a tener arrays de objetos, no solo de `int`/`String`)
- Condicionales, loops

## Lo nuevo: sintaxis que nunca usaste

### 1. `class`, atributos de instancia y constructor
```java
public class Punto {
    // ATRIBUTOS DE INSTANCIA: cada objeto Punto tiene SU PROPIA copia de x e y
    double x;
    double y;

    // CONSTRUCTOR: mismo nombre que la clase, sin tipo de retorno.
    // Se ejecuta automáticamente cuando hacés "new Punto(...)"
    public Punto(double x, double y) {
        this.x = x;   // "this.x" es el atributo del objeto; "x" (sin this) es el parámetro
        this.y = y;
    }

    // Constructor "vacío": si no pasan nada, arranca en (0,0)
    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }
}
```

### 2. `new` y referencias
```java
Punto p1 = new Punto(1, 2);   // "new" reserva memoria y devuelve una REFERENCIA a ese objeto
Punto p2 = new Punto();       // usa el constructor vacío -> (0,0)
```
A diferencia de un `int` (que guarda el valor directamente), una variable de tipo objeto guarda una **dirección de memoria** que apunta al objeto real. Esto importa cuando pasás objetos como parámetro: si modificás sus atributos adentro de un método, el cambio se ve afuera también (a diferencia de los primitivos, que se copian).

### 3. Métodos de instancia (sin `static`)
```java
public void imprimir() {
    System.out.println(this.x + " - " + this.y);
}

public void desplazar(double dx, double dy) {
    this.x += dx;
    this.y += dy;
}
```
Se llaman así: `p1.imprimir();` — sin pasar `x` e `y` como parámetro, porque el método ya tiene acceso al `x` e `y` del objeto que lo llamó (`this`).

**`static` vs. instancia — la pregunta clave**: ¿el método necesita datos particulares de un objeto para funcionar? Si sí → método de instancia. Si es una operación general que no depende de ningún objeto en particular (ej: `Punto.distancia(p1, p2)`, que usa DOS puntos pasados como parámetro) → puede seguir siendo `static`.

```java
public static double distancia(Punto p1, Punto p2) {
    return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
}
// Se llama así, sobre la CLASE, no sobre un objeto: Punto.distancia(p1, p2);
```

### 4. Visibilidad: `public` / `private`
Controla quién puede acceder a un atributo o método desde afuera de la clase.
```java
public class CuentaBancaria {
    private double saldo; // nadie de afuera puede tocar "saldo" directamente

    public double consultarSaldo() { // esta SÍ es la puerta de entrada autorizada
        return saldo;
    }
}
```
Esto se conecta directo con el invariante de representación: si dejás todo `public`, cualquiera puede poner el objeto en un estado inválido desde afuera sin pasar por tus validaciones.

## Composición de objetos (arreglos de objetos)
Esto es lo que **más puntaje vale en los parciales** (30-35 pts). Una clase que contiene *arrays de otras clases*, que a su vez pueden contener más objetos adentro:

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
    String estado;
}
```

Para trabajar con esto se **recorre en cadena** — un `for` adentro de otro `for`, pero en vez de números, cada paso es "entrar" a un objeto distinto:

```java
public int contarPedidosPendientes(EmpresaDeRepartos empresa) {
    int cont = 0;
    for (int i = 0; i < empresa.repartidores.length; i++) {
        Repartidor r = empresa.repartidores[i];
        for (int j = 0; j < r.pedidosAsignados.length; j++) {
            if (r.pedidosAsignados[j].estado.equals("pendiente")) {
                cont++;
            }
        }
    }
    return cont;
}
```
Es exactamente la misma lógica que ya dominás con arrays multidimensionales — la diferencia es que en vez de `matriz[i][j]` (un número), tenés `repartidores[i].pedidosAsignados[j]` (un objeto completo del que después podés leer atributos o llamar métodos).

## Invariante de Representación
Es la condición (o conjunto de condiciones) que **siempre** debe cumplirse para que un objeto de una clase esté en un estado válido — nunca, bajo ninguna circunstancia, puede romperse. Es una de las 4 instancias de evaluación obligatorias de la cátedra.

> **Ejemplo real de parcial**: un `Pedido` tiene hora en que el cliente lo hizo y hora en que salió de la empresa.
> ✅ **Invariante correcto**: `horaSalida >= horaPedido` — es una regla física que no puede violarse nunca.
> ❌ **NO es invariante**: "el arreglo de pedidos está ordenado según fueron solicitados" — esto *podría* ser cierto en un caso particular, pero no es algo que el sistema deba garantizar siempre.

**Cómo reconocer un invariante real**: preguntate "¿esto tiene que ser verdad SIEMPRE, para CUALQUIER objeto válido de esta clase, sin excepción?" Si la respuesta depende del caso, no es invariante.

```java
public class Fecha {
    int dia, mes, anio;
    // INVARIANTE: 1 <= mes <= 12  &&  1 <= dia <= diasDelMes(mes, anio)
}

public class Fraccion {
    int numerador, denominador;
    // INVARIANTE: denominador != 0
}
```

## Funcionalidades / palabras clave nuevas
| Palabra clave | Qué hace |
|---|---|
| `class` | Define un nuevo tipo de dato propio |
| `new` | Crea (instancia) un objeto en memoria |
| `this` | Se refiere "al objeto actual" — distingue atributo de parámetro con el mismo nombre |
| Constructor | Método especial que inicializa el objeto al crearlo con `new` |
| `public` / `private` | Visibilidad: quién puede acceder desde afuera |
| Método de instancia (sin `static`) | Opera sobre los datos DEL objeto que lo llama |

## Cómo podría aparecer en el parcial
- Ejercicio de mayor puntaje: dado un diagrama de clases (varias clases relacionadas por composición), escribir 2-3 métodos que recorran esa estructura y calculen/busquen algo.
- Cuestionario aparte sobre invariante de representación: dada una clase, identificar cuál de varias afirmaciones ES un invariante y cuál no.

## <span style="color:#c62828">Errores comunes a evitar</span>
- Olvidarse de `this` cuando el parámetro se llama igual que el atributo (`x = x` no hace nada útil; tiene que ser `this.x = x`).
- Confundir método `static` con uno de instancia — si el método necesita `this` para algo, no puede ser `static`.
- Al recorrer composición de objetos, hacer `objeto.array.length` en vez de `objeto.array[i].length` (o viceversa) — prestar atención a en qué nivel de anidamiento estás parado.
