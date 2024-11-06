public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;

    public void setTipeSuspansi(String newValue) {
        tipeSuspensi = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspansi: " + tipeSuspensi);
    }
}
