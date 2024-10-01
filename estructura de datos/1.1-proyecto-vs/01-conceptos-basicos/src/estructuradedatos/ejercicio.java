public class ejercicio {

// Utilizando la recursividad y ciclos, escriba un
//  programa que tome un número positivo como entrada y siga dividiendo ese número
//  por 3 hasta que el resultado sea menor que 1, momento en el que emite ese
// resultado.

    private int n;

    public ejercicio(){
        this.n= (n>0)?n:1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }
    
    public double divisionpositivafor(){
        long fact = 1;
        for(int i = 1; i<=this.n; i++){
            fact/=i;
        }
        return 0.0;
    }

    public double divisionpositivaWhile(){
        int i = 1;
        long fact = 1;
        while(i<=this.n){
            fact/=i;
            i++;
        }
        return 0.0;
    }

    public double divisionpositivaDoWhile(){
        int i=1;
        long fact= 1;
        do{
            fact/=i;
            i++;
        }while(i<=this.n);
        return 0.0;
    }

}
