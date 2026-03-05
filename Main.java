import java.util.Scanner;

class Kalkulator {

    double angka1;
    double angka2;

    // Constructor
    Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    double tambah() {
        return angka1 + angka2;
    }

    double kurang() {
        return angka1 - angka2;
    }

    double kali() {
        return angka1 * angka2;
    }

    double bagi() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Tidak bisa dibagi 0!");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        Kalkulator k = new Kalkulator(a, b);

        System.out.println("Pilih operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + k.tambah());
                break;
            case 2:
                System.out.println("Hasil: " + k.kurang());
                break;
            case 3:
                System.out.println("Hasil: " + k.kali());
                break;
            case 4:
                System.out.println("Hasil: " + k.bagi());
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}