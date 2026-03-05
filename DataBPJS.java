public class DataBPJS {

    private String namaAnak;
    private String nomorBPJS;
    private double beratBadan;
    private double tinggiBadan;

    public void setNamaAnak(String namaAnak) {
        this.namaAnak = namaAnak;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public void setNomorBPJS(String nomorBPJS) {
        this.nomorBPJS = nomorBPJS;
    }

    public String getNomorBPJS() {
        return nomorBPJS;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }
}