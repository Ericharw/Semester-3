public class Sarjana extends Mahasiswa implements ICumlaude {
    public Sarjana(String nama) {
        super(nama);
    }

    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
}
