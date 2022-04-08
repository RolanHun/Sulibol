package bank;

public abstract class BankKartya implements  Comparable<BankKartya>{
    private int egyenleg;

    public BankKartya(int egyenleg) {
        this.egyenleg = egyenleg;
    }

    public int getEgyenleg() {
        return egyenleg;
    }

    @Override
    public String toString() {
        return "BankKartya{" + "egyenleg=" + egyenleg + '}';
    }
    
    @Override
    public int compareTo(BankKartya o) {
        return Integer.compare(this.getEgyenleg(), o.getEgyenleg());
    }
}