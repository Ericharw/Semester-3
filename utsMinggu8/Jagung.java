public class Jagung extends Tanaman{
    public Jagung() {
        super("Jagung", 5, 3);
    }

    @Override
    public void tumbuh() {
        super.tumbuh();
        System.out.println("Jagung tumbuh lebih cepat di musim panas.");
    }
    
}