package edu.mx.uttt.ejercicios;

import java.util.Scanner;

public class calcularPromedio {
       
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();
        double[] calificaciones = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / n;
        System.out.println("El promedio del alumno es: " + promedio);
    }
}

