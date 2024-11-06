public class Jagung extends Tanaman {
    public Jagung() {
        super("Jagung", 5, 3);
    }

    @Override
    public void tumbuh(double faktorCuaca) {
        super.tumbuh(faktorCuaca);
        System.out.println("Jagung tumbuh lebih cepat di musim panas.");
    }
}
