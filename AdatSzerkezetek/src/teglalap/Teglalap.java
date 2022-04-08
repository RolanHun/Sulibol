package teglalap;

public class Teglalap {
    private double a, b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double Terulet(){
        return a*b;
    }

    @Override
    public int hashCode() {
        int hash = 69;
        hash = 420 * hash + Double.hashCode(this.Terulet());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teglalap other = (Teglalap) obj;
        if (this.Terulet()!=other.Terulet()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + ", ter=" + this.Terulet() + '}';
    }
    
    
}
