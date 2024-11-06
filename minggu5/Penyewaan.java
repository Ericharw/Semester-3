public class Penyewaan {
    private Pelanggan pelanggan;

    public Penyewaan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void prosesPenyewaan() {
        System.out.println("==== Informasi Penyewaan ====");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());// Informasi mobil
        if (pelanggan.getMobil() != null) {
            pelanggan.getMobil().info();
        } else {
            System.out.println("Mobil tidak tersedia.");
        }

        if (pelanggan.getSopir() != null) {
            pelanggan.getSopir().info();
        } else {
            System.out.println("Sopir tidak tersedia.");
        }

        System.out.println("Jumlah Hari: " + pelanggan.getHari());
    }
}
