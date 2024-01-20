package exercises;

// Write a java program that does the following: f(x) = 1 + x, g(x) = 5 * x, h(x) = x /3, where x >= 12.
// Write a program for f(g(h(x))) and check the results with h’(g’(f’(result))) and output the difference.
// The difference must be final result should match the initial input value. Use class.
public class Exe5 {
    private double x;
    private double result;
    private double resultPrime;

    public Exe5(double x) throws Exception{
        if (x < 0) {
            throw new Exception("Value of x cannot be 12");
        }
        this.x = x;
    }

    public double fgh() {
        this.h();
        this.g();
        this.f();
        this.result = x;
        return this.result;
    }

    public void check() {
        System.out.println("result:" + result);
        System.out.println("resultPrime:" + resultPrime);
    }

    public double hPrimegPrimefPrime() {
        this.fPrime();
        this.gPrime();
        this.hPrime();
        this.resultPrime = x;
        return this.resultPrime;
    }

    private void f() {
        this.x +=  1;
    }

    private void fPrime() {
        this.x -= 1;
    }

    private void g() {
        this.x *= 5;
    }

    private void gPrime() {
        this.x /= 5;
    }

    private void h() {
        this.x /= 3.0;
    }

    private void hPrime() {
        this.x *= 3;
    }
}
