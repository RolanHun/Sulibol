package gyakorlas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Teglalapok{
    
            private double a;
            private double b;

            public Teglalapok(double a, double b) {
                this.a = a;
                this.b = b;
            }
            
            public double Terulet(){
                return a*b;
            }

            public double getTerulet() {
                return this.Terulet();
            }
            
            
            
            @Override
            public int hashCode() {
                int hash = 5;
                hash = 97 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
                hash = 97 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
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
                final Teglalapok other = (Teglalapok) obj;
                if (this.Terulet() != other.Terulet()) {
                    return false;
                }
                return true;
            }

            @Override
            public String toString() {
                return "Teglalapok{" + "a=" + a + ", b=" + b + ", ter=" + this.Terulet() + '}';
            }

        }

public class Teglalap {
    public static void main(String[] args) {
        Teglalapok t1 = new Teglalapok(2, 3);
        Teglalapok t2 = new Teglalapok(6, 1);
        Teglalapok t3 = new Teglalapok(2, 1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println("t1 == t2 ? " + (t1.equals(t2)));
        System.out.println("t1 == t3 ? " + (t1.equals(t3)));
        
        
        List<Teglalapok> teglalaps = new ArrayList<>();
        
        Teglalapok t4 = new Teglalapok(1.5, 2.3);
        teglalaps.add(t1);
        teglalaps.add(t2);
        teglalaps.add(t3);
        teglalaps.add(t4);
        
        kiir("eredeti:",teglalaps);
        
    }

    private static void kiir(String szoveg, List<Teglalapok> lista) {
        System.out.println(szoveg);
        for (Teglalapok teglalapok : lista) {
            System.out.println(teglalapok);
        }
    }
}