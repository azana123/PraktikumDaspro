package PraktikumDaspro.jobsheet11;

import java.util.Scanner;

public class Kafe09 {

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan);

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapat diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapat diskon 30%");
        } else {
            System.out.println("Kode promo tidak tersedia");
        }

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("0. Selesai Memesan");
        System.out.println("===========================\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu("Andri", true, "DISKON50");

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("Masukkan nomor menu (0 jika selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;  
            }

            System.out.print("Masukkan jumlah pesanan: ");
            int jumlah = sc.nextInt();
            int totalSementara = hitungTotalHarga09(pilihanMenu, jumlah);
            totalKeseluruhan += totalSementara;

            System.out.println("Subtotal menu ini: Rp" + totalSementara);
            System.out.println();
        }

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();
        int totalSetelahDiskon = hitungDiskon(totalKeseluruhan, kodePromo);

        System.out.println("\n====================================");
        System.out.println("Total sebelum diskon : Rp" + totalKeseluruhan);
        System.out.println("Total akhir           : Rp" + totalSetelahDiskon);
        System.out.println("====================================");
    }
    public static int hitungTotalHarga09(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static int hitungDiskon(int totalHarga, String kodePromo) {
        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = totalHarga * 0.50;
            System.out.println("Diskon 50%: Rp" + (int) diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = totalHarga * 0.30;
            System.out.println("Diskon 30%: Rp" + (int) diskon);
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }

        return (int) (totalHarga - diskon);
    }
}
