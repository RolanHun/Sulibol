package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SutiSutes {
    private Suto s1;

    public SutiSutes() {
        s1 = new Suto();
    }
    public void sutes(){
        try {
            s1.setBekapcs(true);
            s1.sut();
        } catch (IOException ex) {
            System.err.println("Baj van");
        } finally{
            s1.setBekapcs(false);
        }
    }

    public String getSuto() {
        return "A sütő állapota: "+s1.isBekapcs();
    }
    
    
}