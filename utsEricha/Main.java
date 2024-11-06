import java.util.List;
import java.util.Scanner;

public class Main {
    private Pemain pemain;
    private Lahan lahan;
    private Waktu waktu;
    private Cuaca cuaca;
    private Toko toko;

    public Main() {
        this.pemain = new Pemain();
        this.lahan = new Lahan(100, "Tanah Subur");
        this.waktu = new Waktu();
        this.cuaca = new Cuaca();
        this.toko = new Toko();
    }

    public void mulai() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Simulasi Pertanian ---");
            System.out.println("1. Cek Lahan");
            System.out.println("2. Tanam Tanaman");
            System.out.println("3. Menyiram Tanaman");
            System.out.println("4. Memupuk Tanaman");
            System.out.println("5. Panen Tanaman");
            System.out.println("6. Cek Hasil Panen");
            System.out.println("7. Beli Barang");
            System.out.println("8. Jual Hasil Panen");
            System.out.println("9. Ganti Cuaca");
            System.out.println("0. Keluar");

            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Menangkap newline

            switch (opsi) {
                case 1:
                    lahan.cekLahan();
                    break;
                case 2:
                    System.out.print("Masukkan nama tanaman (Padi/Jagung): ");
                    String namaTanaman = scanner.nextLine();
                    if (namaTanaman.equalsIgnoreCase("Padi")) {
                        lahan.menanam(new Padi());
                    } else if (namaTanaman.equalsIgnoreCase("Jagung")) {
                        lahan.menanam(new Jagung());
                    } else {
                        System.out.println("Tanaman tidak dikenali.");
                    }
                    break;
                case 3:
                    lahan.menyiram();
                    break;
                case 4:
                    lahan.memupuk();
                    break;
                case 5:
                    System.out.print("Masukkan nama tanaman yang ingin dipanen: ");
                    String namaUntukPanen = scanner.nextLine();
                    lahan.panenTanaman(namaUntukPanen);
                    break;
                case 6:
                    List<Tanaman> hasilPanen = lahan.getHasilPanen();
                    System.out.println("Hasil panen:");
                    for (Tanaman t : hasilPanen) {
                        System.out.println("- " + t.getNama());
                    }
                    break;
                case 7:
                    System.out.print("Masukkan nama barang yang ingin dibeli: ");
                    String barang = scanner.nextLine();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();
                    toko.beliBarang(barang, jumlah, pemain);
                    break;
                case 8:
                    System.out.print("Masukkan nama tanaman yang ingin dijual: ");
                    String namaTanamanUntukJual = scanner.nextLine();
                    for (Tanaman t : lahan.getHasilPanen()) {
                        if (t.getNama().equalsIgnoreCase(namaTanamanUntukJual)) {
                            toko.jualHasilPanen(t, pemain);
                        }
                    }
                    break;
                case 9:
                    cuaca.ubahCuaca();
                    break;
                case 0:
                    System.out.println("Terima kasih telah bermain!");
                    scanner.close();
                    return; // Keluar dari program
                default:
                    System.out.println("Opsi tidak valid.");
            }
            waktu.hariBerganti();
        }
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.mulai();
    }
}
