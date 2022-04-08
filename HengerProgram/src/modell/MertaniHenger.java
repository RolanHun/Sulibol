package modell;

public class MertaniHenger {
    private static int hengerDb = 0;
    
    private double r, m;

    public MertaniHenger(double r, double m) {
        this.r = r;
        this.m = m;
        hengerDb++;
    }

    protected static void setHengerDbMinus1(){
        hengerDb--;
    }
    
    public static int getHengerDb() {
        return hengerDb;
    }

    public double getSugar() {
        return r;
    }

    public double getMagassag() {
        return m;
    }

    public double terfogat(){
        return Math.pow(r, 2)*Math.PI*m;
    }
    
    @Override
    public String toString() {
        return "MertaniHenger{" + "r=" + r + ", m=" + m + '}';
    }
    
}
