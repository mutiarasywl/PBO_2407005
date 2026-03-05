import java.util.Scanner;

class Bangunan {

    private String namaBangunan;

    public void setNamaBangunan(String namaBangunan) {
        this.namaBangunan = namaBangunan;
    }

    public String getNamaBangunan() {
        return namaBangunan;
    }

    // PERSEGI
    public double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    public double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // PERSEGI PANJANG
    public double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    // LINGKARAN
    public double luasLingkaran(double jari) {
        return 3.14 * jari * jari;
    }

    public double kelilingLingkaran(double jari) {
        return 2 * 3.14 * jari;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bangunan bangunan = new Bangunan();

        System.out.println("=== DATA PERUMAHAN ===");
        System.out.print("Masukkan Nama Bangunan: ");
        bangunan.setNamaBangunan(input.nextLine());

        System.out.println("\n=== PILIH BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Pilihan (1-3): ");
        int pilihan = input.nextInt();

        System.out.println("\nNama Bangunan: " + bangunan.getNamaBangunan());

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan Sisi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi      : " + bangunan.luasPersegi(sisi));
                System.out.println("Keliling Persegi  : " + bangunan.kelilingPersegi(sisi));
                break;

            case 2:
                System.out.print("Masukkan Panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan Lebar: ");
                double lebar = input.nextDouble();
                System.out.println("Luas Persegi Panjang     : " + bangunan.luasPersegiPanjang(panjang, lebar));
                System.out.println("Keliling Persegi Panjang : " + bangunan.kelilingPersegiPanjang(panjang, lebar));
                break;

            case 3:
                System.out.print("Masukkan Jari-jari: ");
                double jari = input.nextDouble();
                System.out.println("Luas Lingkaran     : " + bangunan.luasLingkaran(jari));
                System.out.println("Keliling Lingkaran : " + bangunan.kelilingLingkaran(jari));
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}