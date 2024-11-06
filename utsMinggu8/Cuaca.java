import java.util.Random;

public class Cuaca {
    private String[] jenisCuaca = {"Cerah", "Hujan", "Berawan", "Badai"};
    private String cuacaSaatIni;
    
    public Cuaca() {
        ubahCuaca(); // Ubah cuaca saat ini ketika objek dibuat
    }

    public void ubahCuaca() {
        Random random = new Random();
        cuacaSaatIni = jenisCuaca[random.nextInt(jenisCuaca.length)];
    }

    public double faktorCuaca() {
        switch (cuacaSaatIni) {
            case "Cerah":
                return 1.0; // Tanaman tumbuh dengan baik
            case "Hujan":
                return 0.8; // Tanaman tumbuh sedikit lebih lambat
            case "Berawan":
                return 0.9; // Tanaman tumbuh dengan kecepatan normal
            case "Badai":
                return 0.5; // Tanaman tumbuh sangat lambat
            default:
                return 1.0;
        }
    }

    public String getCuacaSaatIni() {
        return cuacaSaatIni;
    }
}
