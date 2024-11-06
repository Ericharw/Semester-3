import java.util.ArrayList;
import java.util.List;

public class SistemInformasi {
    public List<Mahasiswa> daftarMahasiswa;   // Daftar mahasiswa yang terdaftar
    public List<Dosen> daftarDosen;            // Daftar dosen yang ada
    public List<MataKuliah> daftarMataKuliah;  // Daftar mata kuliah yang tersedia
    public List<Nilai> daftarNilai;            // Daftar nilai yang ada

    public SistemInformasi() {
        this.daftarMahasiswa = new ArrayList<>();
        this.daftarDosen = new ArrayList<>();
        this.daftarMataKuliah = new ArrayList<>();
        this.daftarNilai = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public void tambahNilai(Nilai nilai) {
        daftarNilai.add(nilai);
    }

    public void cetakDaftarMahasiswa() {
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }

    public void cetakDaftarDosen() {
        for (Dosen d : daftarDosen) {
            d.tampilkanData();
        }
    }

    public void cetakDaftarMataKuliah() {
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("Kode: " + mk.kodeMataKuliah + ", Nama: " + mk.namaMataKuliah + ", SKS: " + mk.sks + ", Semester: " + mk.semester);
        }
    }

    public void cetakDaftarNilai() {
        for (Nilai n : daftarNilai) {
            System.out.println(n);
        }
    }
}