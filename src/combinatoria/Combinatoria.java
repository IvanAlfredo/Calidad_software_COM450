package combinatoria;

import combinatoria.Factorial;

public class Combinatoria {

    private int x, n, factorial_n, factorial_x, factorial_n_menos_x;

    ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
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

    public int n_factorial(int n) {
        factorial_n = 1;
        for (int i = 2; i <= n; i++) {
            factorial_n = factorial_n * i;
        }
        return factorial_n;
    }

    public int x_factorial(int x) {
        factorial_x = 1;

        for (int i = 2; i <= x; i++) {
            factorial_x = factorial_x * i;
        }
        return factorial_x;
    }

    public int nx_factorial(int n, int x) {
        factorial_n_menos_x = 1;
        for (int i = 2; i <= n - x; i++) {
            factorial_n_menos_x = factorial_n_menos_x * i;
        }
        return factorial_n_menos_x;
    }

    public int combinatoria_resultado(int n, int x) {
        int respuesta;// = 1;
        respuesta = n_factorial(n) / (x_factorial(x) * nx_factorial(n, x));
        return respuesta;
    }

    public boolean validar_x_mayor_n(int n, int x) {
        if (x > n) {
            return false;
        }
        System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
        return true;
    }

    public boolean x_negativo(int n, int x) {
        if (x < 0) {
            return false;
        }
        System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
        return true;
    }

    public boolean n_negativo(int n, int x) {
        if (n < 0) {
            return false;
        }
        System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
        return true;
    }
    
    public boolean x_0_n_3(int n, int x){
        if(x==0 && n==3){
            System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
            return true;
        }
        return false;
    }
    
    
    public boolean x_1_n_4(int n, int x){
        if(x==1 && n==4){
            System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
            return true;
        }
        
        return false;

    }
    
    public boolean x_2_n_5(int n, int x){
        if(x==2 && n==5){
            System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
            return true;
        }
        return false;
    }
    
    public boolean x_3_n_7(int n, int x){
        if(x==3 && n==7){
        System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
            return true;
        }
        return false;
    }
    
    public boolean x_igual_n(int n, int x){
        if(n==x){
            System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
            return true;
        }
        return false;
    }
    
    public boolean x_1_n_1(int x,int n){
        if(x==1 && n==1){
            System.out.println("la combinatoria de n = "+n+" y x = "+ x +" es " + combinatoria_resultado(n, x));
            return true;
        }
        return false;
    }
}
