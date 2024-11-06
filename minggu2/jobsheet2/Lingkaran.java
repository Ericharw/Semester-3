public class Lingkaran {
    double r, phi=3.14;
    
    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

    public void tampilkanData() {
        System.out.println("Jari-jari: " + r);
        System.out.println("Luas Lingkaran: " + hitungLuas());
        System.out.println("Keliling Lingkaran: " + hitungKeliling());
    }
}
