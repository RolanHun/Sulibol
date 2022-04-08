package egyenloseg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Teglalap implements Comparable<Teglalap>{
    private double a, b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    
     public double terulet(){ return a*b; }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + ", ter.: " + terulet() + '}';
    }

    /* egyenlőség, és pl HashSet miatt hashCode, equals */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Double.hashCode(this.terulet());
        //hash = 23 * hash + (int)this.terulet();//3.0 - 3.99999 között ua hashCode
        //hash = 23 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        //hash = 23 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teglalap other = (Teglalap) obj;
        if(other.terulet() != this.terulet()){
            return false;
        }
//        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(other.a)) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(other.b)) {
//            return false;
//        }
        return true;
    }

    /* alapértelmezett rendezés miatt Comparable */
    @Override
    public int compareTo(Teglalap masik) {
        //return (int)(this.terulet() - masik.terulet());//3.0 - 3.9999 ???
        
        //1
        
        
        //2
        if(this.terulet() > masik.terulet()){
            return 1;
        }else if(this.terulet() < masik.terulet()){
            return -1;
        }else{
            return 0;
        }
    }
    
    
}

public class Teglalapok {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(3, 2);
        Teglalap t2 = new Teglalap(1, 6);
        Teglalap t3 = new Teglalap(1, 2);
        
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        
        /* Egyenlőség vizsgálat: hashCode, equals */
        System.out.println("t1.hc: " + t1.hashCode());
        System.out.println("t2.hc: " + t2.hashCode());
        System.out.println("t3.hc: " + t3.hashCode());
        
        System.out.println("t1==t2: " + t1.equals(t2));
        System.out.println("t1==t3: " + t1.equals(t3));
        
        HashSet<Double> valosHalmaz = new HashSet<>();
        valosHalmaz.add(2.2);
        valosHalmaz.add(5.2);
        valosHalmaz.add(2.2);
        valosHalmaz.add(3.14);
        valosHalmaz.add(5.0);
        valosHalmaz.add(5.2);
        valosHalmaz.add(4.0);
        System.out.println("egészek halmaza:\n" + valosHalmaz);
        
        HashSet<Teglalap> teglaHalmaz = new HashSet<>();
        teglaHalmaz.add(t1);
        teglaHalmaz.add(t2);
        teglaHalmaz.add(t3);
        int db = teglaHalmaz.size();
        System.out.printf("téglalapok halmaza (%d db):\n%s\n",db, teglaHalmaz);
        
        /* rendezés: Comparable, további egyéni rendezés(ek)nél: Comparator */
        ArrayList<Teglalap> teglaLista = new ArrayList<>();
        teglaLista.add(t1);
        teglaLista.add(t2);
        teglaLista.add(t3);
        teglaLista.add(new Teglalap(1.25, 2.23));
        teglaLista.add(new Teglalap(3.14, 5.05));
        kiir("eredeti: ", teglaLista);
        
        Collections.sort(teglaLista);
        kiir("\nrendezve (ter, növ.): ", teglaLista);
        
        Collections.sort(teglaLista, Collections.reverseOrder());
        kiir("\nrendezve (ter, csökk.): ", teglaLista);
    }    

    private static void kiir(String szoveg, ArrayList<Teglalap> lista) {
        System.out.println(szoveg);
        for (Teglalap teglalap : lista) {
            System.out.println(teglalap);
        }
    }
}
