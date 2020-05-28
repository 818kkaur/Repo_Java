package class9_Constructor.InterfaceAbstract;

public class Market {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        b1.setEngine();

        FordFactory f1 = new FordFactory();
        f1.setEngine();


        CarGuidelines c1 = new FordFactory();
        c1.setTyres();

    }
}
