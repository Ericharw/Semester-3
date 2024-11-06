public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Ericha";
        mhs2.alamat = "Blitar";
        mhs2.kelas = "2A";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 102;
        mhs3.nama = "Wardani";
        mhs3.alamat = "Surabaya";
        mhs3.kelas = "2B";
        mhs3.tampilBiodata();
    }
}
