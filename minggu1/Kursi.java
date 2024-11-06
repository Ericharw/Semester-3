public class Kursi {
    String material;
    boolean adaSandaran;

    public void duduki() {
        System.out.println("Anda sedang duduk di kursi ");
    }

    public void cetakInformasi() {
        System.out.println("Material : " + material);
        System.out.println("Ada sandaran : " + adaSandaran);
    }
}
