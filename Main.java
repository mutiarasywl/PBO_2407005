import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DataBPJS data = new DataBPJS();

        System.out.println("=== INPUT DATA BPJS ===");

        System.out.print("Nama Anak: ");
        data.setNamaAnak(input.nextLine());

        System.out.print("Nomor BPJS: ");
        data.setNomorBPJS(input.nextLine());

        System.out.print("Berat Badan (kg): ");
        data.setBeratBadan(input.nextDouble());

        System.out.print("Tinggi Badan (cm): ");
        data.setTinggiBadan(input.nextDouble());

        System.out.println("\n=== HASIL DATA ===");
        System.out.println("Nama: " + data.getNamaAnak());
        System.out.println("BPJS: " + data.getNomorBPJS());
        System.out.println("BMI : " + data.hitungBMI());

        input.close();
    }
}