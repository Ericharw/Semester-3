public class Nilai {
    public Mahasiswa mahasiswa;    // Mahasiswa yang menerima nilai
    public MataKuliah mataKuliah;  // Mata kuliah yang diberikan nilai
    public double nilai;           // Nilai yang diberikan

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Nilai{" +
               "mahasiswa=" + mahasiswa.nama +
               ", mataKuliah=" + mataKuliah.namaMataKuliah +
               ", nilai=" + nilai +
               '}';
    }
}