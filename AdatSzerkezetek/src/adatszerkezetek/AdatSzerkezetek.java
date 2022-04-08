package adatszerkezetek;

import java.util.HashMap;
import java.util.Map;

public class AdatSzerkezetek {
    public static void main(String[] args) {
        HashMap<String, Double> atlagok = new HashMap<>();
        atlagok.put("Péter", 3.85);
        atlagok.put("Pál", 4.30);
        atlagok.put("Pál", 4.30);
        atlagok.put("Ede", 2.5);
        atlagok.put("Xénia", 4.58);
        
        for (Map.Entry<String, Double> entry : atlagok.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("["+key + "] = " + value);
        }
    }
}
