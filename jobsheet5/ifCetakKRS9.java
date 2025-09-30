package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- Cetak KRD SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

            sc.close();
        }
    }
}
