package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- Cetak KRD SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = (uktLunas)
                ? "Pembayaran UKT terverifikasi.\nSilakan cetak KRS dan minta tanda tangan DPA."
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";

        System.out.println(pesan);

        sc.close();
        }
    }

