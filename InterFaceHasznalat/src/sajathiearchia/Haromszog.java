package sajathiearchia;

public class Haromszog extends Alakzat implements IPontjaiVannak{

    public Haromszog(String nev) {
        super(nev);
    }

    @Override
    public void Rajzol() {
        System.out.println("Háromszög rajzolás");
    }

    @Override
    public int pontok() {
        return 3;
    }
    
}
