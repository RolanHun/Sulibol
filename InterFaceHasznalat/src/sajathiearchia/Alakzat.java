package sajathiearchia;

public abstract class Alakzat {
    public String nev;

    public Alakzat(String nev) {
        this.nev = nev;
    }

    public abstract void Rajzol();

    @Override
    public String toString() {
        return "Alakzat{" + "nev=" + nev + '}';
    }
}