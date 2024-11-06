public class Peminjaman {
    int id, lamaSewa;
    String namaMember, namaGame;
    double hargaPerHari;
    
    public void tampilkanData() {
        System.out.println("ID: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Harga per Hari: " + hargaPerHari);
        System.out.println("Total Harga : Rp"+ hitungHarga());
    }

    public double hitungHarga() {
        return lamaSewa * hargaPerHari;
    }
}
