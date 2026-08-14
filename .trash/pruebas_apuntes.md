# Apuntes sobre `../TEMAS/pruebas.java`

## 1. ¿Qué hace este programa?

Este programa suma dos números y muestra el resultado en la consola.

- Valor fijo `a = 3`
- Se suma `2`
- Resultado final: `5`

## 2. Código completo

```java
public class pruebas {
    public static void main(String[] args) {
        int a = 3;
        int suma = a + 2;
        System.out.println(suma);
    }
}
```

## 3. Partes del programa

### 3.1 Clase principal

```java
public class pruebas {
    ...
}
```

- `public class pruebas` define una clase de Java llamada `pruebas`.
- En Java, todo el programa está dentro de una clase.

### 3.2 Método principal

```java
public static void main(String[] args) {
    ...
}
```

- `main` es el punto de entrada del programa.
- Cuando ejecutas `java pruebas`, Java comienza aquí.
- `String[] args` puede recibir argumentos desde la línea de comandos, pero en este ejemplo no se usan.

## 4. Explicación línea por línea

### 4.1 `int a = 3;`

```java
int a = 3;
```

- Crea una variable llamada `a`.
- El tipo es `int`, que significa número entero.
- Le asigna el valor `3`.

### 4.2 `int suma = a + 2;`

```java
int suma = a + 2;
```

- Crea una variable llamada `suma`.
- Guarda el resultado de `a + 2`.
- Si `a` es `3`, entonces `suma` será `5`.

### 4.3 `System.out.println(suma);`

```java
System.out.println(suma);
```

- Muestra el valor de `suma` en la consola.
- En este caso imprime `5`.

## 5. Flujo del programa

1. Se inicia la clase `pruebas`.
2. Java ejecuta el método `main`.
3. Se crea la variable `a` con valor `3`.
4. Se calcula `a + 2` y se guarda en `suma`.
5. Se imprime `suma` en la pantalla.

## 6. Resultado esperado

- La salida en consola es:

```text
5
```

## 7. Notas finales

- `int` se usa para números enteros.
- `System.out.println(...)` escribe texto o valores en la consola.
- Este programa no pide datos al usuario; usa valores ya definidos en el código.

