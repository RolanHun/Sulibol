package modell;

public class LyukasHenger extends TomorHenger{
    
    private double falvast;

    public LyukasHenger(double r, double m, double falvast) {
        this(r, m, falvast, 1);
    }

    public LyukasHenger(double r, double m, double falvast, double fajsuly) {
        super(r, m, fajsuly);
        this.falvast = falvast;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\t\tLyukasHenger{" + "falvast=" + falvast + '}';
    }

    @Override
    public double terfogat() {
        MertaniHenger belso = new MertaniHenger(getSugar() - falvast, getMagassag());
        MertaniHenger.setHengerDbMinus1();//a belső henger növeli a darabszámot, de nem kell
        return super.terfogat() - belso.terfogat();
    }
    
    
}
