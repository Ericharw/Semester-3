public class Mobil {
    int kapasitas;

    public Mobil(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void loadingPenumpang() {
        System.out.println("Mobil dengan kapasitas " + kapasitas + " sedang memuat penumpang");
    }
}
