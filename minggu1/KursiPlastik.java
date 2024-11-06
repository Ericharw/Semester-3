public class KursiPlastik extends Kursi{
    String warna;
    boolean tahanAir;

    public  KursiPlastik(String warna, boolean tahanAir) {
        this.warna = warna;
        this.tahanAir = tahanAir;
    }

    public void cekTahanAir() {
        if (tahanAir) {
            System.out.println("Kursi plastik ini tahan air.");
        } else {
            System.out.println("Kursi plastik ini tidak tahan air.");
        }
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Warna: " + warna);
        cekTahanAir();
    }
}
