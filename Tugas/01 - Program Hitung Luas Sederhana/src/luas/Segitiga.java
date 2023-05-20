package luas;

public class Segitiga extends BangunDatar {
    private String nama;
    private double luas;
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.nama = "Segitiga";
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void hitungLuas() {
        luas = (alas*tinggi)/2;
    }

    public void tampilkanLuas() {
        System.out.println("Luas " + this.getNama() + " = " + this.luas);
    }
}
