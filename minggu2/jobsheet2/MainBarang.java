public class MainBarang {
    public static void main(String[] args) {
        BarangTugas barang1 = new BarangTugas();

        barang1.kode = "B0102";
        barang1.namaBarang = "Pensil";
        barang1.hargaDasar = 5000;
        barang1.diskon = 10.0f;

        barang1.tampilData();
    }
}
