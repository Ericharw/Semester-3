public class Lingkaran extends BangunDatar {
    float r;

    Lingkaran(float r) {
        this.r = r;
    }
    
    float luas() {
        return (float) (Math.PI * r * r);
    }

    float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
