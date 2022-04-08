package zenebeolv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeneBeolv {

    public static void main(String[] args) throws IOException {
        List<String > s = Files.readAllLines(Paths.get("dalok1.txt"));
                
        ArrayList<String> dalokList = new ArrayList<>();
        for (String sor : s) {
            dalokList.add(new Dalok(sor).getDal());
        }       

        Collections.sort(dalokList);
        dalokList.add("\n");
        System.out.println("Dal címek szerint rendezve:\n"+dalokList);
        
        System.out.println("\n");
        
        ArrayList<String> eloadokList = new ArrayList<>();
        for (String sor : s) {
            eloadokList.add(new Dalok(sor).getEloado());
        }
        
        Collections.sort(eloadokList);
        eloadokList.add("\n");
        System.out.println("Előadók szerint rendezve:\n"+eloadokList);
        
        HashMap<String, String> dalok2 = new HashMap<>();
        
        List<String > d = Files.readAllLines(Paths.get("dalok2.txt"));
        
        for (String sor : d) {
            dalok2.put(new Dalok(sor).getDal(),new Dalok(sor).getEloado());
        }
        System.out.println("\n");
        System.out.println("Dalok 2 ismétlődés nélkül:");
        for (Map.Entry<String, String> entry : dalok2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }
    }
}