import java.util.ArrayList;
import java.util.List;

public class Lahan {
    private double ukuran;
    private String jenisTanah;
    private List<Tanaman> tanaman; // Daftar tanaman yang ditanam
    private List<Tanaman> hasilPanen; // Daftar hasil panen

    public Lahan(double ukuran, String jenisTanah) {
        this.ukuran = ukuran;
        this.jenisTanah = jenisTanah;
        this.tanaman = new ArrayList<>();
        this.hasilPanen = new ArrayList<>(); // Inisialisasi daftar hasil panen
    }

    public void menanam(Tanaman t) {
        if (tanaman.size() < ukuran) { // Pastikan ukuran lahan cukup untuk tanaman baru
            tanaman.add(t);
            System.out.println("Menanam " + t.getNama() + " di lahan dengan jenis tanah " + jenisTanah);
        } else {
            System.out.println("Lahan tidak cukup untuk menanam " + t.getNama());
        }
    }

    public void menyiram() {
        System.out.println("Menyiram semua tanaman di lahan.");
        for (Tanaman t : tanaman) {
            t.tumbuh(); // Mengubah kondisi tanaman saat disiram
        }
    }

    public void memupuk() {
        System.out.println("Memupuk semua tanaman di lahan.");
        for (Tanaman t : tanaman) {
            t.setWaktuPanen(Math.max(t.getWaktuPanen() - 1, 0)); // Mempercepat waktu panen
            System.out.println(t.getNama() + " mendapatkan pupuk, waktu panen dipercepat.");
        }
    }

    public void cekLahan() {
        System.out.println("Lahan memiliki ukuran: " + ukuran + " meter persegi dan jenis tanah: " + jenisTanah);
        System.out.println("Daftar tanaman:");
        for (Tanaman t : tanaman) {
            System.out.println("- " + t.getNama() + " (Waktu panen: " + t.getWaktuPanen() + " hari, Siap panen: " + t.isStatusPanen() + ")");
        }
    }

    public Tanaman[] getTanaman() {
        return tanaman.toArray(new Tanaman[0]); // Mengembalikan array dari daftar tanaman
    }

    public void panenTanaman(String namaTanaman) {
        for (Tanaman t : tanaman) {
            if (t.getNama().equalsIgnoreCase(namaTanaman) && t.isStatusPanen()) {
                t.panen(); // Menandai tanaman sudah dipanen
                hasilPanen.add(t); // Menyimpan hasil panen
                tanaman.remove(t); // Menghapus tanaman dari daftar setelah dipanen
                System.out.println("Tanaman " + t.getNama() + " berhasil dipanen dan disimpan.");
                return; // Keluar setelah memanen satu tanaman
            }
        }
        System.out.println("Tanaman " + namaTanaman + " tidak ditemukan atau belum siap dipanen.");
    }

    public List<Tanaman> getHasilPanen() {
        return hasilPanen; // Mengembalikan daftar hasil panen
    }

    
}
