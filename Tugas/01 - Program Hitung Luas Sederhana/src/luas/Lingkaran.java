package luas;

public class Lingkaran extends BangunDatar {
    private String nama;
    private double jari_jari;
    private double luas;
    private final double phi = 3.14159265358979323846;

    public Lingkaran(double jari_jari) {
        this.nama = "Lingkaran";
        this.jari_jari = jari_jari;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void hitungLuas() {
        luas = phi * jari_jari * jari_jari;
    }

    public void tampilkanLuas() {
        System.out.println("Luas " + this.getNama() + " = " + this.luas);
    }
}
