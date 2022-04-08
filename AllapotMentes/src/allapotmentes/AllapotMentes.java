package allapotmentes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllapotMentes {

    public static void main(String[] args) {
        Harcos harcos = new Harcos("Kübli");
        harcos.felvesz("Fejsze");
        harcos.felvesz("Pajzs");
        System.out.println("Kikapcsolás elött");
        System.out.println(harcos);
        
        mentes(harcos);
        
        harcos = null;
        
        System.out.println("Betöltés után");
        harcos = betoltes();
        System.out.println(harcos);
    }

    private static void mentes(Harcos harcos) {
        try {
            FileOutputStream fajlKi = new FileOutputStream("harcos.ser");
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(harcos);
            objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static Harcos betoltes() {
        Harcos harcos = new Harcos();
        try {
            FileInputStream fajlBe = new FileInputStream("harcos.ser");
            ObjectInputStream objBe = new ObjectInputStream(fajlBe);
            harcos = (Harcos) objBe.readObject();
            objBe.close();
            return harcos;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return harcos;
        }
    }
    
}
