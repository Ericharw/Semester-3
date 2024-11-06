
import java.util.Scanner;
public class Mahasiswa {
    public String nim;          // Nomor Induk Mahasiswa
    public String nama;         // Nama lengkap mahasiswa
    public String jurusan;      // Jurusan yang diambil mahasiswa
    public int tahunMasuk;      // Tahun masuk kuliah

    public Mahasiswa(String nim, String nama, String jurusan, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahunMasuk = tahunMasuk;
    }

    public void tampilkanData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
    
    // Method untuk input data mahasiswa
    public static Mahasiswa inputMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();
        
        System.out.print("Masukkan Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        
        return new Mahasiswa(nim, nama, jurusan, tahunMasuk);
    }
}