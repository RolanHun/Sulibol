package fantasy;

public class Targy {
    private String nev;
    private double suly;
    private String hasznalat;

    public Targy(String nev, double suly, String hasznalat) {
        this.nev = nev;
        this.suly = suly;
        this.hasznalat = hasznalat;
    }

    public String getNev() {
        return nev;
    }

    public double getSuly() {
        return suly;
    }

    public String getHasznalat() {
        return hasznalat;
    }

    
    
    @Override
    public String toString() {
        return "\n\t|Tárgy: nev=" + nev + ", suly=" + suly + ", hasznalat=" + hasznalat+"|";
    }
    
}
