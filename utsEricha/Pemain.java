import java.util.ArrayList;
import java.util.List;

public class Pemain {
    private int uang;
    private int energi;
    private List<String> inventori;

    public Pemain() {
        this.uang = 500; // Uang awal
        this.energi = 100; // Energi awal
        this.inventori = new ArrayList<>();
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public List<String> getInventori() {
        return inventori;
    }

    public void gunakanEnergi(int jumlah) {
        energi -= jumlah;
        System.out.println("Energi sekarang: " + energi);
    }
}
