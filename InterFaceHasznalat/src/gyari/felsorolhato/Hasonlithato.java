package gyari.felsorolhato;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NevComparator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        //return egyik.getNev().compareTo(masik.getNev());
        Collator col = Collator.getInstance();
        return col.compare(egyik.getNev(), masik.getNev());
        
    }
}

class CimComparator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        //return egyik.getNev().compareTo(masik.getNev());
        Collator col = Collator.getInstance();
        return col.compare(egyik.getCim(), masik.getCim());
        
    }
}

class Ember implements Comparable<Ember>{
    
    public static NevComparator NevRendezo(){
        return new NevComparator();
    }
    
    public static CimComparator CimRendezo(){
        return new CimComparator();
    }
    
    private String nev, cim;
    private int szulEv;

    public Ember(String nev, String cim, int szulEv) {
        this.nev = nev;
        this.cim = cim;
        this.szulEv = szulEv;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public int getSzulEv() {
        return szulEv;
    }
    
    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + ", szulEv=" + szulEv + '}';
    }

    @Override
    public int compareTo(Ember masik) {
        //szulEV
        //return this.szulEv - masik.szulEv;
        
        //nev
        //return this.nev.compareTo(masik.nev);
        
        //Mindennel mukodo
        return Integer.compare(this.szulEv, masik.szulEv);
    }
}

public class Hasonlithato {
    public static void main(String[] args) {
        List<String> nevek = new ArrayList<>();
        nevek.add("Ede");
        nevek.add("Anna");
        nevek.add("Pisti");
        nevek.add("Misi");
        nevek.add("Ildi");
        
        kiir1("eredeti String:", nevek);
        
        Collections.sort(nevek);
        kiir1("\nrendezve String:", nevek);
        
        List<Ember> emberek = new ArrayList<>();
        emberek.add(new Ember("Ede", "Budapest", 22));
        emberek.add(new Ember("Anna", "Miskolc", 25));
        emberek.add(new Ember("Ádám", "Göd", 28));
        emberek.add(new Ember("Xénia", "Érd", 27));
        emberek.add(new Ember("Misi", "Áporka", 24));
        emberek.add(new Ember("Flóra", "Paks", 21));
        
        kiir2("\n\neredeti Ember:", emberek);
        
        Collections.sort(emberek);
        kiir2("\nrendezve (szulEv) Ember:",emberek);
        
//        Collections.sort(emberek, new Comparator<Ember>() {
//            @Override
//            public int compare(Ember o1, Ember o2) {
//                return o1.getNev().compareTo(o2.getNev());
//            }
//        });

        Collections.sort(emberek, Ember.NevRendezo());
        kiir2("\nrendezve (nev) Ember:",emberek);
        
        Collections.sort(emberek, Ember.CimRendezo());
        kiir2("\nrendezve (cim) Ember:",emberek);
        
    }

    private static void kiir1(String szoveg, List<String> lista) {
        System.out.println(szoveg);
        for (String str : lista) {
            System.out.println(str);
        }
    }

    private static void kiir2(String szoveg, List<Ember> lista) {
        System.out.println(szoveg);
        for (Ember ember : lista) {
            System.out.println(ember);
        }
    }
}
