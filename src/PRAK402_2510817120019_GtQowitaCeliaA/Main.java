package PRAK402_2510817120019_GtQowitaCeliaA;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Anggora", "lolo", "abu-abu");
        kucing.displayDetailKucing();

        System.out.println();

        String[] kemampuanAnjing = {"berenang", "berjabat", "tangan", "melompat"};
        Anjing anjing = new Anjing("andi", "cihuahua", "putih", kemampuanAnjing);
        anjing.displayDetailAnjing();
    }
}
