package teglalap;

import java.util.ArrayList;
import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
        
        HashSet<Integer> szamHalmaz = new HashSet<>();
        boolean siker;
        siker = szamHalmaz.add(3);
        System.out.println("3 hozzáadva: "+siker);
        siker = szamHalmaz.add(2);
        System.out.println("2 hozzáadva: "+siker);
        siker = szamHalmaz.add(3);
        System.out.println("3 hozzáadva: "+siker);
        siker = szamHalmaz.add(5);
        System.out.println("5 hozzáadva: "+siker);
        siker = szamHalmaz.add(2);
        System.out.println("2 hozzáadva: "+siker);
        siker = szamHalmaz.add(6);
        System.out.println("6 hozzáadva: "+siker);
        System.out.println("Számok halmaza:\n"+szamHalmaz+"\n");
        
        
        Teglalap t1 = new Teglalap(2, 3);
        Teglalap t2 = new Teglalap(1, 6);
        Teglalap t3 = new Teglalap(2, 1);
        ArrayList<Teglalap> teglaLista = new ArrayList<>();
        teglaLista.add(t1);
        teglaLista.add(t2);
        teglaLista.add(t3);
        
        System.out.println("\nt1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        
        System.out.println("\nhc1: " + t1.hashCode());
        System.out.println("hc2: " + t2.hashCode());
        System.out.println("hc3: " + t3.hashCode());
        
        System.out.println("\nt1==t2: " + t1.equals(t2));
        System.out.println("t1==t3: " + t1.equals(t3));
        
        HashSet<Teglalap> teglahalmaz = new HashSet<>(teglaLista);
        System.out.println("\nTéglalapok halmaza:\n"+teglahalmaz.size()+"\n"+ teglahalmaz);
    }
}