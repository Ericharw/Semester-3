public class AnggotaKtp {
    private String nomorKTP;
    private String nama;
    private float limitPeminjaman;
    private float jumlahPinjaman;

    public AnggotaKtp(String nomorKTP, String nama, float limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0; 
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public void setLimitPeminjaman(float limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlah + jumlahPinjaman > limitPeminjaman) {
            System.out.println("Pinjaman melebihi limit peminjaman. Tidak bisa meminjam Rp" + jumlah);
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Pinjaman berhasil sebesar Rp" + jumlah);
        }
    }

    public void angsur(double jumlah) {
        double minimalAngsuran = jumlahPinjaman * 0.10; 
        if (jumlah < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman. Mengangsur Rp" + jumlah);
            jumlahPinjaman = 0; 
        } else {
            jumlahPinjaman -= jumlah;
            System.out.println("Angsuran berhasil sebesar Rp" + jumlah);
        }
    }
}