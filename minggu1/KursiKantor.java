public class KursiKantor extends Kursi {
    boolean adaRoda;

    public void geser() {
        if (adaRoda) {
            System.out.println("Kursi kantor roda");
        }else {
            System.out.println("Kursi kantor tidak memiliki roda");
        }
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Ada Roda : " + adaRoda);
    }
}
