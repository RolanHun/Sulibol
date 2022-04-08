package kivetelkezeles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO {
    void beolvas() throws IOException{
//        try {
//            Files.readAllLines(Paths.get("nincsMeg.txt"));
//        } catch (IOException ex) {
//            //Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Valami baj van...");
//            System.err.println("Valami baj van...");
//            System.out.println(ex);
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
        Files.readAllLines(Paths.get("nincsMeg.txt"));
    }
}
