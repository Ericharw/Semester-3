import java.util.List;

public class Toko {
    public void beliBarang(String barang, int jumlah, Pemain pemain) {
        int harga = 100 * jumlah; // Misal harga setiap barang adalah 100
        if (pemain.getUang() >= harga) {
            pemain.setUang(pemain.getUang() - harga);
            pemain.getInventori().add(barang);
            System.out.println("Membeli " + jumlah + " " + barang + " seharga " + harga + ". Sisa uang: " + pemain.getUang());
        } else {
            System.out.println("Uang tidak cukup untuk membeli " + barang);
        }
    }

    public void jualHasilPanen(Tanaman tanaman, Pemain pemain) {
        int harga = 200; // Misal setiap tanaman dihargai 200
        pemain.setUang(pemain.getUang() + harga);
        System.out.println("Menjual " + tanaman.getNama() + " seharga " + harga + ". Total uang sekarang: " + pemain.getUang());
    }
}
