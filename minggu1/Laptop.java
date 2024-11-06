public class Laptop {
    String merk;
    int ukuranLayar;

    public void hidupkan() {
        System.out.println("Laptop dihidupkan");
    }

    public void matikan() {
        System.out.println("Laptop dimatikan");
    }

    public void cetakInformasi() {
        System.out.println("Merk : " + merk);
        System.out.println("Ukuran Layar : " + ukuranLayar + "inci");
    }
}
