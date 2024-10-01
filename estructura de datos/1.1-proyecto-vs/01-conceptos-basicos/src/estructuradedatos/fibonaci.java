public class fibonaci {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=0) {
            this.n= n;
        }

    }

    public int calFib(int n){
        //caso base
        
        //return (n<=1)?n:calFib(n-2) + calFib(n-2);
        if (n<=1) {
            return n;
        }else{
            return calFib(n-1) + calFib(n-2);
        }
    }
    
}
