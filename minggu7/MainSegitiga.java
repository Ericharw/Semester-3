public class MainSegitiga {
  public static void main(String[] args) {
    Segitiga segitiga = new Segitiga();
    segitiga.setSudut(60);
    System.out.println("Sudut: " + segitiga.getSudut());
    System.out.println("Total sudut (sudutA = 60): " + segitiga.totalSudut(60));
    System.out.println("Total sudut (sudutA = 60, sudutB = 40): " + segitiga.totalSudut(60, 40));
    System.out.println("Keliling (sisiA = 3, sisiB = 4, sisiC = 5): " + segitiga.keliling(3, 4, 5));
    System.out.println("Keliling (sisiA = 3, sisiB = 4): " + segitiga.keliling(3, 4));
  }
}