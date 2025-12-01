package PraktikumDaspro.jobsheet11;

import java.util.Scanner;
public class NilaiMahasiswa09 {
    public static void isianArray(int[] dataNilai, Scanner sc ) {
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + ": ");
            dataNilai[i] = sc.nextInt();
        }
    }
    public static void tampilArray(int[] dataNIlai) {
        System.out.println("\nDaftar nilai mahasiswa: ");
        for (int i = 0; i < dataNIlai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + dataNIlai[i]);
        }
    }
    public static int hitTot(int[] dataNilai) {
        int total = 0;
        for (int n : dataNilai) {
            total += n;  
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa, sc);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
        sc.close();
    }
}
