package kivetelkezeles;

public class Muvelet {
    void szamol(String szam){
        int c;
        try {
            int a = Integer.parseInt(szam);
            int b = 1;
            c = a/b;
            System.out.println("Eredmény: "+c);
        } catch (NumberFormatException | ArithmeticException x) {
            System.err.println("Hiba: ");
            System.err.println(x.getMessage());
        }
//        } catch (NumberFormatException e) {
//            System.err.println("Ez nem szám!");
//            System.err.println(e.getMessage());
//        } catch (ArithmeticException x){
//            System.err.println("A 0 nem lehet osztó");
//            System.err.println(x.getMessage());
////            c = 0;
////            System.out.println("Eredmény: "+c);
//        }
    }
}
