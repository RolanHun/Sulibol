package konyvtar;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Konyvtar implements Serializable  {
    
    public ArrayList<Konyv> konyvek;

    public Konyvtar() {
        konyvek = new ArrayList<>();
    }
    
    public void felvesz(Konyv konyv){
        konyvek.add(konyv);
    }
    public void felvesz(File konyvek){
    
    }
    public List<String> cimSzerint(){
        List<String> asd = new ArrayList<>();
        return asd;
    }
    public List<String> szerzoSzerint(){
        List<String> asd = new ArrayList<>();
        return asd;
    }
    public List<String> kiadasSzerint(){
        List<String> asd = new ArrayList<>();
        return asd;
    }
    public List<String> arSzerint(){
        List<String> asd = new ArrayList<>();
        return asd;
    }
    public void fajblaIr(){
    
    }
    public void allapotLement(){
    
    }
    public void allapotBeolvas(File file){
    
    }

    @Override
    public String toString() {
        return "Könyvtár" + konyvek + "\n";
    }
    
}
