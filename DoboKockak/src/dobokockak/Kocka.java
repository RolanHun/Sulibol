package dobokockak;

import java.util.Random;

public class Kocka {
    private int oldalSzam;
    private int dobottErtek;

    public Kocka() {
        this.oldalSzam = 6;
    }
    
    public Kocka(int oldalSzam) {
        this.oldalSzam = oldalSzam;
    }
    
    public void dobas(){
        Random rnd = new Random();
        dobottErtek = rnd.nextInt(oldalSzam+1);
        while (dobottErtek<=0){
            dobottErtek = rnd.nextInt(oldalSzam+1);
        }
    }

    public int getOldalSzam() {
        return oldalSzam;
    }

    public int getDobottErtek() {
        return dobottErtek;
    }

    
    
    @Override
    public String toString() {
        return "Kocka{" + "oldalSzam=" + oldalSzam + '}';
    }
    
    
}
