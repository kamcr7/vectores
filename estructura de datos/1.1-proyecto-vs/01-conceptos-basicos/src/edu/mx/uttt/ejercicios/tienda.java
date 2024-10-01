package edu.mx.uttt.ejercicios;

import java.util.Scanner;

public class tienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalTienda = 0;
        System.out.print("Ingrese el número de clientes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de las naranjas en kg del cliente " + (i + 1) + ": ");
            double peso = scanner.nextDouble();
            double pago = (peso > 10) ? peso * 0.85 : peso;
            System.out.println("Cliente con " + peso + " kg de naranjas pagará: " + "$" + pago);
            totalTienda += pago;
        }

        System.out.println("Total percibido por la tienda: " + "$" + totalTienda);
    }
}
