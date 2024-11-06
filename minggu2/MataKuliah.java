import java.util.Scanner;
public class MataKuliah {
    public String kodeMataKuliah;  // Kode unik mata kuliah
    public String namaMataKuliah;  // Nama mata kuliah
    public int sks;                // Jumlah SKS (Satuan Kredit Semester)
    public int semester;           // Semester di mana mata kuliah diambil

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int sks, int semester) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.semester = semester;
    }

    // Method untuk input data mata kuliah
    public static MataKuliah inputMataKuliah() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMataKuliah = scanner.nextLine();
        
        System.out.print("Masukkan Nama Mata Kuliah: ");
        String namaMataKuliah = scanner.nextLine();
        
        System.out.print("Masukkan SKS: ");
        int sks = scanner.nextInt();
        
        System.out.print("Masukkan Semester: ");
        int semester = scanner.nextInt();
        
        return new MataKuliah(kodeMataKuliah, namaMataKuliah, sks, semester);
    }
}
