import java.util.Scanner;

class Cafe {
    String namaCafe;
    double sisiRuangan;
    double panjangParkir;
    double lebarParkir;
    double jariMeja;

    public double luasRuangan() {
        return sisiRuangan * sisiRuangan;
    }

    public double luasParkir() {
        return panjangParkir * lebarParkir;
    }

    public double luasMeja() {
        return 3.14 * jariMeja * jariMeja;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cafe cafe = new Cafe();

        System.out.println("=== PROMO GRAND OPENING CAFE ===");

        System.out.print("Masukkan Nama Cafe: ");
        cafe.namaCafe = input.nextLine();

        System.out.print("Masukkan Sisi Ruangan (m): ");
        cafe.sisiRuangan = input.nextDouble();

        System.out.print("Masukkan Panjang Area Parkir (m): ");
        cafe.panjangParkir = input.nextDouble();

        System.out.print("Masukkan Lebar Area Parkir (m): ");
        cafe.lebarParkir = input.nextDouble();

        System.out.print("Masukkan Jari-jari Meja Bundar (m): ");
        cafe.jariMeja = input.nextDouble();

        System.out.println("\n===== IKLAN CAFE =====");
        System.out.println("Selamat Datang di " + cafe.namaCafe + " ☕");
        System.out.println("Cafe kami memiliki:");
        System.out.println("- Luas Ruangan Indoor : " + cafe.luasRuangan() + " m2");
        System.out.println("- Luas Area Parkir    : " + cafe.luasParkir() + " m2");
        System.out.println("- Luas Meja Bundar    : " + cafe.luasMeja() + " m2");
        System.out.println("\nNikmati suasana nyaman dan tempat luas bersama teman & keluarga!");
        System.out.println("GRAND OPENING DISKON 20% 🎉");

        input.close();
    }
}