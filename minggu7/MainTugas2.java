public class MainTugas2 {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        m1.makan();
        m1.bernapas();

        Manusia m2 = new Mahasiswa();
        m2.makan();
        m2.bernapas();
    } 
}
