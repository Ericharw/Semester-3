
public class mainPeminjaman {
    public static void main(String[] args) {
        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.id = 001;
        peminjaman1.namaMember = "Ericha";
        peminjaman1.namaGame = "Township";
        peminjaman1.lamaSewa = 3;
        peminjaman1.hargaPerHari = 35000;
        peminjaman1.tampilkanData();
    }
}
