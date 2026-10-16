package PRAK402_2510817120019_GtQowitaCeliaA;

public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : ");
        for (int i = 0; i < kemampuan.length; i++) {
            if (i < kemampuan.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

