import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AnggotaKtp donny = new AnggotaKtp("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());

        System.out.println("\nMasukkan jumlah pinjaman yang Anda inginkan : ");
        float jumlahPinjaman = sc.nextFloat();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        float jumlahAngsuran = sc.nextFloat();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman yang ingin diajukan: ");
        jumlahPinjaman = sc.nextFloat();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        jumlahAngsuran = sc.nextFloat();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        sc.close();
    }
}