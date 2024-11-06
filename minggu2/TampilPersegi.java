import java.util.Scanner;

public class TampilPersegi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();

        Persegi persegi = new Persegi(sisi);
        persegi.dataPersegi();

        int luas = persegi.luasPersegi();
        System.out.println("Luas persegi: " + luas);

        int keliling = persegi.kelilingPersegi();
        System.out.println("Keliling persegi: " + keliling);

        sc.close();

    }
    
}
