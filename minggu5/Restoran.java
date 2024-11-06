import java.util.ArrayList;
import java.util.List;

public class Restoran {
    private List<Menu> daftarMenu;

    public Restoran() {
        this.daftarMenu = new ArrayList<>();
    }

    public List<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public void setDaftarMenu(List<Menu> daftarMenu) {
        this.daftarMenu = daftarMenu;
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public String infoMenu() {
        StringBuilder info = new StringBuilder();
        info.append("Daftar Menu Restoran:\n");
        for (Menu m : daftarMenu) {
            info.append(m.info());
        }
        return info.toString();
    }
}
