import java.util.ArrayList;
import java.util.List;

public class Pemain {
    private int uang;
    private int energi;
    private List<String> inventori;

    public Pemain() {
        this.uang = 1000;
        this.energi = 100;
        this.inventori = new ArrayList<>();
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getEnergi() {
        return energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }

    public List<String> getInventori() {
        return inventori;
    }

    public void tanam(Tanaman tanaman, Lahan lahan) {
        if (energi >= 10) {
            lahan.menanam(tanaman);
            energi -= 10;
            System.out.println("Menanam " + tanaman.getNama() + ". Energi tersisa: " + energi);
        } else {
            System.out.println("Energi tidak cukup untuk menanam.");
        }
    }

    public void istirahat() {
        energi = 100;
        System.out.println("Istirahat sejenak, energi pulih menjadi 100.");
    }
}