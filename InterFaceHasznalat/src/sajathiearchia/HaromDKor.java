package sajathiearchia;

public class HaromDKor extends Kor implements IRajzolHaromD{

    public HaromDKor(String nev) {
        super(nev);
    }

    @Override
    public void rajzolharomd() {
        System.out.println("3D Kör rajzolása");
    }
    
}
