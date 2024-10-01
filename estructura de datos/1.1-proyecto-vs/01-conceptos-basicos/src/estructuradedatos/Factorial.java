import javax.swing.JOptionPane;

public class Factorial {

    private int n;

    public Factorial(){
        this.n= (n>0)?n:1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public long FactorialI(int opcion){

        long r = 0;
        switch (opcion) {
            case 1:
               r= Factorialfor();
                break;
            case 2:
               r= FactorialWhile();
                break;
            case 3:
               r= FactorialDoWhile();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor no valido");
        }
        return r;
    }

    public long factR(int n){
        if (n==1) {
            return 1;
        }else{
            return factR(n-1) * n;
        }
    }

    private long Factorialfor(){
        long fact = 1;
        for(int i = 1; i<=this.n; i++){
            fact*=i;
        }
        return fact;
    }

    private long FactorialWhile(){
        int i = 1;
        long fact = 1;
        while(i<=this.n){
            fact*=i;
            i++;
        }
        return fact;
    }

    private long FactorialDoWhile(){
        int i=1;
        long fact= 1;
        do{
            fact*=i;
            i++;
        }while(i<=this.n);

        return fact;
    }
}
