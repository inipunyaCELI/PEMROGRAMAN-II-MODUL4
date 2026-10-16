package PRAK402_2510817120019_GtQowitaCeliaA;

public class HewanPeliharaan {
    protected String nama;
    protected String ras;

    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
