package EJERCICIOS;

import java.util.Arrays;

public class RefuezosDeEjerciciosComplejos {
    public static void main(String[] args){

        //Nivel 1 — Llenar matrices con distintas lógicas

        //Ejercicio 1: Matriz de multiplicar
        //Objetivo: Crear int[][] tabla = new int[5][5]; donde cada posición [i][j] contenga el resultado de (i+1) * (j+1) (así la fila 0 columna 0 da como resultado la tabla del 1, no del 0). Imprimir con Arrays.deepToString().
        //Por qué te sirve: practicar el llenado con una fórmula donde fila y columna NO son intercambiables (a diferencia de fila+columna, acá fila*columna también daría lo mismo... probá primero con una fórmula asimétrica real más adelante, en el ejercicio 3).

        int[][] tabla = new int[5][5];

        // creemos el primer for donde va a recorrer las filas
        for (int i = 0 ; i<tabla.length ; i++){

            // creo el segundo for donde recorrera los datos dentro de la primero fila

            for (int j = 0 ; j<tabla[i].length ; j++){

                // creo el dato que va a guardar cada posocion
                tabla[i][j]= (i+1)*(j+1);
            }

        }
        // imprimemos el arrays completo con sus nuevos datos
        System.out.println(Arrays.deepToString(tabla));


        // Ejercicio 2: Matriz identidad

        //Objetivo: Crear int[][] identidad = new int[4][4]; donde la diagonal principal (posiciones donde fila == columna) tenga 1, y el resto tenga 0.
        //Por qué te sirve: acá SÍ vas a comparar i con j dentro del loop, pero de forma consciente e intencional (no por error como te pasó antes) — la diferencia es que ahora vos decidís cuándo usar la diagonal, no es un bug accidental.

        int[][] identidad = new int[4][4];

        //creo el primer for donde recorro las filas
        for (int i = 0 ; i<identidad.length ; i++ ){

            // creo el segudno for para recorrer el contenido de las filas
            for (int k = 0 ; k < identidad[i].length ; k++){

                // creo una condicion donde si el valor de "i" y la de "k" son iguales la posicion de identidad[i][k] sea 1 y sino sea 0
                if (i == k){

                    identidad[i][k] = 1;
                }
                else{
                    identidad[i][k] = 0;
                }

            }
        }

        System.out.println(Arrays.deepToString(identidad));


        // 🟡 Nivel 2 — Recorrer y acumular (con dimensiones distintas)
        //Ejercicio 3: Matriz rectangular (no cuadrada)
        //
        //Objetivo: Crear int[][] asientos = new int[3][8]; (3 filas de 8 asientos cada una, como un cine). Llenala con 1 si el asiento está ocupado y 0 si está libre, usando esta regla: el asiento está ocupado si (i+j) % 2 == 0. Después, contá cuántos asientos están libres en total.
        //Por qué te sirve: acá las filas (3) y columnas (8) son números distintos a propósito. Es un error muy común usar matriz.length para todo (incluyendo el loop de columnas) cuando la matriz no es cuadrada — este ejercicio te obliga a ser preciso sobre cuál .length usás en cada loop.

        int[][] asientos = new int[3][8];

        int asientosLibres = 0;

        for (int i = 0 ; i<asientos.length ; i++){

            for (int j = 0 ; j<asientos[i].length ; j++){

                if ((i+j)%2==0){

                    asientos[i][j]=0;
                    asientosLibres+=1;
                }
                else {
                    asientos[i][j]=1;
                }

            }
        }
        System.out.println(Arrays.deepToString(asientos));
        System.out.println("cantidad de asientos libre: "+ asientosLibres);

        // Ejercicio 4: Suma por fila
        //
        //Objetivo: Dada int[][] ventas = {{100, 200, 150}, {300, 50, 400}, {90, 90, 90}}; (3 vendedores, 3 días de ventas), calcular e imprimir la suma de cada fila por separado (o sea, el total de ventas de cada vendedor), con formato: "Vendedor 0: 450", "Vendedor 1: 750", etc.
        //Por qué te sirve: hasta ahora sumaste TODA la matriz en un solo acumulador. Acá el desafío es que el acumulador se reinicia por cada fila, no es uno global para toda la matriz — un patrón distinto que vale la pena distinguir.

        int[][] ventas = {{100, 200, 150}, {300, 50, 400}, {90, 90, 90}};
        int total = 0;

        for (int i = 0 ; i<ventas.length ; i++){
            for (int k = 0 ; k<ventas[i].length ; k++){

                total+=ventas[i][k];
            }
            System.out.println("vendedor " + (i+1) + ": "+ total);
            total=0;

        }

        // 🟠 Nivel 3 — Buscar valores específicos (aplicando lo del máximo, pero en 2D)

        //Ejercicio 5: Buscar el máximo Y su ubicación
        //Objetivo: Dada int[][] notas = {{7, 8, 6}, {9, 5, 10}, {4, 6, 3}}; (3 alumnos, 3 exámenes), encontrar la nota más alta de toda la matriz, y mostrar en qué fila y columna está ubicada (formato: "La nota más alta es 10, del alumno 1, examen 2").
        //Por qué te sirve: es el mismo patrón que ya dominás de "guardar el máximo mientras recorro", pero ahora en 2D necesitás guardar 3 datos relacionados a la vez (el valor máximo, la fila donde está, la columna donde está) y actualizarlos juntos.

        int[][] notas = {{7, 8, 6}, {9, 5, 10}, {4, 6, 3}};
        int nota = 0;
        int alumno = 0;
        int examen = 0;

        for (int i = 0 ; i<notas.length ; i++){
            for (int k = 0 ; k<notas[i].length ; k++){
                if (notas[i][k]>nota){
                    nota=notas[i][k];
                    alumno= i+1;
                    examen= k+1;

                }
            }

        }

        System.out.println("La nota mas alta es " + nota + ", del alumno "+ alumno + ", examen "+ examen);


        // Ejercicio integrador: "Tablero de juego tipo buscaminas simplificado"

        //Objetivo: Tenés int[][] tablero = new int[5][5]; que representa un tablero donde 0 = casilla vacía y 1 = mina. Llenalo a mano con algunas minas puestas por vos (por ejemplo, poné 4 o 5 minas en distintas posiciones). Después:
        //Contá el total de minas en el tablero.
        //Contá cuántas minas hay en cada fila por separado (mismo patrón que el ejercicio 4).
        //Buscá si existe alguna fila completamente vacía (sin ninguna mina) y mostrá cuál es (si hay varias, con la primera que encuentres alcanza).
        //Mostrá el tablero completo con Arrays.deepToString().

        int[][] tablero = new int[5][5];
        tablero[2][1] =1;
        tablero[1][3]= 1;
        tablero[2][4]=1;
        tablero[4][0]=1;
        tablero[4][1]=1;

        int cantidadMinas = 0;
        int filasConMinas = 0;

        for (int i = 0; i<tablero.length ; i++){
            for (int k = 0 ; k<tablero[i].length ; k++){

                if(tablero[i][k]==1){
                    cantidadMinas+=1;
                    filasConMinas+=1;
                }

            }
            if (filasConMinas == 0){
                System.out.println("la fila " + (i+1)  + " esta con " + filasConMinas + " minas");
            }
            else {
                System.out.println("en la fila " + (i + 1) + " hay " + filasConMinas + " minas");
            }
            filasConMinas=0;

        }

        System.out.println(Arrays.deepToString(tablero));
        System.out.println("el total de minas en el tablero es " + cantidadMinas + " minas");


    }
}
