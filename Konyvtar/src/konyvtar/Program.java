package konyvtar;

import java.util.HashSet;

public class Program {

    public static void main(String[] args) throws CloneNotSupportedException {
        Konyvtar kt = new Konyvtar();
        
        kt.felvesz(new Konyv("cim1","szerz1",2000,500));
        kt.konyvek.add((Konyv) kt.konyvek.get(0).clone());
        kt.konyvek.add((Konyv) kt.konyvek.get(0).clone());
        kt.felvesz(new Konyv("cim2","szerz2",2015,800));
        kt.konyvek.add((Konyv) kt.konyvek.get(3).clone());
        kt.konyvek.add((Konyv) kt.konyvek.get(4).clone());
        
        HashSet<Konyv> kulonbozoKonyvek = new HashSet<>();
        
        for (Konyv konyv : kt.konyvek) {
            kulonbozoKonyvek.add(konyv);
        }
        
        System.out.println(kt);
        System.out.println("Különböző"+kulonbozoKonyvek);
        
    }
    
}
