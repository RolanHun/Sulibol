package konyvtar;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Konyv implements Comparable, Serializable, Cloneable{
    public String cim, szerzo;
    public int kiadasEve, ar;
    public UUID id;

    public Konyv(String cim, String szerzo, int kiadasEve, int ar) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadasEve = kiadasEve;
        this.ar = ar;
        this.id = UUID.randomUUID();
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Konyv(cim, szerzo, kiadasEve, ar);
    }

    @Override
    public String toString() {
        return "\nKonyv{" + "cim=" + cim + ", szerzo=" + szerzo + ", kiadasEve=" + kiadasEve + ", ar=" + ar + ", id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.cim);
        hash = 71 * hash + Objects.hashCode(this.szerzo);
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
        final Konyv other = (Konyv) obj;
        if (!Objects.equals(this.cim, other.cim)) {
            return false;
        }
        if (!Objects.equals(this.szerzo, other.szerzo)) {
            return false;
        }
        return true;
    }
    
    
}
