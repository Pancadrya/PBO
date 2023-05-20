package luas;

public class PersegiPanjang extends BangunDatar {
    private String nama;
    private double luas;
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.nama = "Persegi panjang";
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void hitungLuas() {
        luas = panjang * lebar;
    }

    public void tampilkanLuas() {
        System.out.println("Luas " + this.getNama() + " = " + this.luas);
    }
}
