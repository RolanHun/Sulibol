package gyakorlofeladat;

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
}
