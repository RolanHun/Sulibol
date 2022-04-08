package fantasy;

public class Fantasy {

    public static void main(String[] args) {
        Player jatekos = new Player(100);
        Targy kapa = new Targy("Kapa", 4, "Lehet vele kapálni");
        jatekos.felvesz(kapa);
        Targy balta = new Targy("Balta", 6, "Chop Chop");
        jatekos.felvesz(balta);
        Targy kes = new Targy("Kés", 100, "Stabby Boy");
        jatekos.felvesz(kes);
        System.out.println(jatekos);
        jatekos.felulreRak(1);
        System.out.println(jatekos);
    }
    
}
