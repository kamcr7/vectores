package edu.mx.uttt.ejercicios;

import java.util.Scanner;

public class CalcularCalificacion {

            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos: ");
        int n = scanner.nextInt();
        double[] calificaciones = new double[n];
        double suma = 0;
        double calificacionBaja = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
            if (calificaciones[i] < calificacionBaja) {
                calificacionBaja = calificaciones[i];
            }
        }

        double media = suma / n;
        System.out.println("Calificación media: " + media);
        System.out.println("Calificación más baja: " + calificacionBaja);
    }
}

