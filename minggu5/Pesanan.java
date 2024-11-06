import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private PelangganTugas pelanggan;
    private List<Menu> menu;
    private double totalHarga;

    public Pesanan(PelangganTugas pelanggan) {
        this.pelanggan = pelanggan;
        this.menu = new ArrayList<>();
        this.totalHarga = 0;
    }

    public PelangganTugas getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(PelangganTugas pelanggan) {
        this.pelanggan = pelanggan;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void tambahMenu(Menu menu) {
        this.menu.add(menu);
        this.totalHarga += menu.getHarga(); 
    }

    public String info() {
        StringBuilder info = new StringBuilder();
        info.append("Pesanan untuk:\n").append(pelanggan.info()).append("Daftar Menu:\n");
        for (Menu m : menu) {
            info.append(m.info());
        }
        info.append("Total Harga: Rp").append(totalHarga).append("\n");
        return info.toString();
    }
}
