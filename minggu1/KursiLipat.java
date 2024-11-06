public class KursiLipat extends Kursi{ 
    boolean bisaDilipat;

    public void lipat() {
        if(bisaDilipat) {
            System.out.println("Kursi lipat");
        }else {
            System.out.println("Kursi tidak bisa dilipat");
        }
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Bisa dilipat : " + bisaDilipat);
    }
}
