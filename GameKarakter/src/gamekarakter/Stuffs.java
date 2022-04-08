package gamekarakter;

public class Stuffs extends GameHelper{
    private String cuccNeve;
    private double cuccSulya;

    public Stuffs(String cuccnev, double cuccsuly) {
        this.cuccNeve = cuccnev;
        this.cuccSulya = cuccsuly;
    }

    @Override
    public String toString() {
        return "Stuffs{" + "cuccNeve=" + cuccNeve + ", cuccSulya=" + cuccSulya + '}';
    }

    
    
}