public class Tanaman {
    private String nama;
    private int waktuPanen; 
    private int kebutuhanAir; 
    private boolean statusPanen;

    public Tanaman(String nama, int waktuPanen, int kebutuhanAir) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.kebutuhanAir = kebutuhanAir;
        this.statusPanen = false;
    }

    public String getNama() {
        return nama;
    }

    public int getWaktuPanen() {
        return waktuPanen;
    }

    public void setWaktuPanen(int waktuPanen) {
        this.waktuPanen = waktuPanen;
    }

    public boolean isStatusPanen() {
        return statusPanen;
    }

    public void tumbuh(double faktorCuaca) {
        if (waktuPanen > 0) {
            waktuPanen -= 1 * faktorCuaca; // Mengurangi waktu panen berdasarkan faktor cuaca
            if (waktuPanen < 0) {
                waktuPanen = 0; // Waktu panen tidak bisa kurang dari 0
            }
            System.out.println(nama + " sedang tumbuh. Waktu panen tersisa: " + waktuPanen + " hari.");
        } else {
            statusPanen = true;
            System.out.println(nama + " siap dipanen.");
        }
    }

    public void panen() {
        if (statusPanen) {
            System.out.println(nama + " telah dipanen.");
            statusPanen = false;
        } else {
            System.out.println(nama + " belum siap dipanen.");
        }
    }

    public void terkenaHama() {
        System.out.println(nama + " terkena hama dan waktu panen bertambah 2 hari.");
        waktuPanen += 2;
    }

    public void bersihkanHama() {
        System.out.println(nama + " telah dibersihkan dari hama.");
    }
}

