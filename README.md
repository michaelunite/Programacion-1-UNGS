# 📘 Programación I – UNGS

Repositorio de estudio, ejercicios resueltos y apuntes personales de la materia **Programación I** (Universidad Nacional de General Sarmiento), dictada por la Dra. Verónica Moyano.

La idea de este repo es doble:

1. **Servir como mi propio "segundo cerebro"** de la cursada: ejercicios, apuntes, código de práctica y modelos de parciales, todo organizado y versionado.
2. **Ser una guía de referencia para otros estudiantes** que estén cursando (o vayan a cursar) Programación I en la UNGS, o cualquier materia introductoria de programación con un enfoque similar (Java, desde cero, con enfoque en fundamentos + recursión + OOP básico).

> ⚠️ **Importante:** este repo contiene resoluciones propias de ejercicios de práctica y modelos de parciales de años anteriores. **No reemplaza cursar la materia, ir a clase ni hacer el trabajo propio.** Está pensado como material de apoyo y consulta, no para copiar y entregar como si fuera tuyo. Usalo para practicar, comparar tu lógica con otra, y entender el *por qué* de las soluciones.

---

## 🗺️ ¿Qué temas cubre la materia (y este repo)?

Programación I se puede pensar como un recorrido en 8 grandes etapas. Este repo sigue ese mismo orden:

| # | Tema | Qué vas a encontrar |
|---|------|----------------------|
| 1 | **Fundamentos** | Variables, constantes, tipos de datos primitivos, conversión de datos (casting), condicionales, operadores lógicos, arrays (simples y multidimensionales) |
| 2 | **Métodos / Funciones** | Métodos estáticos, parámetros, retorno de valores, separación de responsabilidades |
| 3 | **Recursión** | Casos base, traza de la pila de llamadas, recursión sobre enteros, sobre Strings (patrón `resto(String s)`) y sobre arrays |
| 4 | **Programación Orientada a Objetos (OOP)** | Clases, constructores, atributos de instancia, `this`, composición de objetos, arrays de objetos |
| 5 | **Invariante de representación** | Validación del estado interno de un objeto |
| 6 | **Complejidad algorítmica y ordenamiento** | Selección, Burbujeo, Quicksort, Mergesort, búsqueda binaria |
| 7 | **Listas enlazadas** | Clase `Nodo` autorreferenciada |
| 8 | **Tipos de Datos Abstractos (TDA)** | Colecciones de Java: `ArrayList`, `LinkedList`, `Stack`, `Queue`, genéricos |

Este orden refleja el cronograma real de la cursada (no todos los temas del programa oficial llegan a darse en profundidad — por ejemplo, Sets, Diccionarios, árboles balanceados o hashing suelen quedar fuera del semestre).

### 📝 Sobre las evaluaciones de la materia

La cursada tiene 4 instancias de evaluación:
- 2 quizzes cortos sin nota (invariante de representación, complejidad computacional)
- 1 trabajo práctico integrador grupal (con nota)
- 1 parcial escrito o su recuperatorio (con nota)

La nota final surge del promedio de las dos últimas instancias.

---

## 📂 Estructura del repositorio

```
programacion-1-ungs/
│
├── APUNTES/                          # Notas de teoría (formato Obsidian)
│   ├── CODIGOS/                      # Código "limpio" y comentado de cada tema
│   └── Indice_apuntes.md             # Punto de entrada a todos los apuntes
│
├── EJERCICIOS/                       # Ejercicios sueltos (.java) fuera de las prácticas
│
├── MODELOS DE PARCIALES/             # Parciales reales de años anteriores (2023, 2025) + invariante
│
├── PDF-PRACTICAS/                    # Guías de práctica en PDF (ej. Práctica 0)
│
├── Ruta de Aprendizaje/              # Roadmap de la materia (el resumen de la tabla de arriba)
│
├── Temas Detallados/                 # Desarrollo más profundo de temas puntuales
│
├── practica0/                        # Resolución completa de la Práctica 0
├── Programacion I/
│   ├── Practica 0/
│   ├── Practica 1/                   # Introducción a OOP (Fraccion, Punto, Fecha)
│   └── EjerciciosDePractica/         # Recursión sobre Strings y Arrays
│
├── Ejercicio para practicar - Recursión Enteros/
├── Ejercicio para practicar - Recursión Strings/
├── Ejercicio para practicar - Recursión Parcial/
├── Ejercicios para practicar - Strings/
├── Ejercicios para practicar - Arrays/
│
├── Ejercicios libro - Pensando la computación como un científico/
│                                      # Ejercicios del libro de cátedra, por capítulo
│
└── src/                              # Ejercicios varios de práctica libre
```

> 💡 Los apuntes en `APUNTES/` están escritos para usarse con **[Obsidian](https://obsidian.md/)**, aprovechando los enlaces internos `[[archivo]]` entre la teoría y su código correspondiente. No es obligatorio usar Obsidian para leerlos (son Markdown normal), pero la experiencia completa —con el grafo de conexiones entre temas— se disfruta mucho más ahí.

---

## 🚀 Cómo usar este repo (clonarlo paso a paso)

### 1. Requisitos previos

- **Git** instalado ([descargar acá](https://git-scm.com/downloads))
- **JDK 17 o superior** instalado ([descargar acá](https://www.oracle.com/java/technologies/downloads/))
- Un IDE de Java: **IntelliJ IDEA** (recomendado, es el que uso yo) o **Eclipse**
- *(Opcional pero recomendado)* **[Obsidian](https://obsidian.md/)**, gratuito, para leer los apuntes con todo su formato y enlaces

### 2. Clonar el repositorio

Abrí una terminal y ejecutá:

```bash
git clone https://github.com/<michaelunite>/programacion-1-ungs.git
cd programacion-1-ungs
```

> Reemplazá `<tu-usuario>` por el usuario/organización real donde publiques el repo en GitHub.

### 3. Abrir el código Java

**Con IntelliJ IDEA:**
1. `File` → `Open...`
2. Seleccioná la carpeta del repo clonado
3. IntelliJ debería reconocer el módulo automáticamente (el repo ya incluye el archivo `.iml`)
4. Buscá el ejercicio que te interese en el árbol de carpetas y corré su `main` con el botón ▶️

**Con Eclipse:**
1. `File` → `Open Projects from File System...`
2. Seleccioná la carpeta correspondiente (algunas subcarpetas como las de "Ejercicios libro" ya son proyectos Eclipse independientes, con su `.project` y `.classpath`)
3. Ejecutá la clase con el método `main` que quieras probar

**Por línea de comandos (sin IDE):**
```bash
cd src
javac NombreDelEjercicio.java
java NombreDelEjercicio
```

### 4. Abrir los apuntes en Obsidian

1. Abrí Obsidian
2. `Open folder as vault`
3. Seleccioná la carpeta `APUNTES/` (o la raíz del repo, si querés tener todo junto)
4. Empezá por `Indice_apuntes.md` — desde ahí vas a poder navegar todos los temas por enlaces internos

---

## 🧭 ¿Por dónde empezar si sos nuevo en la materia?

Si recién arrancás Programación I, te recomiendo este orden de lectura:

1. Leé `Ruta de Aprendizaje/` para tener el panorama completo
2. Andá a `APUNTES/Indice_apuntes.md` y repasá fundamentos (variables, condicionales, arrays)
3. Practicá con los ejercicios de `practica0/` y `Programacion I/Practica 0/`
4. Cuando llegues a recursión, mirá primero la función auxiliar `resto(String s)` — aparece en casi todos los ejercicios de recursión sobre Strings y es clave para el parcial
5. Antes del parcial, revisá `MODELOS DE PARCIALES/` con los exámenes reales de años anteriores

---

## 🤝 Contribuciones

Este es principalmente un repositorio de estudio personal, pero si sos estudiante de la misma materia y encontrás un error en algún ejercicio, o querés aportar una resolución alternativa bien explicada, ¡son bienvenidos los Pull Requests o Issues!

## ⚖️ Licencia y uso

Este material se comparte con fines **educativos**. Si sos docente de la materia y considerás que algún contenido no debería estar público (por ejemplo, algún modelo de parcial), escribime y lo resuelvo sin problema.

---

*Hecho con 💻 y mucho café durante la cursada de Programación I – UNGS.*
