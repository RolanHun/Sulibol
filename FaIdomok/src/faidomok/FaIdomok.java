package faidomok;

import idomok.FaIdom;
import idomok.Gomb;
import java.util.ArrayList;

public class FaIdomok extends FaIdom {
    private ArrayList<FaIdom> faIdomokList;
    public FaIdomok() {
        
    }
    public double osszSuly(){
        double osszS = 0;
        for (FaIdom idom : faIdomokList) {
            osszS += idom.suly();
        }
        return osszS;
    }
    public double osszGombSuly(){
        double osszS = 0;
        for (FaIdom idom : faIdomokList) {
            if(idom instanceof Gomb){
                osszS += ((Gomb) idom).suly();
            }
        }
        return osszS;
    }
    public void minV(){
        
    }
    public void maxV(){
        
    }
    public void run(){
        faIdomokList = new ArrayList<>();
        faIdomokList.add(new Gomb(14));
        System.out.println("Össz súly: " + osszSuly());
        System.out.println("Gömbök össz súlya: " + osszGombSuly());
    }
}