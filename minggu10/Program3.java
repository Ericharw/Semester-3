public class Program3 {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakRektor.beriSertifikatMawapresNasional(masterCumlaude);
        
        pakRektor.beriSertifikatMawapresInternasional(masterCumlaude);
    }
}