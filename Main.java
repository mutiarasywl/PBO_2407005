class Cafe {
    String nama;
    String alamat;

    // Constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama cafenya adalah : " + nama);
        System.out.println("Alamatnya di : " + alamat);
        System.out.println("====================");
    }

    // Method
    void buka() {
        System.out.println("Cafe Sudah Buka");
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Kenangan", "IMKOT");
        Cafe cafe2 = new Cafe("Janji Jiwa", "Cirebon");
        Cafe cafe3 = new Cafe("Kopi", "Indramayu");

        cafe1.buka();
        cafe2.buka();
        cafe3.buka();
    }
}