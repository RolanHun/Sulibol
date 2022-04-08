package allapotmentes;

import java.io.Serializable;
import java.util.ArrayList;

public class Harcos implements Serializable{
    private String nev;
    private int arany;
    private ArrayList<String> felszereles;

    public Harcos() {
        this("Valami nem jó");
        arany = 0;
    }

    public Harcos(String nev) {
        this.nev = nev;
        arany = 3;
        felszereles = new ArrayList<>();
    }
    public void felvesz(String item){
        felszereles.add(item);
    }

    @Override
    public String toString() {
        String sep = System.lineSeparator();
        String felsz = "";
        for (String f: felszereles) {
            felsz += sep+"\t"+f;
        }
        return "Harcos{"
                + sep + "nev=" + nev + ", arany=" + arany + "," 
                + sep + "felszereles:"
                + felsz
                + sep +'}';
    }
    
}
