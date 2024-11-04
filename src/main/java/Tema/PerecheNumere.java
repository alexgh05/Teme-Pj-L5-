package Tema;

public class PerecheNumere {
    private int A;
    private int B;

    PerecheNumere(int A, int B) {
        this.A = A;
        this.B = B;
    }
    PerecheNumere() {};

    public int getA() {
        return A;
    }
    public void setA(int A) {
        this.A = A;
    }
    public int getB() {
        return B;
    }
    public void setB(int B) {
        this.B = B;
    }

    public String toString() {
        return "A: " + A + ", B: " + B;
    }

    public boolean Fibonacci(int a,int b) {
        //a and b consecutive

        Fibonacci(a,a+b);
        return true;
    }

   /* public int cmmc()
    {
        int a,b;
        a=this.A;
        b=this.B;
        int cmmc;
        int min;
        if(a<b)
            min=a;
        else
            min=b;
       for(cmmc=min)
        return cmmc;
    }*/

}
