package pont;

import java.util.UUID;

class PontLeiro{
    public String leiras;
    public UUID id;

    public PontLeiro() {
        this("^-^");
    }

    public PontLeiro(String leiras) {
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }
         
}

public class Pont implements Cloneable {

    public int x,y;
    public String nev;
    public PontLeiro leiro;

    public Pont(int x, int y, String nev) {
        this(x,y,nev,new PontLeiro());
    }

    public Pont(int x, int y, String nev, PontLeiro leiro) {
        this.x = x;
        this.y = y;
        this.nev = nev;
        this.leiro = leiro;
    }
    

    @Override
    public String toString() {
        String s ="\tPont\n" + "nev=" + nev + ", x=" + x + ", y=" + y + '\n';
        s+="\tPontLeíró\n" + "Leírás=" + leiro.leiras + ", id=" + leiro.id + "\n" ;
        return s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Pont(this.x, this.y, this.nev);
    }
    
    
    
}
