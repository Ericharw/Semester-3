public class Padi extends Tanaman{
    public Padi() {
        super("Padi", 7, 5);
    }

    @Override
    public void tumbuh() {
        super.tumbuh();
        System.out.println("Padi tumbuh subur di musim hujan.");
    }
}