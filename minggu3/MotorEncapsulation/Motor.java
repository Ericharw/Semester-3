public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private final int kecepatanMaksimal = 100;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < kecepatanMaksimal) {
                kecepatan += 5;
                if (kecepatan > kecepatanMaksimal) {
                    kecepatan = kecepatanMaksimal;
                }
            } else {
                System.out.println("Kecepatan sudah mencapai batas maksimal! \n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
