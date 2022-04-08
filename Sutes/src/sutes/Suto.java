package sutes;

import java.io.IOException;

public class Suto {
        boolean bekapcs;

    public boolean isBekapcs() {
        return bekapcs;
    }

    public void setBekapcs(boolean bekapcs) {
        this.bekapcs = bekapcs;
    }

    @Override
    public String toString() {
        return "Suto{" + "bekapcs=" + bekapcs + '}';
    }
    
    void sut() throws IOException{
        if (Math.random()< .5) {
            System.out.println("Kész a süti");
        }
        else{
            throw new IOException();
        }
    }
}
