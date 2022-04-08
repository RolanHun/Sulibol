package idomok;

public abstract class FaIdom {
    private double fajsuly=0.8;
    public double terfogat(){
        return 0;
    } 
    public double suly(){
        return fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" + "fajsuly=" + fajsuly + '}';
    }
}