package egyenloseg;

import java.util.Objects;

class Ember{
        private String nev;
        private int kor;

        public Ember(String nev, int kor) {
            this.nev = nev;
            this.kor = kor;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nev);
        hash = 73 * hash + this.kor;
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
        final Ember other = (Ember) obj;
        if (this.kor != other.kor) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }
        
        
    }

public class Egyenloseg {

    public static void main(String[] args) {
        String nev1 = "Peti";
        String nev2 = "Peti";
        System.out.println("hc1:" + nev1.hashCode());
        System.out.println("hc2:" + nev2.hashCode());
        System.out.println("nev1 == nev2: " + (nev1 == nev2));
        System.out.println("nev1.equals(nev2): " + nev1.equals(nev2));
        
        nev2 = nev1;
        System.out.println("\n\nnev2 = nev1");
        System.out.println("hc1:" + nev1.hashCode());
        System.out.println("hc2:" + nev2.hashCode());
        System.out.println("nev1 == nev2: " + (nev1 == nev2));
        System.out.println("nev1.equals(nev2): " + nev1.equals(nev2));
        
        nev2 = new String("Peti");
        System.out.println("\n\nhc1:" + nev1.hashCode());
        System.out.println("hc2:" + nev2.hashCode());
        System.out.println("nev2 = new String(\"Peti\")");
        System.out.println("nev1 == nev2: " + (nev1 == nev2));
        System.out.println("nev1.equals(nev2): " + nev1.equals(nev2));
        
        Ember e1 = new Ember("Péter",22);
        Ember e2 = new Ember("Péter",22);
        System.out.println("\n\nhc1:" + e1.hashCode());
        System.out.println("hc2:" + e2.hashCode());
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));
        
        e2 = e1;
        System.out.println("\n\ne2 = e1");
        System.out.println("hc1:" + e1.hashCode());
        System.out.println("hc2:" + e2.hashCode());
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));
    }
    
}
