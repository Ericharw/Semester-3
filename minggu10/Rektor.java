public class Rektor {
    public void beriSertifikatMawapresNasional(PascaSarjana mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisiNasional();
        mahasiswa.menerbitkanArtikelNasional();
        
        System.out.println("--------------------------------------------------------");
    }
    
    public void beriSertifikatMawapresInternasional(PascaSarjana mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------------------");
    }
}