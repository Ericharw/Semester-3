public class PelangganTugas {
    private String nama;
    private String id;

    public PelangganTugas(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String info() {
        return "Nama: " + nama + "\nID: " + id + "\n";
    }
}
