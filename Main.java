package latihan_pbo2;

public class Main {

    static class Cafe {

        private String nama;
        private String alamat;
        private double panjang;
        private double lebar;

        public Cafe(String nama, String alamat, double panjang, double lebar) {
            this.nama = nama;
            this.alamat = alamat;
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public double hitungLuas() {
            return panjang * lebar;
        }

        public double hitungKeliling() {
            return 2 * (panjang + lebar);
        }

        public void tampilkanInfo() {
            System.out.println("Nama Cafe   : " + nama);
            System.out.println("Alamat      : " + alamat);
            System.out.println("Panjang     : " + panjang);
            System.out.println("Lebar       : " + lebar);
            System.out.println("Luas        : " + hitungLuas() + " m2");
            System.out.println("Keliling    : " + hitungKeliling() + " m");
            System.out.println("===========================");
        }
    }

    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Cafe Senja", "Indramayu", 15, 10);

        cafe1.tampilkanInfo();
    }
}
