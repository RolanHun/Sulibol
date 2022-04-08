package gyakoro.azonosszemelyek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AzonosSzemelyek {
    public static void main(String[] args) throws IOException {
        
        
            List<String> sorok = Files.readAllLines(Paths.get("adatok.txt"));
            ArrayList<Szemely> szemelyek = new ArrayList<>();
            
            for (String sor : sorok) {
                szemelyek.add(new Szemely(sor));
            }
            
            HashSet<Szemely> kulEmberek = new HashSet<>(szemelyek);
            
            System.out.println("Név és cím alapján különböző emberek:\n"+kulEmberek.size()+"\n"+kulEmberek);
    }
}
