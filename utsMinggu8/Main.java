import java.util.Scanner;

public class Main {
    public enum JenisCuaca {
        CERAH, HUJAN, PANAS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pemain pemain = new Pemain();
        Lahan lahan = new Lahan(100, "subur");
        JenisCuaca cuaca = JenisCuaca.CERAH;
        Waktu waktu = new Waktu();
        Toko toko = new Toko();

        boolean gameBerjalan = true;
        while (gameBerjalan) {
            System.out.println("\nHari: " + waktu.getHari() + " | Musim: " + waktu.getMusim());
            System.out.println("Cuaca: " + cuaca);
            System.out.println("Uang: " + pemain.getUang() + " | Energi: " + pemain.getEnergi());
            System.out.println("1. Tanam Jagung");
            System.out.println("2. Tanam Padi");
            System.out.println("3. Menyiram Tanaman");
            System.out.println("4. Memupuk Tanaman");
            System.out.println("5. Istirahat");
            System.out.println("6. Periksa Lahan");
            System.out.println("7. Beli Barang di Toko");
            System.out.println("8. Jual Hasil Panen");
            System.out.println("9. Ubah Cuaca");
            System.out.println("10. Memberantas Hama");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pemain.tanam(new Jagung(), lahan);
                    break;
                case 2:
                    pemain.tanam(new Padi(), lahan);
                    break;
                case 3:
                    lahan.menyiram();
                    break;
                case 4:
                    lahan.memupuk();
                    break;
                case 5:
                    pemain.istirahat();
                    break;
                case 6:
                    lahan.cekLahan();
                    break;
                case 7:
                    System.out.print("Masukkan nama barang: ");
                    scanner.nextLine(); 
                    String barang = scanner.nextLine();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();
                    toko.beliBarang(barang, jumlah, pemain);
                    break;
                case 8:
                    System.out.print("Masukkan nama tanaman yang akan dijual: ");
                    scanner.nextLine(); 
                    String namaTanaman = scanner.nextLine();
                    for (Tanaman t : lahan.getTanaman()) {
                        if (t.getNama().equalsIgnoreCase(namaTanaman) && t.isStatusPanen()) {
                            t.panen();
                            toko.jualHasilPanen(t, pemain);
                        }
                    }
                    break;
                case 9:
                    System.out.println("Pilih cuaca:");
                    System.out.println("1. Cerah");
                    System.out.println("2. Hujan");
                    System.out.println("3. Panas");
                    int pilihanCuaca = scanner.nextInt();

                    switch (pilihanCuaca) {
                        case 1:
                            cuaca = JenisCuaca.CERAH;
                            System.out.println("Cuaca diubah menjadi Cerah.");
                            break;
                        case 2:
                            cuaca = JenisCuaca.HUJAN;
                            System.out.println("Cuaca diubah menjadi Hujan.");
                            break;
                        case 3:
                            cuaca = JenisCuaca.PANAS;
                            System.out.println("Cuaca diubah menjadi Panas.");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 10: 
                    System.out.println("Memberantas hama di tanaman:");
                    lahan.cekLahan(); // Tampilkan tanaman yang ada
                    System.out.print("Masukkan nama tanaman yang akan diberantas hama: ");
                    scanner.nextLine(); 
                    String namaTanamanHama = scanner.nextLine();
                    for (Tanaman t : lahan.getTanaman()) {
                        if (t.getNama().equalsIgnoreCase(namaTanamanHama)) {
                            t.terkenaHama(); // Memanggil metode terkenaHama
                            break;
                        }
                    }
                    break;
                case 0:
                    gameBerjalan = false;
                    System.out.println("Keluar dari permainan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}