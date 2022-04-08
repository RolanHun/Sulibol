package sajathiearchia;

public class SokSzog extends Alakzat implements IPontjaiVannak, IRajzolHaromD{

    public SokSzog(String nev) {
        super(nev);
    }

    

    @Override
    public void Rajzol() {
        System.out.println("Sokszög rajzolása");
    }

    @Override
    public int pontok() {
        return 6;
    }

    @Override
    public void rajzolharomd() {
        System.out.println("3D Sokszög rajzolása");
    }
    
}
