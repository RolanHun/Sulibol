package idomok;
public class Hasab extends FaIdom{
    private double a,b,m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    @Override
    public double terfogat() {
        return a * b * m;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", m=" + m + '}';
    }

    @Override
    public int compareTo(FaIdom t) {
        return 0;
    }
}
