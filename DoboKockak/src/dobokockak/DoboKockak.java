package dobokockak;

public class DoboKockak {

    public static void main(String[] args) {
        Asztal a1 = new Asztal();
//        Asztal a2 = new Asztal(3);
//        Asztal a3 = new Asztal(5, 8);
        a1.kockakkalDob();
        System.out.println(a1);
        a1.kockatHozzaRak(8);
        a1.kockakkalDob();
        System.out.println(a1);
        a1.asztaltFelrug();
        System.out.println(a1);
//        a1.asztaltFelrug();
//        a1.kockakkalDob();
//        a1.kockatHozzaRak(0);
    }
    
}
