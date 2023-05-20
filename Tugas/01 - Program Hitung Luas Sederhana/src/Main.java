import java.util.Scanner;
import luas.*;
import util.Clearscreen;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        Clearscreen clearscreen = new Clearscreen();
        
        int pilihan;

        clearscreen.cls();
        System.out.println("---------------------------------------------");
        System.out.println("           HITUNG LUAS BANGUN DATAR          ");
        System.out.println("---------------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("---------------------------------------------");
        System.out.print("Pilihan: ");
        pilihan = input.nextInt();

        System.out.println();

        if(pilihan == 1){
            double sisi;

            clearscreen.cls();
            System.out.println("---------------------------------------------");
            System.out.println("              HITUNG LUAS PERSEGI            ");
            System.out.println("---------------------------------------------");
            System.out.print("Masukkan besar sisi : ");
            sisi = input.nextDouble();
            Persegi persegi = new Persegi(sisi);
            persegi.hitungLuas();
            persegi.tampilkanLuas();
            System.out.println("---------------------------------------------");
        }
        else if(pilihan == 2) {
            double panjang, lebar;

            clearscreen.cls();
            System.out.println("---------------------------------------------");
            System.out.println("          HITUNG LUAS PERSEGI PANJANG        ");
            System.out.println("---------------------------------------------");
            System.out.print("Masukkan besar panjang : ");
            panjang = input.nextDouble();
            System.out.print("Masukkan besar lebar   : ");
            lebar = input.nextDouble();
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            persegiPanjang.hitungLuas();
            persegiPanjang.tampilkanLuas();
            System.out.println("---------------------------------------------");
        }
        else if(pilihan == 3) {
            double alas, tinggi;

            clearscreen.cls();
            System.out.println("---------------------------------------------");
            System.out.println("             HITUNG LUAS SEGITIGA            ");
            System.out.println("---------------------------------------------");
            System.out.print("Masukkan besar alas   : ");
            alas = input.nextDouble();
            System.out.print("Masukkan besar tinggi : ");
            tinggi = input.nextDouble();
            Segitiga segitiga = new Segitiga(alas, tinggi);
            segitiga.hitungLuas();
            segitiga.tampilkanLuas();
            System.out.println("---------------------------------------------");
        }
        else if(pilihan == 4) {
            double jari_jari;

            clearscreen.cls();
            System.out.println("---------------------------------------------");
            System.out.println("            HITUNG LUAS LINGKARAN            ");
            System.out.println("---------------------------------------------");
            System.out.println("(Catatan: Jari-jari = diameter/2)");
            System.out.print("Masukkan besar jari-jari : ");
            jari_jari = input.nextDouble();
            Lingkaran lingkaran = new Lingkaran(jari_jari);
            lingkaran.hitungLuas();
            lingkaran.tampilkanLuas();
            System.out.println("---------------------------------------------");
        }

        System.out.println();
    }
}
