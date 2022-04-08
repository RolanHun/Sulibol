package gamekarakter;

import java.util.ArrayList;

public class Karakter extends GameHelper{
    private String karakterName;
    private double speed;
    private ArrayList<Stuffs> stuffsList;

    public Karakter(String karakterName) {
        this.karakterName = karakterName;
        stuffsList = new ArrayList<>();
        speed = 100.0;
    }
    public void targyak(String cuccnev, double cuccsuly){
        stuffsList.add(new Stuffs(cuccnev, cuccsuly));
        double oldspeed=speed;
        speed=oldspeed-(cuccsuly*1.75);
        System.out.println("\nA karakter felvett egy új tárgyat!");
        System.out.println("\tAz új tárgyad: "+cuccnev);
        System.out.println("\tAz új tárgyad súlya: "+cuccsuly);
        System.out.println("\tAz új sebességed: "+speed);
    }
    public void currentStatus(){
        System.out.println("\nA karakter jelenlegi státusza: ");
        System.out.println("\tTárgyak: "+stuffsList);
        System.out.println("\tSebesség: "+speed);
    }

    @Override
    public String toString() {
        return "Karakter{" + "karakterName=" + karakterName + '}';
    }
    
}
