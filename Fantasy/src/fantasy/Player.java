package fantasy;

import java.util.ArrayList;

public class Player {
    private double maxSeb;
    private double aktSeb;
    private ArrayList<Targy> targyak;
    private boolean uresKez;

    public Player(double maxSeb) {
        this.maxSeb = maxSeb;
        this.aktSeb = maxSeb;
        uresKez = true;
        targyak = new ArrayList<>();
    }
    
    public boolean felvesz(Targy targy){
        if (aktSeb>0){
            targyak.add(targy);
            double aktSebHelp = aktSeb;
            aktSeb -= targy.getSuly();
            if (aktSeb<=0){
                System.out.println("Nincs elég férőhelyed, hogy felvedd a "+targy.getNev()+"-t!");
                targyak.remove(targyak.size()-1);
                aktSeb=aktSebHelp;
                return false;
            }
            else{
                System.out.println("Sikeresen felvettél egy: "+targy.getNev()+"-t!");
                return true;
            }
        }
        else {
            System.out.println("Nincs elég férőhelyed!");
            return false;
        }
    }
    
    public void hasznal(){
        
    }
    
    public void elrak(){
    
    }
    
    public void eldob(){
    
    }
    
    public void mozog(){
    
    }
    
    public void felulreRak(int db){
        Targy seged = targyak.get(db);
        targyak.remove(db);
        Targy seged1 = targyak.get(0);
        targyak.remove(0);
        targyak.add(0, seged);
        targyak.add(seged1);
    }
    
    public void felulreRak(String nev){
    
    }
    
    public void felulreRak(Targy targy){
    
    }

    @Override
    public String toString() {
        return "Player\n\t" + "maxSeb=" + maxSeb + ", aktSeb=" + aktSeb + "\n\tTárgyak=\n\t" + targyak + "\n\turesKez=" + uresKez;
    }
    
}
