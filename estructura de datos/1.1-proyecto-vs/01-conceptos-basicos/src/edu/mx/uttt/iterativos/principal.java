package edu.mx.uttt.iterativos;
import javax.swing.JOptionPane;

public class principal {
public static void main(String[] args) {
    double resultado = gestionar operaciones (menu());

    if (resultado == 0.0)
    JOptionPane.showConfirmDialog(null, ) {
        
    }
}

    public static int menu(){
        String menu = "Menu Principal \n" + 
                        "1)Serie1\n" +
                        "2)Serie2\n" +
                        "3)Factorial1\n" +
                        "4)Potencia\n" +
                        "5)Serie3\n" +
                        "Elije una opcion: ";
                        

    }return JOptionPane.showInputDialog(menu);
    
    public static double gestionarOperacion(String opcion){

        double resultado =0.0;
        int valor = 0;
        switch (opcion) {
            case "1":
                Serie serie = new Serie();
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de ns"));
                serie.setN(valor);
                resultado = serie.calcularSerie();
                break;
        
            default:
                break;
        }
    }
}
