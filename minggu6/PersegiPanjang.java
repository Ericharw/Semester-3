public class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    float luas() {
        return panjang * lebar;
    }

    float keliling() {
        return 2 * (panjang + lebar);
    }
}
