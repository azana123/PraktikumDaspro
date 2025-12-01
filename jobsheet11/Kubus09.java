package PraktikumDaspro.jobsheet11;

import java.util.Scanner;
public class Kubus09 {

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sisi: ");
        double sisi = sc.nextDouble();

        double luasPermukaan = hitungLuasPermukaan(sisi);
        double volume = hitungVolume(sisi);

        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
        sc.close();
    }
}
