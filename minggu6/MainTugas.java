public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10); 

        Dosen dosen1 = new Dosen("123456", "Ericha", "Jl. Contoh No. 1");
        dosen1.setSKS(5);
        dosen1.setTARIF_SKS(150000); 

        Dosen dosen2 = new Dosen("654321", "Wardani", "Jl. Contoh No. 2");
        dosen2.setSKS(3);
        dosen2.setTARIF_SKS(150000); 

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
