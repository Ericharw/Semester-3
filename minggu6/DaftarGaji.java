public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int size) {
        listPegawai = new Pegawai[size];
        count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        } else {
            System.out.println("Daftar pegawai sudah penuh!");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama: " + pegawai.getNama() + ", Gaji: " + pegawai.getGaji());
        }
    }
}
