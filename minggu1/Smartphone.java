public class Smartphone {
    String merk;
    int kapasitasBaterai;

    public void hidupkan() {
        System.out.println("Smartphone dihidupkan");
    }

    public void matikan() {
        System.out.println("Smartphone dimatikan");
    }

    public void cetakInformasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}
