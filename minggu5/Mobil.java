public class Mobil {
    private String nama, merk;
    private int biaya;
    
    public Mobil() {
        this.nama = "Unknown";
        this.merk = "Unknown";  
        this.biaya = 0;
    }

    public Mobil(String nama, String merk, int biaya) {
        this.nama = nama;
        this.merk = merk;  
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {  
        this.merk = merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaMobil(int jumlahHari) {
        return biaya * jumlahHari;
    }

    public void info() {
        System.out.println("Nama Mobil: " + nama);
        System.out.println("Merek Mobil: " + merk);  
        System.out.println("Biaya Per Hari: Rp" + biaya);
    }
}

