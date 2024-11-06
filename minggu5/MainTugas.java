public class MainTugas {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();

        restoran.tambahMenu(new Menu("Nasi Goreng", 25000, "Makanan"));
        restoran.tambahMenu(new Menu("Ayam Penyet", 30000, "Makanan"));
        restoran.tambahMenu(new Menu("Es Teh", 5000, "Minuman"));

        System.out.println(restoran.infoMenu());

        PelangganTugas pelanggan = new PelangganTugas("Budi", "P001");
        Pesanan pesanan = new Pesanan(pelanggan);
        pesanan.tambahMenu(new Menu("Nasi Goreng", 25000, "Makanan"));
        pesanan.tambahMenu(new Menu("Es Teh", 5000, "Minuman"));
        System.out.println("\n" + pesanan.info());
    }
}
