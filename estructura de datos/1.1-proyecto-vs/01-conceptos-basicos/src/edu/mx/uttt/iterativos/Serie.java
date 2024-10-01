package edu.mx.uttt.iterativos;

public class Serie {
    private int n;
    public Serie (){
        this.n = 1;
    }

    public Serie(int n){
        this.n = (n>0)?n:1;

        // if(n>0){
        //     this.n = n;
        // }else{
        //     this.n = 1;
        // }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
         if(n>0){
           this.n = n;
             }else{
                System.out.println("Elvalor de n no puede ser negativo ni cero");
             this.n = 1;
        }
    }

    public double calcularSerie(){
        int i = 1;
        double r=0;
        while (i<=n) {
            r+=1.0/i;
            i++;
        }
        return r;
    }

    @Override
    public String toString(){
        return "Elresultado de la serie hasta " + this.n + "es: " + Math.round(this.calcularSerie());
        }

    public int nextInt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
    }

    public double nextDouble() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextDouble'");
    }

}
