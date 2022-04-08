package modell;

public class TomorHenger extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double r, double m) {
        this(r, m, 1);
    }

    public TomorHenger(double r, double m, double fajsuly) {
        super(r, m);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly(){
        return terfogat() * fajsuly;
    }
    
    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\tTomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
    
}
