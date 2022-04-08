package staticmukodese;

public class StaticMukodese {
    int pelanyInt;
    static int staticInt;// = 100;
    static {
        staticInt = 100;
    }
    
//    static void hibasPeldanySetter(){
//        this.peldanyInt=123;
//    }
    
    public StaticMukodese(int pelanyInt) {
        this.pelanyInt = pelanyInt;
        staticInt = -50;
    }
    
    public static void main(String[] args) {
        StaticMukodese m1 = new StaticMukodese(3);
        StaticMukodese m2 = new StaticMukodese(-10);
    }
}