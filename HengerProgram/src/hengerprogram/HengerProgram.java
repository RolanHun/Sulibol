package hengerprogram;

import modell.LyukasHenger;
import modell.MertaniHenger;
import java.util.ArrayList;

public class HengerProgram {

    private ArrayList<MertaniHenger> hengerek;

    public HengerProgram() {
        
        hengerek = new ArrayList<>();
        //hengerek.add(new MertaniHenger(1, 1));
        //hengerek.add(new MertaniHenger(1, 1));
        //hengerek.add(new TomorHenger(1, 1));
        //hengerek.add(new TomorHenger(1, 1));
        
        /* itt van probléma a térfogatszámításnál */
        hengerek.add(new LyukasHenger(1, 1, 1));
        hengerek.add(new LyukasHenger(1, 1, 1));
        
        /* ha hívható lenne, akkor inkonzisztensé tehető a program
         * hí protectesd, akkor nem hívható másik csomagból
        */
        //MertaniHenger.setHengerDbMinus1();
    }
    
    public static void main(String[] args) {
        new HengerProgram().run();
    }
    
    public void run(){
        /* nem kaphatok más eredményt, ha itt is meghívom: */
        //System.out.println("hengerek átlag térfogata: " + atlagTerfogat() );
        //System.out.println("csövek össz. súlya: " + csovekSulya());

        System.out.printf("Eltárolt hengerek (%d):\n", MertaniHenger.getHengerDb());
        for (MertaniHenger henger : hengerek) {
            System.out.println(henger);
        }
        
        System.out.println("hengerek átlag térfogata: " + atlagTerfogat() );
        System.out.println("csövek össz. súlya: " + csovekSulya());
    }
    
    public double atlagTerfogat(){
        double osszV = 0;
        for (MertaniHenger henger : hengerek) {
            osszV += henger.terfogat();
        }
        return osszV / MertaniHenger.getHengerDb();
    }
    
    public double csovekSulya(){
        double osszS = 0;
        for (MertaniHenger henger : hengerek) {
            if(henger instanceof LyukasHenger){
                osszS += ((LyukasHenger) henger).suly();
            }
        }
        return osszS;
    }
    
    public ArrayList<MertaniHenger> lista(){
        return hengerek;
    }
}
