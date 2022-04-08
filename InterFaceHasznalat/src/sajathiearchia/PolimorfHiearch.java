package sajathiearchia;

public class PolimorfHiearch {
    public static void main(String[] args) {
        SokSzog sokszog = new SokSzog("Sokszög-1");
        Haromszog hszog = new Haromszog("Háromszög-1");
        Alakzat[] alakzatok = {sokszog, hszog, new Kor("Kör-1"), new HaromDKor("3D Kör-1")};
        
        System.out.println("Alakzatok");
        for (Alakzat alakzat : alakzatok) {
            System.out.println(alakzat);
        }
        
        System.out.println("Kinek vannak pontjai:");
        //Kor kor = new Kor("Kör");
        //System.out.println("Kör pontjai vannak: "+((IPontjaiVannak)kor).pontok());
        
        for (Alakzat alakzat : alakzatok) {
            if(alakzat instanceof IPontjaiVannak){
                System.out.printf("%s, pontjai : %d darab\n", alakzat.nev,((IPontjaiVannak)alakzat).pontok());
            }
        }
        
        for (Alakzat alakzat : alakzatok) {
            if(alakzat instanceof IRajzolHaromD){
                ((IRajzolHaromD) alakzat).rajzolharomd();
            }
        }
    }
}
