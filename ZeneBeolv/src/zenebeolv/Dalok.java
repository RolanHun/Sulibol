package zenebeolv;
public class Dalok{
    private String Dal, Eloado; 

    public Dalok(String sor) {
        String[] s = sor.split(" / ");
        this.Dal = s[0];
        this.Eloado = s[1];
    }
    
    public Dalok(String dal, String eloado) {
        this(dal + " / " + eloado);
    }

    public String getDal() {
        return "\n\t"+Dal;
    }

    public String getEloado() {
        return "\n\t"+Eloado;
    }
    
    @Override
    public String toString() {
        return Dal;
    }
}