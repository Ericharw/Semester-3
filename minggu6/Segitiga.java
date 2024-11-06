public class Segitiga extends BangunDatar {
    float alas, tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float luas() {
        return (alas * tinggi) / 2;
    }

    float keliling() {
        float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}
