package luas;

public class Persegi extends BangunDatar {
    private String nama;
    private double sisi;
    private double luas;

    public Persegi(double sisi) {
        this.nama = "Persegi";
        this.sisi = sisi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
    }

    public void tampilkanLuas() {
        System.out.println("Luas " + this.getNama() + " = " + this.luas);
    }
}
