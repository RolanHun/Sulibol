package gyakorlo.cimdarab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CimDarab {
    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("adatok.txt"));
        
        ArrayList<Szemely> szemelyek = new ArrayList<>();
        for (String sor : sorok) {
            szemelyek.add(new Szemely(sor));
        }
        System.out.println("Melyik címen hányan laknak:");
        
        HashMap<String, Integer> cimDb = new HashMap<>();
        
        for (Szemely szemely : szemelyek) {
            String kulcs = szemely.getCim();
            if(cimDb.containsKey(kulcs)){
                int ertek = cimDb.get(kulcs);
                cimDb.put(kulcs, ++ertek);
            }else {
                cimDb.put(kulcs, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : cimDb.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value + " fő");
        }
    }
}
