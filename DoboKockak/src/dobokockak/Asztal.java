package dobokockak;

import java.util.ArrayList;

public class Asztal {
    private ArrayList<Kocka> kockak;
    private int osszDobottErtek;
    private int kockakSzama;
    private boolean asztalFelrugva;

    public Asztal() {
        asztalFelrugva=false;
        kockak = new ArrayList<>();
        kockakSzama = 2;
        for (int i = 0; i < kockakSzama; i++) {
            Kocka kocka = new Kocka();
            kockak.add(kocka);
        }
    }
    public Asztal(int kockakSzama) {
        this.kockakSzama = kockakSzama;
        asztalFelrugva=false;
        kockak = new ArrayList<>();
        if (kockakSzama<2){
            kockakSzama = 2;
        }
        for (int i = 0; i < kockakSzama; i++) {
            Kocka kocka = new Kocka();
            kockak.add(kocka);
        }
    }
    public Asztal(int kockakSzama, int oldalakSzama) {
        this.kockakSzama = kockakSzama;
        asztalFelrugva=false;
        kockak = new ArrayList<>();
        if (kockakSzama<2){
            kockakSzama = 2;
        }
        for (int i = 0; i < kockakSzama; i++) {
            Kocka kocka = new Kocka(oldalakSzama);
            kockak.add(kocka);
        }
    }
    public void kockatHozzaRak(int oldalakSzama){
        if (asztalFelrugva){
            System.out.println("Hova akarsz kockát rakni...? Már felrugtad az asztalt...");
        }
        else {
            if (oldalakSzama<6){
                oldalakSzama=6;
            }
            Kocka kocka = new Kocka(oldalakSzama);
            kockak.add(kocka);
            System.out.println("Sikeresen oda raktad!");
        }
    }
    public void kockakkalDob(){
        if (asztalFelrugva){
            System.out.println("Hogy dobnál...? Már tönkre tettél mindent...");
        }
        else{
        osszDobottErtek=0;
        for (int i = 0; i < kockak.size(); i++) {
            kockak.get(i).dobas();
            System.out.println("Az "+(i+1)+". kockád ami egy :"+kockak.get(i).getOldalSzam()+" oldalú kocka. Dobott értéke: "+kockak.get(i).getDobottErtek());
            osszDobottErtek+=kockak.get(i).getDobottErtek();
        }
        System.out.println("Összesen: " + osszDobottErtek +" a dobásaid összege. Mindezt: "+ kockak.size()+ " db kockával dobtad.");
        }
    }
    public void asztaltFelrug(){
        if (asztalFelrugva) {
            System.out.println("Köszi... Már megtörtént...");
        }
        else {
            asztalFelrugva = true;
            System.out.println("Felrugtad... Ez mire volt jó??");
        }
    }

    @Override
    public String toString() {
        if (asztalFelrugva){
            return "Az asztalt felrugtad... Mit akarsz csinálni még?";
        }
        else {
        return "Asztal{" + "kockak=" + kockak + ", osszDobottErtek=" + osszDobottErtek + ", kockakSzama=" + kockakSzama + "}";
        }
    }
    
    
}
