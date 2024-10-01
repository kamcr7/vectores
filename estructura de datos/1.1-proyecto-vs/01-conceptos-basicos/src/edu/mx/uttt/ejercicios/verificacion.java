package edu.mx.uttt.ejercicios;

import java.util.Scanner;

public class verificacion {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] puntos = new double[25];
        double suma = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        for (int i = 0; i < 25; i++) {
            System.out.print("Ingrese los puntos contaminantes del automóvil " + (i + 1) + ": ");
            puntos[i] = scanner.nextDouble();
            suma += puntos[i];
            if (puntos[i] < min) {
                min = puntos[i];
            }
            if (puntos[i] > max) {
                max = puntos[i];
            }
        }

        double promedio = suma / 25;
        System.out.println("Promedio de contaminantes: " + promedio);
        System.out.println("Menor contaminación: " + min);
        System.out.println("Mayor contaminación: " + max);
    }
}
