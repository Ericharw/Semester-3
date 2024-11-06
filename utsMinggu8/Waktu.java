public class Waktu {
    private int hari;
    private String musim;

    public Waktu() {
        this.hari = 1;
        this.musim = "Musim Panas";
    }

    public int getHari() {
        return hari;
    }

    public String getMusim() {
        return musim;
    }

    private void ubahMusim() {
        if (musim.equals("Musim Panas")) {
            musim = "Musim Hujan";
        } else {
            musim = "Musim Panas";
        }
        System.out.println("Musim telah berganti menjadi " + musim);
    }

    public void hariBerganti() {
        hari++;
        System.out.println("Hari ke-" + hari + " di " + musim);
        if (hari % 30 == 0) {
            ubahMusim();
        }
    }
}