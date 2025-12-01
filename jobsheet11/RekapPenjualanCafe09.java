package PraktikumDaspro.jobsheet11;
import java.util.Scanner;

public class RekapPenjualanCafe09 {

    Scanner sc = new Scanner(System.in);
    
    String[] menu;
    int[][] penjualan;
    int  jumlahMenu, jumlahHari;

    public void inputUkuran() { //ukuran tabel
        System.out.print("Masukan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukan jumlah hari: ");
        jumlahHari = sc.nextInt();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];
    }

    public void inputData() { //input data
        System.out.println("==== Masukan Menu ====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu- " + (i + 1) + " ");
            menu[i] = sc.next();
        }

        System.out.println("==== Masukan Penjualan Menu ====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println(); 
        }
    }

    public void tampikanTabel() { //menampilkan tabel
        System.out.println("==== Tabel Penjualan ====");

        System.out.printf("%-15s", "Menu");
        for (int h = 0; h < jumlahHari; h++) {
            System.out.printf("day%d\t", h+1);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%d\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }
    
    public void menuTertinggi() { //mencari menu dengan penjualan tertinggi
        int max = -1;
        int x = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > max) {
                max = total;
                x = i;
            }
        }
        
        System.out.println("==== Menu dengan penjualan tertinggi ====");
        System.out.println("Menu: " + menu[x]);
        System.out.println("total: " + max);
    }
    
    public void rata2() { //hitung rata rata penjualan per menu
        System.out.println("==== Rata-rata Penjualan Setiap Menu ====");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata2 = total * 1.0 / jumlahHari;
            System.out.println(menu[i] + ": " + rata2);
        }
    }
    public static void main(String[] args) {
        RekapPenjualanCafe09 app = new RekapPenjualanCafe09();

        app.inputUkuran();
        app.inputData();
        app.tampikanTabel();
        app.menuTertinggi();
        app.rata2();
    }
}
    
