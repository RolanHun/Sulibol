package felsor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Garazs{
    private ArrayList<Auto> autok;

    public Garazs() {
        autok = new ArrayList<>();
        autok.add(new Auto ("VW"));
        autok.add(new Auto ("BMW"));
        autok.add(new Auto ("Audi"));
        autok.add(new Auto ("Renault"));
        autok.add(new Auto ("Mercedes"));
        autok.add(new Auto ("Lambo"));
    }

//    public ArrayList<Auto> getAutok() {
//        return autok;
//    }
    
    public List<Auto> getAutokUnModLista(){
        return Collections.unmodifiableList(autok);
    }
    
}

class Auto {
    private String marka;

    public Auto(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Auto{" + "marka=" + marka + '}';
    }
}

public class Felsorolhato {
    public static void main(String[] args) {
        List<String> nevek = new ArrayList<>();
        nevek.add("Péter");
        nevek.add("Pál");
        nevek.add("Endre");
        for (String nev : nevek) {
            System.out.println(nev);
        }
        
        
        System.out.println("");
        
        
        Garazs garazs = new Garazs();
        
        List<Auto> autok = garazs.getAutokUnModLista();
        
        for (Auto auto : autok) {
            System.out.println(auto);
        }
        
    }
}
