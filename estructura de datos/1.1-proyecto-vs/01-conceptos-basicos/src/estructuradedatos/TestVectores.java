package Arreglos;
public class TestVectores {

   // public static void main(String[] args) {
        // Declaracion de Vectores
       // int tam = 4;

       // int [] x = new int[3];
      //  System.out.println(x[1]);

       // double y [] = new double[tam];
       // System.out.println(y[3]);

       // boolean z [];
       // z = new boolean[4];
       // System.out.println(z[3]);
           
       // char x1[], x2[], x3[];
       // x1 = new char[tam];
       // tam = 8;
       // x2 = new char[tam];
       // System.out.println(x2[3]);

       // String zz [] = {"Luis", "William", "Ezequiel", "Rubi"};
       // try{
         //   System.out.println(zz[4]);
       // }catch(ArrayIndexOutOfBoundsException ex){
          //  System.out.println("Error: "+ ex.getMessage());
        //}
       // zz[1]="Mark";
       // System.out.println(zz[1]);
     //   }
   // }

    
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamano del arreglo"));
        double estaturas [] = new double[tam];
        llenarArreglo(estaturas);
        imprimir(estaturas);
    }
      public static void imprimir(double arr []){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "->");
            }
      }

      public static void llenarArreglo (double arr []){
        int i = 0;
        while (i<=arr.length) {
            arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del arreglo[ "+ (i+1) + "]"));
            i++;
        }
      }

      public static double sumarValores() {
        for (int i = 0; i < array.length; i++) {
            
        }
      }

      public static double calcularMedia() {
        while (condition) {
            
        }
      }

      public static double ObtenerValorMaximo() {
        do {
            
        } while (condition);
      }
      }
