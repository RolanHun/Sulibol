package faidomokprogram;

import idomok.FaIdom;
import idomok.Gomb;
import idomok.Hasab;
import java.util.ArrayList;
import java.util.Collections;

public class FaIdomok {
    private ArrayList<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
        
        idomok.add(new Gomb(1));
        idomok.add(new Gomb(2));
        idomok.add(new Hasab(1, 1, 1));
        idomok.add(new Hasab(1, 1, 2));
        idomok.add(new Hasab(1, 1, 3));
        
        
        ArrayList<Integer> szamok = new ArrayList<>();
        szamok.add(2);szamok.add(22);szamok.add(12);szamok.add(18);
        int max = Collections.max(szamok);
        
        FaIdom f = Collections.max(idomok);
    }
    
    public void run(){
        System.out.println("Idomok súlya: " + idomokSulya());
        System.out.println("Gömbök súlya: " + gombokSulya());
        System.out.println("Min V: " + minV());
        System.out.println("Max V: " + maxV());
    }

    private double idomokSulya() {
        double ossz = 0;
        for (FaIdom idom : idomok) {
            ossz += idom.suly();
        }
        return ossz;
    }

    private double gombokSulya() {
        double ossz = 0;
        for (FaIdom idom : idomok) {
            if(idom instanceof Gomb)
            {
                ossz += idom.suly();
            }
        }
        return ossz;
    }

    private FaIdom minV() {
        int ind = 0, N = idomok.size();
        for (int i = 1; i < N; i++) {
            if(idomok.get(i).terfogat() < idomok.get(ind).terfogat()){
                ind = i;
            }
        }
        //UML alapján lehet üres is!
        return N > 0 ? idomok.get(ind) : null;//Veszélyes
    }
    
    private FaIdom maxV() {
        int ind = 0, N = idomok.size();
        for (int i = 1; i < N; i++) {
            if(idomok.get(i).terfogat() > idomok.get(ind).terfogat()){
                ind = i;
            }
        }
        //UML alapján lehet üres is!
        return N > 0 ? idomok.get(ind) : null;//Veszélyes
    }
}
