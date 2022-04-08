package alaphasznalat;

public class InterFaceHasznalat {

    public static void main(String[] args) {
        Ajto ajto = new Ajto();
        Esernyo esernyo = new Esernyo();
        
        //Object[] objTargyak = {ajto, esernyo, new Boolean(true)};
        
        IKinyithato[] kinyithatoTargyak = {ajto, esernyo};
        
        System.out.println("Kinyitjuk a tárgyakat:");
        for (IKinyithato ik : kinyithatoTargyak) {
            ik.kinyit();
        }
        
        IKinyithato kinyithato;
        kinyithato = new Ajto();
        kinyithato.kinyit();
        kinyithato = new Esernyo();
        kinyithato.kinyit();
        //névtelen belső oszt.
        kinyithato = new IKinyithato() {
            @Override
            public void kinyit() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //kinyithato.kinyit();
        
    }    
}