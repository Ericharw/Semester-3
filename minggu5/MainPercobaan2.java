public class MainPercobaan2 {
    public static void main(String[] args) {
        
        Mobil m = new Mobil("Avanza", "Toyota", 350000);  // Tambahkan merk di sini
        Sopir s = new Sopir("John Doe", 200000);
        Pelanggan p = new Pelanggan("Jane Doe", m, s, 5); 
        
        Penyewaan penyewaan = new Penyewaan(p);
        penyewaan.prosesPenyewaan();

        int totalBiaya = p.hitungBiayaTotal();
        System.out.println("Total Biaya Penyewaan: Rp" + totalBiaya);

        System.out.println("Merk Mobil yang Disewa: " + p.getMobil().getMerk());  // Akan menampilkan 'Toyota'
    }
}


