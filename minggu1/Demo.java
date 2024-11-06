public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.merk = "Lenovo";
        laptop.ukuranLayar = 15;
        laptop.hidupkan();
        laptop.cetakInformasi();

        Smartphone smartphone = new Smartphone();
        smartphone.merk = "iPhone";
        smartphone.kapasitasBaterai = 5000;
        smartphone.hidupkan();
        smartphone.cetakInformasi();

        KursiKantor kursiKantor = new KursiKantor();
        kursiKantor.material = "Kulit";
        kursiKantor.adaSandaran = true;
        kursiKantor.adaRoda = true;
        kursiKantor.duduki();
        kursiKantor.geser();
        kursiKantor.cetakInformasi();

        KursiLipat kursiLipat = new KursiLipat();
        kursiLipat.material = "Kain";
        kursiLipat.adaSandaran = false;
        kursiLipat.bisaDilipat = true;
        kursiLipat.duduki();
        kursiLipat.lipat();
        kursiLipat.cetakInformasi();

        KursiPlastik kursiPlastik = new KursiPlastik("Biru", true);
        kursiPlastik.material = "Plastik";
        kursiPlastik.adaSandaran = false;
        kursiPlastik.duduki();
        kursiPlastik.cetakInformasi();
    }
}
