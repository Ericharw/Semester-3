import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dosen {
    public String nip;          // Nomor Induk Pegawai
    public String nama;         // Nama lengkap dosen
    public String departemen;   // Departemen tempat dosen bekerja
    public String email;        // Alamat email dosen
    private List<Nilai> daftarNilai;  // Daftar nilai yang diinputkan oleh dosen

    public Dosen(String nip, String nama, String departemen, String email) {
        this.nip = nip;
        this.nama = nama;
        this.departemen = departemen;
        this.email = email;
        this.daftarNilai = new ArrayList<>();
    }

    public void inputNilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        Nilai n = new Nilai(mahasiswa, mataKuliah, nilai);
        daftarNilai.add(n);
    }

    public void cetakNilaiMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("Nilai untuk mahasiswa: " + mahasiswa.nama);
        for (Nilai nilai : daftarNilai) {
            if (nilai.mahasiswa.nim.equals(mahasiswa.nim)) {
                System.out.println(nilai);
            }
        }
    }

    // Method untuk input data dosen
    public static Dosen inputDosen() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIP: ");
        String nip = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Departemen: ");
        String departemen = scanner.nextLine();
        
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        
        return new Dosen(nip, nama, departemen, email);
    }

    public void tampilkanData() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Email: " + email);
    }
}