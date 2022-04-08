package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Visa extends BankKartya{

    public Visa(int egyenleg) {
        super(egyenleg);
    }
    
    @Override
    public String toString() {
        return "Visa{" + super.toString() +'}';
    }
}

class Junior extends BankKartya{

    public Junior(int egyenleg) {
        super(egyenleg);
    }

    @Override
    public String toString() {
        return "Junior{" + super.toString() +'}';
    }
}

public class Prog {
    public static void main(String[] args) {
         List<BankKartya> BankCards = new ArrayList<>();
    
        BankKartya card1 = new Junior(10000);
        BankKartya card2 = new Junior(4000);
        BankKartya card3 = new Visa(98714558);
        BankKartya card4 = new Visa(55);
    
        BankCards.add(card1);
        BankCards.add(card2);
        BankCards.add(card3);
        BankCards.add(card4);
        
        kiir1("\neredetileg Kártyák:",BankCards);
        
        Collections.sort(BankCards);
        kiir1("\nrendezve (egyenleg) Kártyák:",BankCards);
    }
    
        private static void kiir1(String szoveg, List<BankKartya> lista) {
        System.out.println(szoveg);
        for (BankKartya str : lista) {
            System.out.println(str);
        }
    }
}
