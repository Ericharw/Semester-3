public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "Mr. Krab");
        Penumpang budi = new Penumpang("67890", "Budi");

        Gerbong gerbong = new Gerbong("A", 10);
        
        gerbong.setPenumpang(p1, 1); 
        gerbong.setPenumpang(budi, 1); 
        
        System.out.println(gerbong.info());
    }
}
