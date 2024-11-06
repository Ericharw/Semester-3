public class Sopir {
    private String nama;
    private int biayaPerHari;

    public Sopir(String nama, int biayaPerHari) {
        this.nama = nama;
        this.biayaPerHari = biayaPerHari;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiayaPerHari() {
        return biayaPerHari;
    }

    public void setBiayaPerHari(int biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }

    public int hitungBiayaSopir(int hari) {
        return biayaPerHari * hari;
    }

    public void info() {
        System.out.println("Nama Sopir: " + nama);
        System.out.println("Biaya Sopir Per Hari: Rp" + biayaPerHari);
    }
}

