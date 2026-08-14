package EJERCICIOS.variables_condicionales;

import java.util.Scanner;

public class variablesYcondicionales {
    public static void main(String[] args){

        // Ejercicio 1: Sistema de Aprobación de Materia (Calificación y Asistencia)

        //Una universidad define que para aprobar una materia un estudiante debe cumplir con un mínimo de asistencia y obtener una nota suficiente en sus exámenes.
        //Reglas de negocio:
        //Constantes: * Asistencia mínima requerida: 75 (%).
        //Nota mínima para promocionar: 7.
        //Nota mínima para regularizar (ir a examen final): 4.
        //Variables de entrada:
        //Nombre del alumno (String).
        //Nota final (double).
        //Porcentaje de asistencia (int).
        //Lógica a evaluar:
        //Condición clave: Si la asistencia es menor al 75%, el alumno queda automáticamente en condición de "Libre por Inasistencia" (no importa la nota).
        //Si cumple con la asistencia requerida (>= 75):
        //Si la nota es mayor o igual a 7, la condición es "Promocionado".
        //Si la nota está entre 4 y 6.99 (es decir, >= 4 y < 7), la condición es "Regular (Rinde Final)".
        //Si la nota es menor a 4, la condición es "Desaprobado".


        // primero inicializemos nuestra scanner para poder ingresar los datos

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el nombre del alumno/a");
        String nombreAlumno = scanner.next();

        System.out.println("ingrese la nota del alumno/a");
        double notaFinal = scanner.nextDouble();

        System.out.println("ingrese el porcentaje de asistencia");
        int porcentajeAsistencia = scanner.nextInt();

        if (porcentajeAsistencia>=75){
            if(notaFinal>=7){
                System.out.println("El alumno/a " + nombreAlumno +" promociona");
            }
            else if (notaFinal>=4 && notaFinal<=6.99){
                System.out.println("el alumno/a"+ nombreAlumno+ " rinde final");
            }
            else {
                System.out.println("el alumno/a "+ nombreAlumno+ " desaprueba");
            }
        }
        else {
            System.out.println("el alumno "+ nombreAlumno + " queda libre");
        }



    }
}
