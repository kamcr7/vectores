package edu.mx.uttt.ejercicios;
import java.util.Scanner;

public class pesoPersonas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ninos = 0, jovenes = 0, adultos = 0, viejos = 0;
        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;

        System.out.print("Ingrese el número de personas a muestrear: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            double peso = scanner.nextDouble();

            // Clasificación de las personas según la tabla proporcionada
            if (edad >= 0 && edad <= 12) {
                sumaNinos += peso;
                ninos++;
            } else if (edad >= 13 && edad <= 29) {
                sumaJovenes += peso;
                jovenes++;
            } else if (edad >= 30 && edad <= 59) {
                sumaAdultos += peso;
                adultos++;
            } else if (edad >= 60) {
                sumaViejos += peso;
                viejos++;
            }
        }

        // Cálculo de los promedios de cada categoría
        System.out.println("Promedio de peso de niños: " + (ninos > 0 ? sumaNinos / ninos : 0));
        System.out.println("Promedio de peso de jóvenes: " + (jovenes > 0 ? sumaJovenes / jovenes : 0));
        System.out.println("Promedio de peso de adultos: " + (adultos > 0 ? sumaAdultos / adultos : 0));
        System.out.println("Promedio de peso de viejos: " + (viejos > 0 ? sumaViejos / viejos : 0));
    }

}
