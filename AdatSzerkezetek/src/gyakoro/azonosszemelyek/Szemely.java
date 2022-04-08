package gyakoro.azonosszemelyek;

import java.util.Objects;

public class Szemely {
    private String nev, cim;
    private int kor;

    public Szemely(String sor){
        String[] s = sor.split(";");
        this.nev = s[0];
        this.cim = s[1];
        this.kor = Integer.parseInt(s[2]);
    }
    
    public Szemely(String nev, String cim, int kor) {
        this(nev + ";" + cim + ";" + kor);
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public int getKor() {
        return kor;
    }

    @Override
    public String toString() {
        return "Szemely{" + "nev=" + nev + ", cim=" + cim + ", kor=" + kor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nev);
        hash = 97 * hash + Objects.hashCode(this.cim);
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
        final Szemely other = (Szemely) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.cim, other.cim)) {
            return false;
        }
        return true;
    }
    
    
    
}
