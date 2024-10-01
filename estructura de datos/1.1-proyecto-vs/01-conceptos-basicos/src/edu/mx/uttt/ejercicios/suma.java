package edu.mx.uttt.ejercicios;

import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la cantidad " + i + ": ");
            double cantidad = scanner.nextDouble();
            suma += cantidad;
        }

        System.out.println("La suma total es: " + suma);
    }
}
