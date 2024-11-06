public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public void setTARIF_SKS(int tarif) {
        this.TARIF_SKS = tarif;
    }

    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
