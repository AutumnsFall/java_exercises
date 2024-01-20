package exercises;

public class Calculator {
    public int x;
    private int y;
    private int sum;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    static {
        System.out.println("Static Block Running");
    }

    public int getSum() {
        return sum;
    }

    public void sum() {
        sum = this.x + this.y;
    }

    public int sum(int x, int y) {
        return x + y;
    }
}
