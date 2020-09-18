
package combinatoria;


public class Factorial {
    private int n,x,factorial_n,factorial_x,factorial_n_menos_x;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getFactorial_n() {
        return factorial_n;
    }

    public void setFactorial_n(int factorial_n) {
        this.factorial_n = factorial_n;
    }

    public int getFactorial_x() {
        return factorial_x;
    }

    public void setFactorial_x(int factorial_x) {
        this.factorial_x = factorial_x;
    }

    public int getFactorial_n_menos_x() {
        return factorial_n_menos_x;
    }

    public void setFactorial_n_menos_x(int factorial_n_menos_x) {
        this.factorial_n_menos_x = factorial_n_menos_x;
    }

    public int n_factorial(int n){
        factorial_n=1;
        for(int i=2;i<=n;i++){
            factorial_n=factorial_n*i;
        }
        return factorial_n;
    }
    
    public int x_factorial(int x){
        factorial_x=1;
        
        for(int i=2;i<=x;i++){
            factorial_x=factorial_x*i;
        }        
        return factorial_x;   
    }
    
    public int nx_factorial(int n,int x){
        factorial_n_menos_x=1;
        for(int i=2;i<=n-x;i++){
            factorial_n_menos_x=factorial_n_menos_x*i;
        }
        return factorial_n_menos_x;
    }
}
